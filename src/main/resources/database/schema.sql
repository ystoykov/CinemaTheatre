DROP TABLE IF EXISTS "movies" CASCADE;

CREATE TABLE "movies" (
    "id"                BIGSERIAL NOT NULL,
    "name"              varchar(128) NOT NULL,
    "release_year"      int2 NOT NULL,
    "duration"          time NOT NULL,
    "premiere_date"     date NOT NULL,
    "final_date"        date NOT NULL,
    "description"       varchar(2048),
    "poster_addr"       varchar(1024),
    PRIMARY KEY("id")
);

DROP TABLE IF EXISTS "sessions" CASCADE;

CREATE TABLE "sessions" (
    "id"            BIGSERIAL NOT NULL,
    "movie_id"      int8 NOT NULL,
    "hall_id"       int8 NOT NULL,
    "date"          time with time zone,
    PRIMARY KEY("id"),
    CONSTRAINT "movie_id" FOREIGN KEY ("movie_id")
        REFERENCES "movies"("id"),
    CONSTRAINT "hall_id" FOREIGN KEY ("hall_id")
        REFERENCES "halls"("id")
);
DROP TABLE IF EXISTS "halls" CASCADE;

CREATE TABLE "halls" (
    "id"                BIGSERIAL NOT NULL,
    "name"              varchar(64) NOT NULL,
    "standart_row"      int2 NOT NULL,
    "standart_seats"    int2 NOT NULL,
    "lux_row"           int2 DEFAULT 1,
    "lux_seats"         int2 NOT NULL,
    "isOpen"            bool DEFAULT True,
    PRIMARY KEY("id")
);
DROP TABLE IF EXISTS "seat" CASCADE;

CREATE TABLE "seat" (
    "id"                BIGSERIAL NOT NULL,
    "hall_id"           int8 NOT NULL,
    "row_number"        int2 NOT NULL,
    "seat_number"       int2 NOT NULL,
    "default_price"     money,
    PRIMARY KEY("id"),
    CONSTRAINT "hall_id" FOREIGN KEY ("hall_id")
        REFERENCES "halls"("id")
);
DROP TABLE IF EXISTS "tickets" CASCADE;

CREATE TABLE "tickets" (
    "id"                BIGSERIAL NOT NULL,
    "create_date"       date NOT NULL,
    "client_id"         int8 NOT NULL,
    "session_id"        int8 NOT NULL,
    "seat_id"           int8 NOT NULL,
    "isReserve"         bool DEFAULT False,
    "isSold"            bool DEFAULT False,
    "sold_date"         date,
    "isReturn"          bool DEFAULT False,
    "return_date"       date,
    PRIMARY KEY("id"),
    CONSTRAINT "session_id" FOREIGN KEY ("session_id")
        REFERENCES "sessions"("id"),
    CONSTRAINT "client_id" FOREIGN KEY ("client_id")
        REFERENCES "clients"("id"),
    CONSTRAINT "seat_id" FOREIGN KEY ("seat_id")
        REFERENCES "seat"("id")
);
DROP TABLE IF EXISTS "clients" CASCADE;

CREATE TABLE "clients" (
    "id"            BIGSERIAL NOT NULL,
    "first_name"    varchar(64) NOT NULL,
    "surname"       varchar(64) NOT NULL,
    "male"          varchar(8) NOT NULL,
    "discount"      numeric NOT NULL,
    "isAdmin"       bool DEFAULT False,
    PRIMARY KEY("id")
);
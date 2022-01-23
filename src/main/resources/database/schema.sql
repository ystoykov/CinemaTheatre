--DROP TABLE IF EXISTS "movie" CASCADE;

CREATE TABLE "movie" (
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

--DROP TABLE IF EXISTS "show_session" CASCADE;

CREATE TABLE "show_session" (
    "id"            BIGSERIAL NOT NULL,
    "movie_id"      int8 NOT NULL,
    "hall_id"       int8 NOT NULL,
    "date"          time with time zone,
    PRIMARY KEY("id"),
    CONSTRAINT "movie_id" FOREIGN KEY ("movie_id")
        REFERENCES "movie"("id"),
    CONSTRAINT "hall_id" FOREIGN KEY ("hall_id")
        REFERENCES "hall"("id")
);
--DROP TABLE IF EXISTS "hall" CASCADE;

CREATE TABLE "hall" (
    "id"              BIGSERIAL NOT NULL,
    "name"            varchar(64) NOT NULL,
    "rows_num"        int2 NOT NULL,
    "seats_num"       int2 NOT NULL,
    "isOpen"          bool DEFAULT True,
    PRIMARY KEY("id")
);
--DROP TABLE IF EXISTS "seat" CASCADE;

CREATE TABLE "seat" (
    "id"                BIGSERIAL NOT NULL,
    "hall_id"           int8 NOT NULL,
    "row_number"        int2 NOT NULL,
    "seat_number"       int2 NOT NULL,
    "default_price"     money,
    "isLux"             bool,
    PRIMARY KEY("id"),
    CONSTRAINT "hall_id" FOREIGN KEY ("hall_id")
        REFERENCES "hall"("id")
);
DROP TABLE IF EXISTS "ticket" CASCADE;

CREATE TABLE "ticket" (
    "id"                BIGSERIAL NOT NULL,
    "showsession_id"        int8 NOT NULL,
    "seat_id"           int8 NOT NULL,
    "ticket_status"     varchar(32),
    PRIMARY KEY("id"),
    CONSTRAINT "session_id" FOREIGN KEY ("showsession_id")
        REFERENCES "show_session"("id"),
    CONSTRAINT "seat_id" FOREIGN KEY ("seat_id")
        REFERENCES "seat"("id")
);
--DROP TABLE IF EXISTS "client" CASCADE;

CREATE TABLE "client" (
    "id"            BIGSERIAL NOT NULL,
    "first_name"    varchar(64) NOT NULL,
    "surname"       varchar(64) NOT NULL,
    "male"          varchar(8) NOT NULL,
    "discount"      numeric NOT NULL,
    PRIMARY KEY("id")
);
--DROP TABLE IF EXISTS "transaction" CASCADE;

CREATE TABLE "transaction" (
    "id"                BIGSERIAL NOT NULL,
    "client_id"         int8,
    "ticket_id"         int8,
    "transaction_time"  timestamp,
    "transaction_type"  varchar NOT NULL,
    "amount"            money NOT NULL,
    PRIMARY KEY("id"),
    CONSTRAINT "ticket_id" FOREIGN KEY ("ticket_id")
        REFERENCES "ticket"("id"),
    CONSTRAINT "client_id" FOREIGN KEY ("client_id")
        REFERENCES "client"("id")
);
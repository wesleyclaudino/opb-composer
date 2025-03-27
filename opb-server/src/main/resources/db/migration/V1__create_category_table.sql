CREATE EXTENSION IF NOT EXISTS "pgcrypto";

CREATE TABLE IF NOT EXISTS category
(
    id          UUID DEFAULT gen_random_uuid(),
    name        VARCHAR(30) NOT NULL,
    description VARCHAR(300),

    CONSTRAINT pk_category PRIMARY KEY (id)
);
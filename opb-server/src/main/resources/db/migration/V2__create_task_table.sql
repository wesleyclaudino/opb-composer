CREATE EXTENSION IF NOT EXISTS "pgcrypto";

CREATE TABLE IF NOT EXISTS task
(
    id               UUID DEFAULT gen_random_uuid(),
    name             VARCHAR(30) NOT NULL,
    description      VARCHAR(300),
    state            VARCHAR(10),
    creation_date    TIMESTAMP WITHOUT TIME ZONE,
    last_update_date TIMESTAMP WITHOUT TIME ZONE,
    reminder_date    TIMESTAMP WITHOUT TIME ZONE,
    category_id      UUID REFERENCES category (id),

    CONSTRAINT pk_task PRIMARY KEY (id)
);
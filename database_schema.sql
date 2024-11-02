CREATE TABLE IF NOT EXISTS users
(
    id UUID PRIMARY KEY,
    first_name TEXT NOT NULL,
    last_name   TEXT NOT NULL,
    e_mail  TEXT NOT NULL,
    password TEXT NOT NULL
);
CREATE DATABASE jQuizful;
CREATE TYPE gend AS ENUM ('Male', 'Female');
CREATE TABLE IF NOT EXISTS user(
    id INT SERIAL PRIMARY KEY NOT NULL,
    userName CHAR(50) NOT NULL,
    password CHAR(50) NOT NULL,
    email CHAR(50) NOT NULL,
    gender gend NOT NULL
);
INSERT INTO user(userName, password, email, gender) VALUES('user', 'user', 'user@user.com', 'Male');
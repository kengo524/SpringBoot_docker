CREATE DATABASE IF NOT EXISTS sample;

CREATE TABLE users (
  id SERIAL,
  name VARCHAR(255) NOT NULL,
  email VARCHAR(255) NOT NULL,
  PRIMARY KEY (id)
);

INSERT INTO users (
  name,
  email
) values ( 
  'test',
  'test'
);
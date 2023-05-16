
CREATE DATABASE mydatabase;
USE mydatabase;
CREATE TABLE users (
  id INT PRIMARY KEY AUTO_INCREMENT,
  username VARCHAR(50) NOT NULL,
  password VARCHAR(50) NOT NULL
);
INSERT INTO users (username, password) VALUES
  ('user1', 'password1'),
  ('user2', 'password2'),
  ('user3', 'password3'),
  ('user4', 'password4'),
  ('user5', 'password5');

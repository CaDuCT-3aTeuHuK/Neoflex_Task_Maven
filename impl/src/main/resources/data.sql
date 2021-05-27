DROP TABLE IF EXISTS authors;

CREATE TABLE authors (
  id INT AUTO_INCREMENT PRIMARY KEY,
  full_name VARCHAR(250) NOT NULL

);


INSERT INTO authors(id, full_name) VALUES (1, 'Adolf Hitler');
INSERT INTO authors(id, full_name) VALUES (2, 'Iosif Stalin');
INSERT INTO authors(id, full_name) VALUES (3, 'Tolkien');

CREATE TABLE IF NOT EXISTS movies
(
  id SERIAL PRIMARY KEY,
  title VARCHAR(100) NOT NULL,
  year INTEGER,
  genre VARCHAR(20),
  watched BOOLEAN DEFAULT false NOT NULL
)

INSERT INTO movies (title, year, genre, watched) VALUES ('Inception', 2010, 'sci-fi', true);
INSERT INTO movies (title, year, genre, watched) VALUES ('The Lord of the Rings: The Fellowship of the Ring', 2001, 'fantasy', true);
INSERT INTO movies (title, year, genre, watched) VALUES ('Tag', 2018, 'comedy', false);
INSERT INTO movies (title, year, genre, watched) VALUES ('Gunfight at the O.K. Corral', 1957, 'western', false);
INSERT INTO movies (title, year, genre, watched) VALUES ('Die Hard', 1988, 'action', true);

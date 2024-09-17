
INSERT INTO artists (artist_name, genre, album_date) VALUES
                                                         ('The Beatles', 'Rock', 1960),
                                                         ('Taylor Swift', 'Pop', 2006),
                                                         ('Led Zeppelin', 'Rock', 1968);


INSERT INTO album (album_name, release_date, artist_id) VALUES
                                                            ('Abbey Road', '1969-09-26', 1),
                                                            ('1989', '2014-10-27', 2),
                                                            ('Led Zeppelin IV', '1971-11-08', 3);


INSERT INTO media (media_type, genre, release_date, url, album_id) VALUES
                                                                       ('Vinyl', 'Rock', '1969-09-26', 'http://example.com/abbey-road', 1),
                                                                       ('CD', 'Pop', '2014-10-27', 'http://example.com/1989', 2),
                                                                       ('Vinyl', 'Rock', '1971-11-08', 'http://example.com/led-zeppelin-iv', 3);


INSERT INTO users (name, last_name, username, email, password, role, enabled) VALUES
                                                                                  ('John', 'Doe', 'johndoe', 'john@example.com', 'password123', 'ROLE_USER', true),
                                                                                  ('Jane', 'Smith', 'janesmith', 'jane@example.com', 'password123', 'ROLE_ADMIN', true);

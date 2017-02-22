INSERT INTO director (id, name, origin_country, sex) VALUES (1, 'Jon Favreau', 'USA', 'MALE');
INSERT INTO director (id, name, origin_country, sex) VALUES (2, 'Louis Leterrier', 'FRANCE', 'MALE');
INSERT INTO director (id, name, origin_country, sex) VALUES (3, 'Joe Johnston', 'USA', 'MALE');
INSERT INTO director (id, name, origin_country, sex) VALUES (4, 'Alejandro Gonzalez Inarritu', 'MEXICO', 'MALE');
INSERT INTO director (id, name, origin_country, sex) VALUES (5, 'Patty Jenkins', 'USA', 'FEMALE');
INSERT INTO director (id, name, origin_country, sex) VALUES (6, 'Christopher Nolan', 'UK', 'MALE');
INSERT INTO director (id, name, origin_country, sex) VALUES (7, 'Damien Chazelle', 'USA', 'MALE');
INSERT INTO director (id, name, origin_country, sex) VALUES (8, 'Tom Ford', 'USA', 'MALE');
INSERT INTO director (id, name, origin_country, sex) VALUES (9, 'Catalina Mastretta', 'MEXICO', 'FEMALE');

INSERT INTO movie (id, title, origin_country, year, genre, id_director) VALUES (1, 'Iron Man', 'USA', 2008, 'ACTION', 1);
INSERT INTO movie (id, title, origin_country, year, genre, id_director) VALUES (2, 'Iron Man 2', 'USA', 2010, 'ACTION', 1);
INSERT INTO movie (id, title, origin_country, year, genre, id_director) VALUES (3, 'The Jungle Book', 'USA', 2016, 'FANTASY', 1);
INSERT INTO movie (id, title, origin_country, year, genre, id_director) VALUES (4, 'The Incredible Hulk ', 'USA', 2008, 'ACTION', 2);
INSERT INTO movie (id, title, origin_country, year, genre, id_director) VALUES (5, 'Clash of the Titans', 'UK', 2010, 'FANTASY', 2);
INSERT INTO movie (id, title, origin_country, year, genre, id_director) VALUES (6, 'Captain America: The First Avenger', 'USA', 2011, 'ACTION', 3);
INSERT INTO movie (id, title, origin_country, year, genre, id_director) VALUES (7, 'Babel', 'MEXICO', 2006, 'DRAMA', 4);
INSERT INTO movie (id, title, origin_country, year, genre, id_director) VALUES (8, 'Birdman', 'USA', 2014, 'THRILLER', 4);
INSERT INTO movie (id, title, origin_country, year, genre, id_director) VALUES (9, 'The Revenant', 'USA', 2015, 'ADVENTURE', 4);
INSERT INTO movie (id, title, origin_country, year, genre, id_director) VALUES (10, 'Arrested Development', 'USA', 2003, 'COMEDY', 5);
INSERT INTO movie (id, title, origin_country, year, genre, id_director) VALUES (11, 'Wonder Woman', 'USA', 2017, 'ACTION', 5);
INSERT INTO movie (id, title, origin_country, year, genre, id_director) VALUES (12, 'Batman Begins', 'USA', 2005, 'ACTION', 6);
INSERT INTO movie (id, title, origin_country, year, genre, id_director) VALUES (13, 'Inception', 'USA', 2010, 'SUSPENSE', 6);
INSERT INTO movie (id, title, origin_country, year, genre, id_director) VALUES (14, 'Interstellar', 'CANADA', 2014, 'FICTION', 6);
INSERT INTO movie (id, title, origin_country, year, genre, id_director) VALUES (15, 'Whiplash', 'USA', 2014, 'DRAMA', 7);
INSERT INTO movie (id, title, origin_country, year, genre, id_director) VALUES (16, 'La La Land', 'USA', 2016, 'MUSICAL', 7);
INSERT INTO movie (id, title, origin_country, year, genre, id_director) VALUES (17, 'A Single Man', 'USA', 2009, 'DRAMA', 8);
INSERT INTO movie (id, title, origin_country, year, genre, id_director) VALUES (18, 'Nocturnal Animals', 'USA', 2016, 'DRAMA', 8);
INSERT INTO movie (id, title, origin_country, year, genre, id_director) VALUES (19, 'Las horas contigo', 'MEXICO', 2015, 'DRAMA', 9);
INSERT INTO movie (id, title, origin_country, year, genre, id_director) VALUES (20, 'Todos queremos a alguien', 'MEXICO', 2017, 'COMEDY', 9);

INSERT INTO copy (isbn, id_movie) VALUES ('2398472942', 1);
INSERT INTO copy (isbn, id_movie) VALUES ('2398472943', 1);
INSERT INTO copy (isbn, id_movie) VALUES ('2398472944', 1);
INSERT INTO copy (isbn, id_movie) VALUES ('2398472945', 2);
INSERT INTO copy (isbn, id_movie) VALUES ('2398472946', 2);
INSERT INTO copy (isbn, id_movie) VALUES ('2398472947', 2);
INSERT INTO copy (isbn, id_movie) VALUES ('2398472948', 3);
INSERT INTO copy (isbn, id_movie) VALUES ('2398472949', 3);
INSERT INTO copy (isbn, id_movie) VALUES ('2398472950', 3);
INSERT INTO copy (isbn, id_movie) VALUES ('2398472951', 4);
INSERT INTO copy (isbn, id_movie) VALUES ('2398472952', 4);
INSERT INTO copy (isbn, id_movie) VALUES ('2398472953', 4);
INSERT INTO copy (isbn, id_movie) VALUES ('2398472954', 5);
INSERT INTO copy (isbn, id_movie) VALUES ('2398472955', 5);
INSERT INTO copy (isbn, id_movie) VALUES ('2398472956', 5);
INSERT INTO copy (isbn, id_movie) VALUES ('2398472957', 6);
INSERT INTO copy (isbn, id_movie) VALUES ('2398472958', 6);
INSERT INTO copy (isbn, id_movie) VALUES ('2398472959', 6);
INSERT INTO copy (isbn, id_movie) VALUES ('2398472960', 7);
INSERT INTO copy (isbn, id_movie) VALUES ('2398472961', 7);
INSERT INTO copy (isbn, id_movie) VALUES ('2398472962', 7);
INSERT INTO copy (isbn, id_movie) VALUES ('2398472963', 8);
INSERT INTO copy (isbn, id_movie) VALUES ('2398472964', 8);
INSERT INTO copy (isbn, id_movie) VALUES ('2398472965', 8);
INSERT INTO copy (isbn, id_movie) VALUES ('2398472966', 9);
INSERT INTO copy (isbn, id_movie) VALUES ('2398472967', 9);
INSERT INTO copy (isbn, id_movie) VALUES ('2398472968', 9);
INSERT INTO copy (isbn, id_movie) VALUES ('2398472969', 10);
INSERT INTO copy (isbn, id_movie) VALUES ('2398472970', 10);
INSERT INTO copy (isbn, id_movie) VALUES ('2398472971', 10);
INSERT INTO copy (isbn, id_movie) VALUES ('2398472972', 11);
INSERT INTO copy (isbn, id_movie) VALUES ('2398472973', 11);
INSERT INTO copy (isbn, id_movie) VALUES ('2398472974', 11);
INSERT INTO copy (isbn, id_movie) VALUES ('2398472975', 12);
INSERT INTO copy (isbn, id_movie) VALUES ('2398472976', 12);
INSERT INTO copy (isbn, id_movie) VALUES ('2398472977', 12);
INSERT INTO copy (isbn, id_movie) VALUES ('2398472978', 13);
INSERT INTO copy (isbn, id_movie) VALUES ('2398472979', 13);
INSERT INTO copy (isbn, id_movie) VALUES ('2398472980', 13);
INSERT INTO copy (isbn, id_movie) VALUES ('2398472981', 14);
INSERT INTO copy (isbn, id_movie) VALUES ('2398472982', 14);
INSERT INTO copy (isbn, id_movie) VALUES ('2398472983', 14);
INSERT INTO copy (isbn, id_movie) VALUES ('2398472984', 15);
INSERT INTO copy (isbn, id_movie) VALUES ('2398472985', 15);
INSERT INTO copy (isbn, id_movie) VALUES ('2398472986', 15);
INSERT INTO copy (isbn, id_movie) VALUES ('2398472987', 16);
INSERT INTO copy (isbn, id_movie) VALUES ('2398472988', 16);
INSERT INTO copy (isbn, id_movie) VALUES ('2398472989', 16);
INSERT INTO copy (isbn, id_movie) VALUES ('2398472990', 17);
INSERT INTO copy (isbn, id_movie) VALUES ('2398472991', 17);
INSERT INTO copy (isbn, id_movie) VALUES ('2398472992', 17);
INSERT INTO copy (isbn, id_movie) VALUES ('2398472993', 18);
INSERT INTO copy (isbn, id_movie) VALUES ('2398472994', 18);
INSERT INTO copy (isbn, id_movie) VALUES ('2398472995', 18);
INSERT INTO copy (isbn, id_movie) VALUES ('2398472996', 19);
INSERT INTO copy (isbn, id_movie) VALUES ('2398472997', 19);
INSERT INTO copy (isbn, id_movie) VALUES ('2398472998', 19);
INSERT INTO copy (isbn, id_movie) VALUES ('2398472999', 20);
INSERT INTO copy (isbn, id_movie) VALUES ('2398473000', 20);
INSERT INTO copy (isbn, id_movie) VALUES ('2398473001', 20);
INSERT INTO copy (isbn, id_movie) VALUES ('2398473002', 20);
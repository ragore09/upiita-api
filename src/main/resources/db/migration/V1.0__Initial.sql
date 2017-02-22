CREATE TABLE director (
  id BIGINT NOT NULL AUTO_INCREMENT,
  name VARCHAR(100) NOT NULL,
  origin_country VARCHAR(50) NOT NULL,
  sex VARCHAR(10) NOT NULL,
  CONSTRAINT director_pkey PRIMARY KEY (id),
  CONSTRAINT director_name_ukey UNIQUE(name)
);


CREATE TABLE movie (
  id BIGINT NOT NULL AUTO_INCREMENT,
  title VARCHAR(50) NOT NULL,
  origin_country VARCHAR(50) NOT NULL,
  year BIGINT NOT NULL,
  genre VARCHAR(50) NOT NULL,
  id_director BIGINT NOT NULL,
  CONSTRAINT  movie_pkey PRIMARY KEY (id),
  CONSTRAINT movie_director_fkey FOREIGN KEY (id_director) REFERENCES director(id)
);

CREATE TABLE copy (
  id BIGINT NOT NULL AUTO_INCREMENT,
  isbn VARCHAR(100) NOT NULL,
  available BOOLEAN NOT NULL DEFAULT TRUE,
  id_movie BIGINT NOT NULL,
  CONSTRAINT copy_pkey PRIMARY KEY (id),
  CONSTRAINT copy_isbn_ukey UNIQUE (isbn),
  CONSTRAINT copy_movie_fkey FOREIGN KEY (id_movie) REFERENCES movie(id)
);

CREATE TABLE client (
  id BIGINT NOT NULL AUTO_INCREMENT,
  name VARCHAR(100) NOT NULL,
  lastname VARCHAR(100) NOT NULL,
  phone_number VARCHAR(50) NOT NULL,
  address VARCHAR(200) NOT NULL,
  CONSTRAINT client_pkey PRIMARY KEY (id)
);

CREATE TABLE loan (
  id BIGINT NOT NULL  AUTO_INCREMENT,
  creation_date TIMESTAMP NOT NULL,
  return_date TIMESTAMP NOT NULL,
  id_client BIGINT NOT NULL,
  id_copy BIGINT NOT NULL,
  CONSTRAINT loan_pkey PRIMARY KEY (id),
  CONSTRAINT loan_client_fkey FOREIGN KEY (id_client) REFERENCES loan(id),
  CONSTRAINT loan_copy_fkey FOREIGN KEY (id_copy) REFERENCES copy(id)
);
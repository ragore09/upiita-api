package com.nearsoft.upiita.api.repository;

import com.nearsoft.upiita.api.model.Movie;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface MovieRepository extends CrudRepository<Movie, Long> {

    @Query(value = "SELECT m FROM Movie m JOIN m.director d WHERE d.name = ?1")
    List<Movie> findByDirectorName(String name);
}

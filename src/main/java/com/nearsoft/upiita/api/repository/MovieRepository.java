package com.nearsoft.upiita.api.repository;

import com.nearsoft.upiita.api.model.Movie;
import org.springframework.data.repository.CrudRepository;

public interface MovieRepository extends CrudRepository<Movie, Long> {
}

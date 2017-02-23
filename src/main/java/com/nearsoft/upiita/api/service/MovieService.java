package com.nearsoft.upiita.api.service;

import com.nearsoft.upiita.api.model.Movie;
import com.nearsoft.upiita.api.repository.MovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class MovieService {

    @Autowired
    private MovieRepository movieRepository;

    public List<Movie> getMoviesByDirectorName(String name) {
        return movieRepository.findByDirectorName(name);
    }
}

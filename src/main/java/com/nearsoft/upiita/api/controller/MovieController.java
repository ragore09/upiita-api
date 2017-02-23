package com.nearsoft.upiita.api.controller;

import com.nearsoft.upiita.api.service.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MovieController {

    @Autowired
    private MovieService movieService;

    @GetMapping(value = "/director/{name}/movies")
    public ResponseEntity getMoviesByDirector(@PathVariable String name) {
        return new ResponseEntity(movieService.getMoviesByDirectorName(name), HttpStatus.OK);
    }
}

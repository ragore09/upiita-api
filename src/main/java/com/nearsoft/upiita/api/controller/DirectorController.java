package com.nearsoft.upiita.api.controller;

import com.nearsoft.upiita.api.service.DirectorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DirectorController {

    @Autowired
    private DirectorService directorService;

    @GetMapping(value = "/directors")
    public ResponseEntity directors() {
        return new ResponseEntity(directorService.getAll(), HttpStatus.OK);
    }
}

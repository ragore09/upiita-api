package com.nearsoft.upiita.api.controller;

import com.nearsoft.upiita.api.service.DirectorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DirectorController {

    @Autowired
    private DirectorService directorService;

    @RequestMapping(value = "/directors/{name}", method = RequestMethod.GET)
    public ResponseEntity directors(@PathVariable String name) {
        return new ResponseEntity(directorService.getByName(name), HttpStatus.OK);
    }
}

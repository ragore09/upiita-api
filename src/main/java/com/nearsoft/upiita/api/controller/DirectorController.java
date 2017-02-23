package com.nearsoft.upiita.api.controller;

import com.nearsoft.upiita.api.model.Director;
import com.nearsoft.upiita.api.service.DirectorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DirectorController {

    @Autowired
    private DirectorService directorService;

    @GetMapping(value = "/directors")
    public ResponseEntity directors() {
        return new ResponseEntity(directorService.getAll(), HttpStatus.OK);
    }

    @GetMapping(value = "/directors/{name}")
    public ResponseEntity directorByName(@PathVariable String name) {
        Director director = directorService.getByName(name);
        if(director == null)
            return new ResponseEntity("User Not Found", HttpStatus.NOT_FOUND);
        return new ResponseEntity(director, HttpStatus.FOUND);
    }

    @PutMapping(value = "/directors/{id}")
    public ResponseEntity updateDirector(@RequestBody Director update, @PathVariable Long id) {
        Director director = directorService.get(id);
        if(director == null)
            return new ResponseEntity("Director not found", HttpStatus.NOT_FOUND);
        director.setName(update.getName());
        director.setOriginCountry(update.getOriginCountry());
        director.setSex(update.getSex());
        return new ResponseEntity(directorService.update(director), HttpStatus.OK);
    }
}

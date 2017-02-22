package com.nearsoft.upiita.api.controller;

import com.nearsoft.upiita.api.model.Director;
import com.nearsoft.upiita.api.service.DirectorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class DirectorController {

    @Autowired
    private DirectorService directorService;

    @RequestMapping(path = "/directors", method = RequestMethod.GET)
    public List<Director> directors() {
        return directorService.getAll();
    }
}

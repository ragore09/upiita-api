package com.nearsoft.upiita.api.controller;

import com.nearsoft.upiita.api.model.Copy;
import com.nearsoft.upiita.api.service.CopyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CopyController {

    @Autowired
    private CopyService copyService;

    @GetMapping(value = "/copies")
    public ResponseEntity copies() {
        return new ResponseEntity(copyService.getAll(), HttpStatus.OK);
    }

    @DeleteMapping(value = "/copies/{isbn}")
    public ResponseEntity deleteCopy(@PathVariable String isbn) {
        Copy copy = copyService.getByIsbn(isbn);
        if(copy == null)
            return new ResponseEntity("Copy not found", HttpStatus.NOT_FOUND);
        copyService.delete(copy);
        return new ResponseEntity("Copy deleted", HttpStatus.OK);
    }

}

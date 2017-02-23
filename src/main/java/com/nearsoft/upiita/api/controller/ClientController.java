package com.nearsoft.upiita.api.controller;

import com.nearsoft.upiita.api.model.Client;
import com.nearsoft.upiita.api.service.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ClientController {

    @Autowired
    private ClientService clientService;

    @PostMapping(value = "/client")
    public ResponseEntity createClient(@RequestBody Client client) {
        if(clientService.getClientByFullName(client.getName(), client.getLastname()) != null)
            return new ResponseEntity("Client already exists", HttpStatus.CONFLICT);
        return new ResponseEntity(clientService.create(client), HttpStatus.CREATED);
    }

}

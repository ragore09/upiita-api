package com.nearsoft.upiita.api.service;

import com.nearsoft.upiita.api.model.Client;
import com.nearsoft.upiita.api.repository.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class ClientService {

    @Autowired
    private ClientRepository clientRepository;

    public Client getClientByFullName(String name, String lastname) {
        return clientRepository.findByNameAndLastname(name, lastname);
    }

    public Client create(Client client) {
        return clientRepository.save(client);
    }

}

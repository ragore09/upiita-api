package com.nearsoft.upiita.api.service;

import com.nearsoft.upiita.api.model.Director;
import com.nearsoft.upiita.api.repository.DirectorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class DirectorService {

    @Autowired
    private DirectorRepository directorRepository;

    public List<Director> getAll() {
        return (List<Director>) directorRepository.findAll();
    }

    public List<Director> getByName(String name) {
        return directorRepository.findByName(name);
    }

}

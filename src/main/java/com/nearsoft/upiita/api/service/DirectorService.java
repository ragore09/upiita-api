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

    public Director get(Long id) {
        return directorRepository.findOne(id);
    }

    public List<Director> getAll() {
        return (List<Director>) directorRepository.findAll();
    }

    public Director getByName(String name) {
        return directorRepository.findByName(name);
    }

    public Director update(Director director) {
        return directorRepository.save(director);
    }

}

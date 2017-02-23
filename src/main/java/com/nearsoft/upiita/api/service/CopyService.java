package com.nearsoft.upiita.api.service;

import com.nearsoft.upiita.api.model.Copy;
import com.nearsoft.upiita.api.repository.CopyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class CopyService {

    @Autowired
    private CopyRepository copyRepository;

    public List<Copy> getAll() {
        return (List<Copy>) copyRepository.findAll();
    }

    public Copy getByIsbn(String isbn) {
        return copyRepository.findByIsbn(isbn);
    }

    public void delete(Copy copy) {
        copyRepository.delete(copy);
    }
}

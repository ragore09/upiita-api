package com.nearsoft.upiita.api.repository;

import com.nearsoft.upiita.api.model.Director;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface DirectorRepository extends CrudRepository<Director, Long> {

    List<Director> findByName(String name);

}

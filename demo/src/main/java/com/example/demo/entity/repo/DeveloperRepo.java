package com.example.demo.entity.repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.Developer;

@Repository
public interface DeveloperRepo extends CrudRepository<Developer, Integer>{

}

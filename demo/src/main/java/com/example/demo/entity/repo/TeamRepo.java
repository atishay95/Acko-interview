package com.example.demo.entity.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.Team;

@Repository
public interface TeamRepo extends CrudRepository<Team, Integer> {
    
}

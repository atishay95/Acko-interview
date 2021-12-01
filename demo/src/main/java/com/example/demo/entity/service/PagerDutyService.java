package com.example.demo.entity.service;

import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.example.demo.entity.Developer;
import com.example.demo.entity.Team;
import com.example.demo.entity.repo.DeveloperRepo;
import com.example.demo.entity.repo.TeamRepo;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class PagerDutyService {
	
   
	@Autowired
	TeamRepo teamrepo;
	
	@Autowired 
	DeveloperRepo Developerrepo;
	
	public static final Logger log = LoggerFactory.getLogger(TeamRepo.class);
	
	public Team createTeam(Team team) {
		log.info("inside Create team method of service class");
	// TODO Auto-generated method stub
        List<Developer> dev = team.getDeveloper();
		Developerrepo.saveAll(dev);
		teamrepo.save(team);
		return null;
	}
	
	public Optional<Team> getTeam(int id) {
		return teamrepo.findById(id);
	}


}

package com.example.demo.entity.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Team;
import com.example.demo.entity.service.PagerDutyService;

@RestController
@RequestMapping("/pager")
public class PagerDutyController {
	@Autowired
	PagerDutyService service;
	@PostMapping("/create")
	public Team CreateTeam(@RequestBody Team team) {
		
		return service.createTeam(team);
	}
	
	@GetMapping("/{id}")
	public Optional<Team> getTeam(@PathVariable int id){
		return service.getTeam(id);
	}

}

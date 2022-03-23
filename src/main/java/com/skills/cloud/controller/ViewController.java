package com.skills.cloud.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.skills.cloud.dto.HealthDTO;


@RestController
public class ViewController {
	
	@GetMapping("/")
	public String index() {
		return "index";
	}
	
	@ResponseBody
	@GetMapping("/health")
	public HealthDTO health() {
		HealthDTO health = new HealthDTO();
		health.setStatus("ok");
		health.setEnv("Service_B");
//		return new ResponseEntity<HealthDTO>(health, HttpStatus.OK);
		return health;
	}
	
}

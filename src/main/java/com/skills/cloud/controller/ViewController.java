package com.skills.cloud.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.client.RestTemplate;

import com.skills.cloud.dto.HealthDTO;

@Controller
public class ViewController {
	
	
	@GetMapping("/")
	public String index() {
		return "index";
	}
	
	@ResponseBody
	@GetMapping("/health")
	public HealthDTO health(){
		String url = "http://cloud.skills.com/health";
		RestTemplate restTemplate = new RestTemplate();
		HealthDTO result = restTemplate.getForObject(url, HealthDTO.class);
		return result;
				 
	}
	
}

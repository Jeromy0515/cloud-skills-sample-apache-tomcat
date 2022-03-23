package com.skills.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class CloudSkillsApacheTomcatBApplication extends SpringBootServletInitializer{
	
	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
		return builder.sources(CloudSkillsApacheTomcatBApplication.class);
	}

	public static void main(String[] args) {
		SpringApplication.run(CloudSkillsApacheTomcatBApplication.class, args);
	}

}

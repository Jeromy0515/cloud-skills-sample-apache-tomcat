package com.skills.cloud.dto;

import lombok.NoArgsConstructor;

@NoArgsConstructor
public class HealthDTO {
	String status;
	String env;
	
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getEnv() {
		return env;
	}
	public void setEnv(String env) {
		this.env = env;
	}
}

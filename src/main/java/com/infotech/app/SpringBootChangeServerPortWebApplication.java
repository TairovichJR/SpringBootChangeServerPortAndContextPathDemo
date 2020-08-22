package com.infotech.app;

import java.util.HashMap;
import java.util.Map;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootChangeServerPortWebApplication {

public static void main(String[] args) {
		
		SpringApplication springApplication = new SpringApplication(SpringBootChangeServerPortWebApplication.class);
		
		setPort(springApplication);
		springApplication.run(args);
	}

	//third approach to configure server programmatically
	private static void setPort(SpringApplication springApplication) {
		Map<String, Object> configMap = new HashMap<>();
	//	configMap.put("SERVER_PORT", 8088);	
	//	configMap.put("SERVER_CONTEXT_PATH", "/newvalue");
		
		springApplication.setDefaultProperties(configMap);
	}
}

package com.diploma.RestServer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "com.diploma.RestServer")
@EnableAutoConfiguration
public class RestServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(RestServerApplication.class, args);
	}

}

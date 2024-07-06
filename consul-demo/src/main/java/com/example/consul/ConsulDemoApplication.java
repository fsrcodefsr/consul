package com.example.consul;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationPropertiesScan;

@SpringBootApplication
@ConfigurationPropertiesScan(basePackages = {"com.example.consul.config"})
public class ConsulDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(ConsulDemoApplication.class, args);
	}

}

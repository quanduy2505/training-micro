package com.spring;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication(exclude = { SecurityAutoConfiguration.class })
@EnableEurekaClient
public class TestService2Application {
	public static void main(String[] args) {
		SpringApplication.run(TestService2Application.class, args);
	}


}

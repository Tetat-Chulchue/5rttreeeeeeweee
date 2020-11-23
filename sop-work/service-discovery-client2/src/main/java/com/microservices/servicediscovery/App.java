package com.microservices.servicediscovery;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.microservices.servicediscovery.bean.Promotion;

@SpringBootApplication
@EnableDiscoveryClient
public class App {
	public static void main(String[] args) {
		SpringApplication.run(App.class, args);
	}
}

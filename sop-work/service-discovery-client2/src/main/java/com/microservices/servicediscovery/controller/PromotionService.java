package com.microservices.servicediscovery.controller;

import java.util.List;
import java.util.Properties;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.microservices.servicediscovery.bean.Promotion;

@RestController
public class PromotionService {

	@Autowired
	private DiscoveryClient discoveryClient;
	
	@RequestMapping(value = "/promotion", method=RequestMethod.POST)
	public ResponseEntity<Promotion> add(@RequestBody Promotion promo) {
		return new ResponseEntity<Promotion>(promo, HttpStatus.OK);
	}
	
	@RequestMapping(value = "/", method=RequestMethod.GET)
	public String get() {
		return "HELLO WORLD";
	}
}

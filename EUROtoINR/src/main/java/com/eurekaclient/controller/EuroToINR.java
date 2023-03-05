package com.eurekaclient.controller;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value= "/convert")
public class EuroToINR {
	double amount = 88;
	
	@GetMapping(value= "/eurotoinr/{amt}")
	public String getGreetings(@PathVariable double amt) {
		double converted = amount * amt;
		String output = String.valueOf(converted);
		return output;
	}
}
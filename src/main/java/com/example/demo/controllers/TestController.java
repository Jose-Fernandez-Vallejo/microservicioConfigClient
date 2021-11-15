package com.example.demo.controllers;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
	
	@Value("${some.value}")
	String myValue;
	
	
	@GetMapping(path = "/myvalue")
	public String myValue()
	{
		return this.myValue;
		
	}

}

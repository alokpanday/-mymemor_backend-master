package com.mymemor.mymemor.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/site")
public class Endpoint {
	 
	@GetMapping("/register/{name}/{username}/{password}")
	public String register()
	{
		
		return null;
		
	}
}

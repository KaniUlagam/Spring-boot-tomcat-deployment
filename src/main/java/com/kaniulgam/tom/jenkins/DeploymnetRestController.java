package com.kaniulgam.tom.jenkins;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DeploymnetRestController {
	
	@GetMapping("/welcome/{name}")
	public String message(@PathVariable("name")String name)
	{
		return name +",welcome to Kani Ulagam";
		
	}
}

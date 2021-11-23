package com.in28minutes.rest.basicAuth.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.in28minutes.basicAuth.entity.AuthenticationBean;


@CrossOrigin(origins="http://localhost:4200")
@RestController
public class BasicAuthenticationController {

	@GetMapping(path = "/basicauth")
	public AuthenticationBean helloWorldBean() {
		//throw new RuntimeException("Some Error has Happened! Contact Support at ***-***");
		return new AuthenticationBean("You are authenticated");
	}
	
	/*
	 * ///hello-world/path-variable/in28minutes
	 * 
	 * @GetMapping(path = "/hello-world/path-variable/{name}") public HelloWorldBean
	 * helloWorldPathVariable(@PathVariable String name) { return new
	 * HelloWorldBean(String.format("Hello World, %s", name)); }
	 */
}

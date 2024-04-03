package com.nagarro.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class DockerController {
	@GetMapping
	public ResponseEntity<String> getMsg(){
		return ResponseEntity.ok().body("This is an sample api for docker devops assignment");
	}
	@GetMapping("/api2")
	public ResponseEntity<String> getMsg1(){
		return ResponseEntity.ok().body("This is an api2 for docker devops assignment");
	}
}

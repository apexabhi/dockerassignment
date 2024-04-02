package com.nagarro.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class DummyController {
	@GetMapping
	public ResponseEntity<String> getMsg(){
		return ResponseEntity.ok().body("This is an sample api for docker devops assignment");
	}
}

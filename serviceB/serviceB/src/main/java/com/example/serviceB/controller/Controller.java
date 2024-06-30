package com.example.serviceB.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/serviceB")
public class Controller {

	@GetMapping("/getMessage")
	public ResponseEntity<String> getMessage(){
		return ResponseEntity.ok("Micro Service B Controller Executed ");
	}
}

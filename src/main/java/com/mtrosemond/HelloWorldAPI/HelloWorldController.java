package com.mtrosemond.HelloWorldAPI;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

	public HelloWorldController() {
	}

	@GetMapping
	public ResponseEntity<String> printMessage() {
		return ResponseEntity.ok("Hello World");
	}
}

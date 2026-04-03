package com.springrest.rest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class ControllerClass {

	String name = null;
	
	@GetMapping("/select")
	public ResponseEntity<String> showName(){
	
		System.out.println("ControllerClass.showName()");
		
//		name = "Nayan";
		
		return new ResponseEntity<String> ("Select operation", HttpStatus.OK);
	}
	
	@PostMapping("/post")
	public ResponseEntity<String> postName(){
		
		System.out.println("ControllerClass.postName()");
		
		return new ResponseEntity<String> ("Post operation", HttpStatus.OK);
	}
	@PutMapping("/put")
	public ResponseEntity<String> putName(){
		
		System.out.println("ControllerClass.putName()");
		
		return new ResponseEntity<String> ("Put operation", HttpStatus.OK);
	}
}

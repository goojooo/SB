package com.springrest.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springrest.model.Actor;
import com.springrest.model.Vehicle;

@RestController
@RequestMapping("/details")
//@RequestMapping("/")
public class ActorDetailsController {
	
	@PostMapping("/actor-details")
	public ResponseEntity<String> regiterActor(@RequestBody Actor actor)
	{
		System.out.println("ActorDetailsController.regiterActor()");
		return new ResponseEntity<String>(actor.toString(), HttpStatus.OK);
	}

	//produce endpoints for accepting actor details in the form of JSON object through request
	@PostMapping("/register-vehicle")
	public ResponseEntity<String> reisterVehicle(@RequestBody Vehicle vehicle)
	{
		System.out.println("ActorDetailsController.reisterVehicle()");
		System.out.println("Vehicle details are : " + vehicle);
		
		return new ResponseEntity<String>(vehicle.toString(), HttpStatus.OK);
	}
}

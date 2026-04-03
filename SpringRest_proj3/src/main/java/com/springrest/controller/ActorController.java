package com.springrest.controller;

import java.util.List;

import org.apache.catalina.connector.Response;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springrest.model.Actor;
import com.springrest.model.Vehicle;

@RestController
@RequestMapping("/actor-api")
public class ActorController {

	
	@GetMapping("/actor-details")
	public ResponseEntity<Actor> showActorDetails(){
		System.out.println("ActorController.showActorDetails()");
		Actor a = new Actor (101,"Jonny","NY",696969.69f);
		return new ResponseEntity<Actor>(a, HttpStatus.OK);
	}
	
	@GetMapping("/show-vehicles")
	public ResponseEntity<List<Vehicle>> showAllVehicles() {
	List<Vehicle> list = List.of( new Vehicle("TS09EE7878", "EV9", "mahindra", 3300000.0),
	new Vehicle("TS09EE7171", "fortuner", "toyota", 5500000.0),
	new Vehicle("TS09EE7272", "X9", "Audi", 15000000.0),
	new Vehicle("TS09EE5566", "may back", "Mercdez", 16000000.0));
	return new ResponseEntity<List<Vehicle>>(list, HttpStatus.OK); 
	}

}

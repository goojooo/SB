package com.springrest.rest;

import java.time.LocalDate;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/season-api")
public class SeasonFinderRestOperationController {

	// endpoints
	@GetMapping("/display")
	public ResponseEntity<String> showSeasonName(){
		System.out.println("SeasonFinderRestOperationController.showSeasonName()");
		// find season
		String season = null;
		LocalDate localDate = LocalDate.now();
		
		int month = localDate.getMonthValue();
		if(month >= 1 && month < 5 ) {
			System.out.println("Winter Season...");
			season = "Winter Season...";
		} else if(month >= 5 && month < 9 ) {
			System.out.println("Summer Season...");
			season = "Summer Season...";
		} else 	if(month >= 9 && month <= 12 ) {
			System.out.println("Rainny Season...");
			season = "Rainny Season...";
		} else {
			System.out.println("Enter valid Integer...");
		}
		
		return new ResponseEntity<String>(season, HttpStatus.OK);
	}
}

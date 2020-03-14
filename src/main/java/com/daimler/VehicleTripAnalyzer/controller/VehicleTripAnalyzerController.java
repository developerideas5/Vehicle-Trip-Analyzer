package com.daimler.VehicleTripAnalyzer.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rest/api")
public class VehicleTripAnalyzerController {


	@RequestMapping(value = "/trip")
	public String trip1() {
		
		return "It's working"; 
	}

}

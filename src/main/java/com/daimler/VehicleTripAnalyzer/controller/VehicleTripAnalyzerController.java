package com.daimler.VehicleTripAnalyzer.controller;

import javax.validation.Valid;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.daimler.VehicleTripAnalyzer.dto.VehiclePushDTO;
import com.daimler.VehicleTripAnalyzer.exception.TripResponseDTO;
import com.daimler.VehicleTripAnalyzer.service.TripService;

import feign.Headers;
import feign.RequestLine;

@RestController
public class VehicleTripAnalyzerController {

	private static final Logger LOG = LoggerFactory.getLogger(VehicleTripAnalyzerController.class);
	
	@Autowired
	private TripService tripService;
	
	@PostMapping(value = "/v1/trip")
	@RequestLine("POST /v1/trip")
	@Headers("Content-Type: application/json")
	public ResponseEntity<TripResponseDTO> trip(@RequestBody 
			@Valid VehiclePushDTO vehiclePushDTO) {
		VehicleTripAnalyzerController.LOG.info("Trip started...");
		final TripResponseDTO vehiclePushResponseDTO = tripService.trip(vehiclePushDTO);
		VehicleTripAnalyzerController.LOG.info("Trip ended...");
		return ResponseEntity.ok(vehiclePushResponseDTO);
	}
	
	@GetMapping(value = "/v1/trip1")
	@RequestLine("GET /v1/trip1")
	@Headers("Content-Type: application/json")
	public ResponseEntity<TripResponseDTO> trip1(@RequestBody 
			@Valid VehiclePushDTO vehiclePushDTO) {
		VehicleTripAnalyzerController.LOG.info("Trip started...");
		final TripResponseDTO vehiclePushResponseDTO = tripService.trip(vehiclePushDTO);
		VehicleTripAnalyzerController.LOG.info("Trip ended...");
		return ResponseEntity.ok(vehiclePushResponseDTO);
	}
}

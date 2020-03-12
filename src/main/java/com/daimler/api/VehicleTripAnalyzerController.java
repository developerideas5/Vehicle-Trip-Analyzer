package com.daimler.api;

import static org.springframework.web.bind.annotation.RequestMethod.POST;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.daimler.VehicleTripAnalyze.models.VehiclePush;
import com.daimler.VehicleTripAnalyze.service.VehicleTripAnalyzerService;



@Controller
public class VehicleTripAnalyzerController {

	@Autowired
	private VehicleTripAnalyzerService VehicleTripAnalyzerService;
	
	@RequestMapping(value = "/trip", method = POST)
	ResponseEntity<VehiclePushDTO> trip(@RequestBody @Valid final VehiclePushDTO vehiclePushDTO) {
		//VehiclePush VehicleTripAnalyzerService = VehicleTripAnalyzerService.load();
		return null ;
	}
}

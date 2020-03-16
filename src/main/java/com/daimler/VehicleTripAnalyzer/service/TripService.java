package com.daimler.VehicleTripAnalyzer.service;

import javax.validation.Valid;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.stereotype.Component;

import com.daimler.VehicleTripAnalyzer.dto.VehiclePushDTO;
import com.daimler.VehicleTripAnalyzer.exception.TripResponseDTO;

@Component
public interface TripService {

	TripResponseDTO trip(@Valid VehiclePushDTO vehiclePushDTO);

}

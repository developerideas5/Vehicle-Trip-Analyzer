package com.daimler.VehicleTripAnalyzer.service;

import java.util.List;

import org.springframework.stereotype.Component;

import com.daimler.VehicleTripAnalyzer.model.City;
@Component
public interface CityService {

	

	List<City> findAll();
}

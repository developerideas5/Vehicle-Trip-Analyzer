package com.daimler.VehicleTripAnalyzer.service;

import java.util.ArrayList;
import java.util.List;



import org.springframework.stereotype.Component;

import com.daimler.VehicleTripAnalyzer.model.City;
@Component
public class CityServiceImpl implements CityService{

	//get all city name
	// for each cityname -> get latitude and lontitude
	//assign depature and designation -> cityname
	      
        
        public List<City> findAll() {

        	List<City> cities = new ArrayList<>();

            cities.add(new City("Stuttgart"));
            cities.add(new City("Munich"));
            cities.add(new City("Prague"));
            cities.add(new City("Berlin"));

            return cities;
        }	


      
}

package com.daimler.VehicleTripAnalyzer.model;

import static org.springframework.web.bind.annotation.RequestMethod.POST;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.daimler.VehicleTripAnalyzer.repository.UsersRepository;



@RestController
@RequestMapping(path = "/vehicle")
public class VehicleTripAnalyzerController {

	@Autowired
	private com.daimler.VehicleTripAnalyze.service.VehicleTripAnalyzerService VehicleTripAnalyzerService;
	
	
	
	@RequestMapping(value = "/trip", method = POST)
	ResponseEntity<VehiclePushDTO> trip(@RequestBody @Valid final VehiclePushDTO vehiclePushDTO) {
		//VehiclePush VehicleTripAnalyzerService = VehicleTripAnalyzerService.load();
		return null ;
	}
	

	
	 @Autowired
	    private UsersRepository repository;
	    
	    @GetMapping(path="/", produces = "application/json")
	    public Users getUsers(@PathVariable("id") String id) 
	    {
	        return repository.findByUsername(id);
	    }
	    
	 	    
	    @RequestMapping(value = "/", method = RequestMethod.GET)
		public List<Users> getAllUsers() {
			return repository.findAll();
		}

		

}

package com.daimler.VehicleTripAnalyzer.repository;

import org.springframework.stereotype.Repository;
import org.springframework.data.mongodb.repository.MongoRepository;

import com.daimler.VehicleTripAnalyzer.model.Users;

@Repository
public interface UsersRepository extends MongoRepository<Users, String> {
	
	Users findByUsername(String username);

}

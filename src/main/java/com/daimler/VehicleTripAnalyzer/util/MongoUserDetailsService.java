package com.daimler.VehicleTripAnalyzer.util;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;

import com.daimler.VehicleTripAnalyzer.model.Users;
import com.daimler.VehicleTripAnalyzer.repository.UsersRepository;

import java.util.Arrays;
import java.util.List;

@Component
public class MongoUserDetailsService implements UserDetailsService {
	@Autowired
	private UsersRepository repository;

	@Override
  public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
    
	Users user = repository.findByUsername(username);
    
	if(user == null) {
      throw new UsernameNotFoundException(username + "not found");
    }
    
	List<SimpleGrantedAuthority> authorities = Arrays.asList(new SimpleGrantedAuthority(username));
    
	return new User(user.getUsername(), user.getPassword(), authorities);
  }
}
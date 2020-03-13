package com.daimler.VehicleTripAnalyze.daos;

import org.springframework.data.annotation.Id;

public class Trip {
	@Id
	String tripid;
	String depature;
	String destination;

	public String getTripid() {
		return tripid;
	}

	public void setTripid(String tripid) {
		this.tripid = tripid;
	}

	public String getDepature() {
		return depature;
	}

	public void setDepature(String depature) {
		this.depature = depature;
	}

	public String getDestination() {
		return destination;
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}
}

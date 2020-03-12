package com.daimler.VehicleTripAnalyze.models;

import java.util.List;

public class VehiclePushAnalysis {
	String vin;
	String departure;
	String destination;
	List<Break> refuelStops;
	float consumption;
	List<Break> breaks;

	public String getVin() {
		return vin;
	}

	public void setVin(String vin) {
		this.vin = vin;
	}

	public String getDeparture() {
		return departure;
	}

	public void setDeparture(String departure) {
		this.departure = departure;
	}

	public String getDestination() {
		return destination;
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}

	public List<Break> getRefuelStops() {
		return refuelStops;
	}

	public void setRefuelStops(List<Break> refuelStops) {
		this.refuelStops = refuelStops;
	}

	public float getConsumption() {
		return consumption;
	}

	public void setConsumption(float consumption) {
		this.consumption = consumption;
	}

	public List<Break> getBreaks() {
		return breaks;
	}

	public void setBreaks(List<Break> breaks) {
		this.breaks = breaks;
	}

	@Override
	public String toString() {
		return "VehiclePushAnalysis [vin=" + vin + ", departure=" + departure
				+ ", destination=" + destination + ", refuelStops="
				+ refuelStops + ", consumption=" + consumption + ", breaks="
				+ breaks + "]";
	}
}

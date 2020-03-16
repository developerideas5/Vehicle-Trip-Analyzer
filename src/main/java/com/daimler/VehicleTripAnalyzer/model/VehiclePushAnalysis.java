package com.daimler.VehicleTripAnalyzer.model;

import java.util.ArrayList;
import java.util.List;

public class VehiclePushAnalysis {
	
	private String vin;
	private City departure;
	private City destination;
	private List<Break> refuelStops = new ArrayList<Break>();
	private Float consumption;
	private List<Break> breaks = new ArrayList<Break>();



	public String getVin() {
		return vin;
	}

	public void setVin(String vin) {
		this.vin = vin;
	}





	public City getDeparture() {
		return departure;
	}

	public void setDeparture(City departure) {
		this.departure = departure;
	}

	public City getDestination() {
		return destination;
	}

	public void setDestination(City destination) {
		this.destination = destination;
	}

	public List<Break> getRefuelStops() {
		return refuelStops;
	}

	public void setRefuelStops(List<Break> refuelStops) {
		this.refuelStops = refuelStops;
	}

	public Float getConsumption() {
		return consumption;
	}

	public void setConsumption(Float consumption) {
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

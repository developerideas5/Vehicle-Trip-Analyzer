package com.daimler.VehicleTripAnalyzer.dto;

import java.util.List;

import com.daimler.VehicleTripAnalyzer.model.Break;

public class VehiclePushAnalysisDTO {
	private String vin;
	private String departure;
	private String destination;
	private List<Break> refuelStops;
	private Float consumption;
	private List<Break> breaks;
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
		return "VehiclePushAnalysisDTO [vin=" + vin + ", departure="
				+ departure + ", destination=" + destination + ", refuelStops="
				+ refuelStops + ", consumption=" + consumption + ", breaks="
				+ breaks + "]";
	}
}

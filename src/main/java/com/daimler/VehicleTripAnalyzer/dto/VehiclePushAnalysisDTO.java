package com.daimler.VehicleTripAnalyzer.dto;

import java.util.ArrayList;
import java.util.List;


public class VehiclePushAnalysisDTO {
	private String vin;
	private CityDTO departure;
	private CityDTO destination;
	private List<BreakDTO> refuelStops = new ArrayList<BreakDTO>();
	private Float consumption;
	private List<BreakDTO> breaksDTO = new ArrayList<BreakDTO>();
	
	
	public String getVin() {
		return vin;
	}
	public void setVin(String vin) {
		this.vin = vin;
	}
	
	public CityDTO getDeparture() {
		return departure;
	}
	public void setDeparture(CityDTO departure) {
		this.departure = departure;
	}
	public CityDTO getDestination() {
		return destination;
	}
	public void setDestination(CityDTO destination) {
		this.destination = destination;
	}
	public List<BreakDTO> getBreaksDTO() {
		return breaksDTO;
	}
	public void setBreaksDTO(List<BreakDTO> breaksDTO) {
		this.breaksDTO = breaksDTO;
	}

	public List<BreakDTO> getRefuelStops() {
		return refuelStops;
	}
	public void setRefuelStops(List<BreakDTO> list) {
		this.refuelStops = list;
	}
	public Float getConsumption() {
		return consumption;
	}
	public void setConsumption(Float consumption) {
		this.consumption = consumption;
	}
	public List<BreakDTO> getBreaks() {
		
		return breaksDTO;
	}
	public void setBreaks(List<BreakDTO> breaks) {
		this.breaksDTO = breaks;
	}

	@Override
	public String toString() {
		return "VehiclePushAnalysisDTO [vin=" + vin + ", departure="
				+ departure + ", destination=" + destination + ", refuelStops="
				+ refuelStops + ", consumption=" + consumption + ", breaks="
				+ breaksDTO + "]";
	}

}

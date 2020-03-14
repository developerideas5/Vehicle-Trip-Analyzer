package com.daimler.VehicleTripAnalyze.daos;


import java.util.ArrayList;
import java.util.List;


public class VehiclePushAnalysis {
	  private String vin = null;
	  private String departure = null;
	  private String destination = null;
	  private List<Break> refuelStops = null;
	  private Float consumption = null;
	  private List<Break> breaks = null;

	 

	  public VehiclePushAnalysis(String vin) {
		this.vin = vin;
	}

	public String getVin() {
	    return vin;
	  }

	  public void setVin(String vin) {
	    this.vin = vin;
	  }

	  public VehiclePushAnalysis departure(String departure) {
	    this.departure = departure;
	    return this;
	  }
	  public String getDeparture() {
	    return departure;
	  }

	  public void setDeparture(String departure) {
	    this.departure = departure;
	  }

	  public VehiclePushAnalysis destination(String destination) {
	    this.destination = destination;
	    return this;
	  }
	  public String getDestination() {
	    return destination;
	  }

	  public void setDestination(String destination) {
	    this.destination = destination;
	  }

	  public VehiclePushAnalysis(List<Break> refuelStops) {
		this.refuelStops = refuelStops;
	}

	public VehiclePushAnalysis addRefuelStopsItem(Break refuelStopsItem) {
	    if (this.refuelStops == null) {
	      this.refuelStops = new ArrayList<Break>();
	    }
	    this.refuelStops.add(refuelStopsItem);
	    return this;
	  }

	  public List<Break> getRefuelStops() {
	    return refuelStops;
	  }

	  public void setRefuelStops(List<Break> refuelStops) {
	    this.refuelStops = refuelStops;
	  }

	  public VehiclePushAnalysis consumption(Float consumption) {
	    this.consumption = consumption;
	    return this;
	  }
	  public Float getConsumption() {
	    return consumption;
	  }

	  public void setConsumption(Float consumption) {
	    this.consumption = consumption;
	  }

	  public VehiclePushAnalysis breaks(List<Break> breaks) {
	    this.breaks = breaks;
	    return this;
	  }

	  public VehiclePushAnalysis addBreaksItem(Break breaksItem) {
	    if (this.breaks == null) {
	      this.breaks = new ArrayList<Break>();
	    }
	    this.breaks.add(breaksItem);
	    return this;
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

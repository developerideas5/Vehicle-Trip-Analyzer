package com.daimler.VehicleTripAnalyzer.dto;

public class VehiclePushDataPointDTO {
	
	private Long timestamp ;
	private Integer odometer ;
	private Integer fuelLevel ;
	private Float positionLat ;
	private Float positionLong ;


	public Long getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(Long timestamp) {
		this.timestamp = timestamp;
	}

	public Integer getOdometer() {
		return odometer;
	}

	public void setOdometer(Integer odometer) {
		this.odometer = odometer;
	}

	public Integer getFuelLevel() {
		return fuelLevel;
	}

	public void setFuelLevel(Integer fuelLevel) {
		this.fuelLevel = fuelLevel;
	}

	public Float getPositionLat() {
		return positionLat;
	}

	public void setPositionLat(Float positionLat) {
		this.positionLat = positionLat;
	}

	public Float getPositionLong() {
		return positionLong;
	}

	public void setPositionLong(Float positionLong) {
		this.positionLong = positionLong;
	}

	@Override
	public String toString() {
		return "VehiclePushDataPoint [timestamp=" + timestamp + ", odometer="
				+ odometer + ", fuelLevel=" + fuelLevel + ", positionLat="
				+ positionLat + ", positionLong=" + positionLong + "]";
	}
}

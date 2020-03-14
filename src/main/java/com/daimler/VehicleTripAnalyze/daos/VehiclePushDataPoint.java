package com.daimler.VehicleTripAnalyze.daos;

public class VehiclePushDataPoint {

	private Long timestamp = null;
	private Integer odometer = null;
	private Integer fuelLevel = null;
	private Float positionLat = null;
	private Float positionLong = null;

	public VehiclePushDataPoint(Long timestamp) {
		this.timestamp = timestamp;
	}

	public VehiclePushDataPoint(Integer odometer) {
		this.odometer = odometer;
	}

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

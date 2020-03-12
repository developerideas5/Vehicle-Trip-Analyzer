package com.daimler.VehicleTripAnalyze.models;

public class VehiclePushDataPoint {

	int timestamp;
	int odometer;
	int fuelLevel;// fuel level for a given time in percent
	float positionLat;// latitude position for a given time
	float positionLong;

	public int getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(int timestamp) {
		this.timestamp = timestamp;
	}

	public int getOdometer() {
		return odometer;
	}

	public void setOdometer(int odometer) {
		this.odometer = odometer;
	}

	public int getFuelLevel() {
		return fuelLevel;
	}

	public void setFuelLevel(int fuelLevel) {
		this.fuelLevel = fuelLevel;
	}

	public float getPositionLat() {
		return positionLat;
	}

	public void setPositionLat(float positionLat) {
		this.positionLat = positionLat;
	}

	public float getPositionLong() {
		return positionLong;
	}

	public void setPositionLong(float positionLong) {
		this.positionLong = positionLong;
	}

	@Override
	public String toString() {
		return "VehiclePushDataPoint [timestamp=" + timestamp + ", odometer="
				+ odometer + ", fuelLevel=" + fuelLevel + ", positionLat="
				+ positionLat + ", positionLong=" + positionLong + "]";
	}
}

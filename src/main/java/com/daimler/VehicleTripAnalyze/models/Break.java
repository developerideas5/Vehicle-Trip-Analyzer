package com.daimler.VehicleTripAnalyze.models;

public class Break {
	int startTimestamp;
	int endTimestamp;
	float positionLat;
	float positionLong;
	public int getStartTimestamp() {
		return startTimestamp;
	}
	public void setStartTimestamp(int startTimestamp) {
		this.startTimestamp = startTimestamp;
	}
	public int getEndTimestamp() {
		return endTimestamp;
	}
	public void setEndTimestamp(int endTimestamp) {
		this.endTimestamp = endTimestamp;
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
		return "Break [startTimestamp=" + startTimestamp + ", endTimestamp="
				+ endTimestamp + ", positionLat=" + positionLat
				+ ", positionLong=" + positionLong + "]";
	}
}

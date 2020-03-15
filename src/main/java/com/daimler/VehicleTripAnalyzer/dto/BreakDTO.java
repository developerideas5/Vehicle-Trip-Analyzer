package com.daimler.VehicleTripAnalyzer.dto;

public class BreakDTO {
	private Long startTimestamp;
	private Long endTimestamp;
	private Float positionLat;
	private Float positionLong;

	public Long getStartTimestamp() {
		return startTimestamp;
	}

	public void setStartTimestamp(Long startTimestamp) {
		this.startTimestamp = startTimestamp;
	}

	public Long getEndTimestamp() {
		return endTimestamp;
	}

	public void setEndTimestamp(Long endTimestamp) {
		this.endTimestamp = endTimestamp;
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
		return "BreakDTO [startTimestamp=" + startTimestamp + ", endTimestamp="
				+ endTimestamp + ", positionLat=" + positionLat
				+ ", positionLong=" + positionLong + "]";
	}
}

package com.daimler.VehicleTripAnalyzer.dto;

public class BreakDTO {
	private Long startTimestamp = 0L;
	private Long endTimestamp = 0L;
	private Float positionLat = 0f;
	private Float positionLong = 0f;

	public BreakDTO(Long startTimestamp, Long endTimestamp, Float positionLat,
			Float positionLong) {
		super();
		this.startTimestamp = startTimestamp;
		this.endTimestamp = endTimestamp;
		this.positionLat = positionLat;
		this.positionLong = positionLong;
	}

	public BreakDTO() {
		// TODO Auto-generated constructor stub
	}

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

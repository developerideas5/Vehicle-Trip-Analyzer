package com.daimler.api;

import com.daimler.VehicleTripAnalyze.models.VehiclePushDataPoint;

public class VehiclePushDTO {
	String vin;
	int breakThreshold;
	int gasTankSize;
	VehiclePushDataPoint data;

	public String getVin() {
		return vin;
	}

	public void setVin(String vin) {
		this.vin = vin;
	}

	public int getBreakThreshold() {
		return breakThreshold;
	}

	public void setBreakThreshold(int breakThreshold) {
		this.breakThreshold = breakThreshold;
	}

	public int getGasTankSize() {
		return gasTankSize;
	}

	public void setGasTankSize(int gasTankSize) {
		this.gasTankSize = gasTankSize;
	}

	public VehiclePushDataPoint getData() {
		return data;
	}

	public void setData(VehiclePushDataPoint data) {
		this.data = data;
	}
}

package com.daimler.VehicleTripAnalyze.daos;

import java.util.List;

public class VehiclePush  {
	private String vin = null;
	private Integer breakThreshold = null;
	private Integer gasTankSize = null;
	private List<VehiclePushDataPoint> data = null;


	public String getVin() {
		return vin;
	}

	public void setVin(String vin) {
		this.vin = vin;
	}

	public Integer getBreakThreshold() {
		return breakThreshold;
	}

	public void setBreakThreshold(Integer breakThreshold) {
		this.breakThreshold = breakThreshold;
	}

	public Integer getGasTankSize() {
		return gasTankSize;
	}

	public void setGasTankSize(Integer gasTankSize) {
		this.gasTankSize = gasTankSize;
	}

	public List<VehiclePushDataPoint> getData() {
		return data;
	}

	public void setData(List<VehiclePushDataPoint> data) {
		this.data = data;
	}

	@Override
	public String toString() {
		return "VehiclePush [vin=" + vin + ", breakThreshold=" + breakThreshold
				+ ", gasTankSize=" + gasTankSize + ", data=" + data + "]";
	}
}

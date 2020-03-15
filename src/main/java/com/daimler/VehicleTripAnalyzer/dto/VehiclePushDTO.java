package com.daimler.VehicleTripAnalyzer.dto;

import java.util.List;

public class VehiclePushDTO {
	
	private String vin;
	private Integer breakThreshold ;
	private Integer gasTankSize ;
	private List<VehiclePushDataPointDTO> vehiclePushDataPointDTOList ;


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

	public List<VehiclePushDataPointDTO> getVehiclePushDataPointDTOList() {
		return vehiclePushDataPointDTOList;
	}

	public void setVehiclePushDataPointDTOList(
			List<VehiclePushDataPointDTO> vehiclePushDataPointDTOList) {
		this.vehiclePushDataPointDTOList = vehiclePushDataPointDTOList;
	}
	@Override
	public String toString() {
		return "VehiclePushDTO [vin=" + vin + ", breakThreshold="
				+ breakThreshold + ", gasTankSize=" + gasTankSize
				+ ", vehiclePushDataPointDTOList="
				+ vehiclePushDataPointDTOList + "]";
	}
	
}

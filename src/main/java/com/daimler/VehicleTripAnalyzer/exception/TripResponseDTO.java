package com.daimler.VehicleTripAnalyzer.exception;

import com.daimler.VehicleTripAnalyzer.dto.ErrorDTO;
import com.daimler.VehicleTripAnalyzer.dto.VehiclePushAnalysisDTO;
import com.daimler.VehicleTripAnalyzer.dto.VehiclePushDTO;

public class TripResponseDTO {
	private VehiclePushAnalysisDTO vehiclePushAnalysisDTO;
	private ErrorDTO errorDTO;

	

	public VehiclePushAnalysisDTO getVehiclePushAnalysisDTO() {
		return vehiclePushAnalysisDTO;
	}

	public void setVehiclePushAnalysisDTO(VehiclePushAnalysisDTO vehiclePushAnalysisDTO) {
		this.vehiclePushAnalysisDTO = vehiclePushAnalysisDTO;
	}

	public ErrorDTO getErrorDTO() {
		return errorDTO;
	}

	public void setErrorDTO(ErrorDTO errorDTO) {
		this.errorDTO = errorDTO;
	}

	@Override
	public String toString() {
		return "TripResponseDTO [vehiclePushAnalysisDTO="
				+ vehiclePushAnalysisDTO + ", errorDTO=" + errorDTO + "]";
	}

	

}

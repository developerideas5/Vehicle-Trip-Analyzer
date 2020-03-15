package com.daimler.VehicleTripAnalyzer.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.stereotype.Component;

import com.daimler.VehicleTripAnalyzer.dto.VehiclePushAnalysisDTO;
import com.daimler.VehicleTripAnalyzer.dto.VehiclePushDTO;
import com.daimler.VehicleTripAnalyzer.exception.TripResponseDTO;
import com.daimler.VehicleTripAnalyzer.mapper.TripMapper;
import com.daimler.VehicleTripAnalyzer.model.VehiclePush;
import com.daimler.VehicleTripAnalyzer.model.VehiclePushAnalysis;


@Component
public class TripServiceImpl implements TripService {
	private static final Logger LOG = LoggerFactory
			.getLogger(TripServiceImpl.class);

	@Autowired
	private TripMapper tripMapper;

	@Override
	public TripResponseDTO trip(final VehiclePushDTO vehiclePushDTO) {
		
		VehiclePush vehiclePush = tripMapper.mapVehiclePushDTO(vehiclePushDTO);
		LOG.info("Push: " + vehiclePushDTO.getVin());
		VehiclePushAnalysis vehiclePushAnalysis = buildAnalysis(vehiclePush);

		final TripResponseDTO vehiclePushResponseDTO = new TripResponseDTO();
		vehiclePushResponseDTO.setVehiclePushAnalysisDTO(tripMapper
				.mapVehicleAnaysis(vehiclePushAnalysis));
		return vehiclePushResponseDTO;
	}

	private VehiclePushAnalysis buildAnalysis(VehiclePush vehiclePush) {
		VehiclePushAnalysis analysis = new VehiclePushAnalysis();
		analysis.setVin(vehiclePush.getVin());
		
		return analysis;
	}

}

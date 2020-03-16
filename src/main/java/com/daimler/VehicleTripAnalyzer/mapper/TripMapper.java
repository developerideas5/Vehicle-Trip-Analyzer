package com.daimler.VehicleTripAnalyzer.mapper;

import java.util.List;
import java.util.stream.Collectors;
import java.lang.*;

import org.springframework.stereotype.Component;

import com.daimler.VehicleTripAnalyzer.dto.BreakDTO;
import com.daimler.VehicleTripAnalyzer.dto.CityDTO;
import com.daimler.VehicleTripAnalyzer.dto.VehiclePushAnalysisDTO;
import com.daimler.VehicleTripAnalyzer.dto.VehiclePushDTO;
import com.daimler.VehicleTripAnalyzer.dto.VehiclePushDataPointDTO;
import com.daimler.VehicleTripAnalyzer.model.Break;
import com.daimler.VehicleTripAnalyzer.model.City;
import com.daimler.VehicleTripAnalyzer.model.VehiclePush;
import com.daimler.VehicleTripAnalyzer.model.VehiclePushAnalysis;
import com.daimler.VehicleTripAnalyzer.model.VehiclePushDataPoint;
@Component
public class TripMapper {

	public VehiclePush mapVehiclePushDTO(VehiclePushDTO vehiclePushDTO) {
		VehiclePush vehiclePush = new VehiclePush();
		vehiclePush.setVin(vehiclePushDTO.getVin());
		vehiclePush.setBreakThreshold(vehiclePush.getBreakThreshold());
		vehiclePush.setGasTankSize(vehiclePushDTO.getGasTankSize());
		final List<VehiclePushDataPointDTO> vehiclePushDataPointList = vehiclePushDTO.getVehiclePushDataPointDTOList();
		if (vehiclePushDataPointList != null) {
			vehiclePush.setData(vehiclePushDataPointList.stream().map(p-> map(p)).collect(Collectors.toList()));
		}
		return vehiclePush;
	}

	private VehiclePushDataPoint map(VehiclePushDataPointDTO vehiclePushDataPointDTO) {
		final VehiclePushDataPoint vehiclePushDataPoint = new VehiclePushDataPoint(); 
		vehiclePushDataPoint.setTimestamp(vehiclePushDataPointDTO.getTimestamp());
		vehiclePushDataPoint.setOdometer(vehiclePushDataPointDTO.getOdometer());
		vehiclePushDataPoint.setFuelLevel(vehiclePushDataPointDTO.getFuelLevel());
		vehiclePushDataPoint.setPositionLat(vehiclePushDataPointDTO.getPositionLat());
		vehiclePushDataPoint.setPositionLong(vehiclePushDataPointDTO.getPositionLong());
		return vehiclePushDataPoint;
	}

	public VehiclePushDTO mapVehiclePush(VehiclePush vehiclePush) {
		VehiclePushDTO vehiclePushDTO = new VehiclePushDTO();
		vehiclePushDTO.setVin(vehiclePush.getVin());
		vehiclePushDTO.setBreakThreshold(vehiclePush.getBreakThreshold());
		vehiclePushDTO.setGasTankSize(vehiclePush.getGasTankSize());
		
		final List<VehiclePushDataPoint> dataPoints = vehiclePush.getData();
		if(dataPoints!=null){
			vehiclePushDTO.setVehiclePushDataPointDTOList(dataPoints.stream().map(p->mapDataPoints(p)).collect(Collectors.toList()));
		}
		return vehiclePushDTO;
	}

	private VehiclePushDataPointDTO mapDataPoints(VehiclePushDataPoint dataPoint) {
		final VehiclePushDataPointDTO vehiclePushDataPointDTO = new VehiclePushDataPointDTO();
		vehiclePushDataPointDTO.setTimestamp(dataPoint.getTimestamp());
		vehiclePushDataPointDTO.setOdometer(dataPoint.getOdometer());
		vehiclePushDataPointDTO.setFuelLevel(dataPoint.getFuelLevel());
		vehiclePushDataPointDTO.setPositionLat(dataPoint.getPositionLat());
		vehiclePushDataPointDTO.setPositionLong(dataPoint.getPositionLong());
		return vehiclePushDataPointDTO;
	}


	public VehiclePushAnalysisDTO mapVehicleAnaysis(
			VehiclePushAnalysis vehiclePushAnalysis ) {
		
		VehiclePushAnalysisDTO pushAnalysisDTO = new VehiclePushAnalysisDTO();
		pushAnalysisDTO.setVin(vehiclePushAnalysis.getVin());
		
		if (vehiclePushAnalysis.getDeparture() != null) {
			pushAnalysisDTO.setDeparture(mapCity(vehiclePushAnalysis.getDeparture()));
		}
		
		
		if (vehiclePushAnalysis.getDestination() != null) {
			pushAnalysisDTO.setDestination(mapCity(vehiclePushAnalysis.getDestination()));
		}
		pushAnalysisDTO.setConsumption(5.5f);
		
		final List<Break> refuelStops = vehiclePushAnalysis.getBreaks();
		pushAnalysisDTO.setRefuelStops(refuelStops.stream().map(p->map(p)).collect(Collectors.toList()));
		
		final List<Break> breakList = vehiclePushAnalysis.getBreaks();
			pushAnalysisDTO.setBreaks(breakList.stream().map(p->map(p)).collect(Collectors.toList()));
		
		return pushAnalysisDTO;
	}

	private CityDTO mapCity(City city) {
		CityDTO cityDTO = new CityDTO(city.getCityname()); 
		return cityDTO;
	}
	
	private City mapCity(CityDTO cityDTO) {
		City city = new City(cityDTO.getCityname()); 
		return city;
	}

	public VehiclePushAnalysis mapVehicleAnaysis(
			VehiclePushAnalysisDTO vehiclePushAnalysisDTO ) {
		
		VehiclePushAnalysis pushAnalysis = new VehiclePushAnalysis();
		pushAnalysis.setVin(vehiclePushAnalysisDTO.getVin());
		
		if (vehiclePushAnalysisDTO.getDeparture() != null) {
			pushAnalysis.setDeparture(mapCity(vehiclePushAnalysisDTO.getDeparture()));
		}
		
		if (vehiclePushAnalysisDTO.getDestination() != null) {
			pushAnalysis.setDestination(mapCity(vehiclePushAnalysisDTO.getDestination()));
		}
		pushAnalysis.setConsumption(5.5f);
		
		
		final List<BreakDTO> refuelStops = vehiclePushAnalysisDTO.getBreaks();
		pushAnalysis.setRefuelStops(refuelStops.stream().map(p->mapBreaks(p)).collect(Collectors.toList()));
		
		final List<BreakDTO> breakList = vehiclePushAnalysisDTO.getBreaks();
		pushAnalysis.setBreaks(breakList.stream().map(p->mapBreaks(p)).collect(Collectors.toList()));
		
		return pushAnalysis;
	}
	private BreakDTO map(Break breakList) {
		
		BreakDTO breakDTO = new BreakDTO();
		breakDTO.setStartTimestamp(breakList.getStartTimestamp());
		breakDTO.setEndTimestamp(breakList.getEndTimestamp());
		breakDTO.setPositionLat(breakList.getPositionLat());
		breakDTO.setPositionLong(breakList.getPositionLong());
		return breakDTO;
	}
	
	private Break mapBreaks(BreakDTO breakList) {
		
		Break breakdao = new Break();
		breakdao.setStartTimestamp(breakList.getStartTimestamp());
		breakdao.setEndTimestamp(breakList.getEndTimestamp());
		breakdao.setPositionLat(breakList.getPositionLat());
		breakdao.setPositionLong(breakList.getPositionLong());
		return breakdao;
	}
	
	/*public VehiclePushAnalysisDTO mapVehicleAnaysis(VehiclePushAnalysis vehiclePushAnalysis ,final VehiclePushAnalysis analysis) {
		
		VehiclePushAnalysisDTO pushAnalysisDTO = new VehiclePushAnalysisDTO();
		pushAnalysisDTO.setVin(vehiclePushAnalysis.getVin());
		
		pushAnalysisDTO.setDeparture(departure);
		pushAnalysisDTO.setDestination(destination);
		pushAnalysisDTO.setRefuelStops(refuelStops);
		pushAnalysisDTO.setConsumption(consumption);
		
		final List<Break> breakList = analysis.getBreaks();
		pushAnalysisDTO.setBreaks(breakList.stream().map(mapper->mapBreaks(mapper)).collect(Collectors.toList()));
		
		return pushAnalysisDTO;
	}

	private Break mapBreak(BreakDTO breaks) {
		return null;
		
	}



	public VehiclePushDTO mapVehicleAnaysis(
			VehiclePushAnalysis vehiclePushAnalysis) {
		// TODO Auto-generated method stub
		return null;
	}
*/


	

}

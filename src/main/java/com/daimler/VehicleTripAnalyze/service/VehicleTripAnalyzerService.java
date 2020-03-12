package com.daimler.VehicleTripAnalyze.service;

import org.springframework.stereotype.Service;

import com.daimler.VehicleTripAnalyze.daos.VehiclePush;


@Service
public class VehicleTripAnalyzerService {
    private VehiclePush vehiclepush;

    public VehiclePush load() {
        return vehiclepush;
    }

    public void save(final VehiclePush vehiclepush) {
        this.vehiclepush = vehiclepush;
    }
	
}

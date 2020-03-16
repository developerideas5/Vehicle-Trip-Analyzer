package com.daimler.VehicleTripAnalyzer.dto;

public class CityDTO {

	private String id;
	private String cityname;
	private String latitude;
	private String lontitude;
	
	public CityDTO(String cityname) {
		this.cityname = cityname;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getCityname() {
		return cityname;
	}
	public void setCityname(String cityname) {
		this.cityname = cityname;
	}
	public String getLatitude() {
		return latitude;
	}
	public void setLatitude(String latitude) {
		this.latitude = latitude;
	}
	public String getLontitude() {
		return lontitude;
	}
	public void setLontitude(String lontitude) {
		this.lontitude = lontitude;
	}
	@Override
	public String toString() {
		return "CityDTO [id=" + id + ", cityname=" + cityname + ", latitude="
				+ latitude + ", lontitude=" + lontitude + "]";
	}
}

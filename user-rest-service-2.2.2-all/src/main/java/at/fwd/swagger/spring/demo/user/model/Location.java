package at.fwd.swagger.spring.demo.user.model;

import io.swagger.annotations.ApiModelProperty;

import java.math.BigDecimal;

/**
 * Location object (shows BigDecimal)
 * 
 * @author johannes.fiala@fwd.at
 *
 */
public class Location {
	
	String street;
	
	String zip;
	
	String city;
	
	String country;
	
	@ApiModelProperty(notes="demo for java.math.BigDecimal")
	BigDecimal latitude;
	
	@ApiModelProperty(notes="demo for java.lang.Double")
	Double longitude;

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getZip() {
		return zip;
	}

	public void setZip(String zip) {
		this.zip = zip;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public BigDecimal getLatitude() {
		return latitude;
	}

	public void setLatitude(BigDecimal latitude) {
		this.latitude = latitude;
	}

	public Double getLongitude() {
		return longitude;
	}

	public void setLongitude(Double longitude) {
		this.longitude = longitude;
	}

	
	
}

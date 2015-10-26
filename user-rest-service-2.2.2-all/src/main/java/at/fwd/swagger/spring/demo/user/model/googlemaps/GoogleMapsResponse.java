package at.fwd.swagger.spring.demo.user.model.googlemaps;

import java.util.List;

public class GoogleMapsResponse {

	private List<GoogleMapsLocation> locations;

	private String status;
	
	public List<GoogleMapsLocation> getLocations() {
		return locations;
	}

	public void setLocations(List<GoogleMapsLocation> locations) {
		this.locations = locations;
	}
	
	
	
}

package com.tripplanner.RestTemplateApi;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import com.tripplanner.model.CoordinateResponse;
import com.tripplanner.model.Feature;

public class CoordinateRestApi {
	
	private final String openTripCoordinateUrl="https://api.opentripmap.com/0.1/en/places/geoname";
	
	private final String openTripKey="5ae2e3f221c38a28845f05b6dc99f7373176fcd195db4f7912094a13";
	
	public List<Feature> getQuardinates(String city,String radius) {
		RestTemplate restTemplate = new RestTemplate();
		String uri=openTripCoordinateUrl+"?name="+city+"&country=in&apikey="+openTripKey;
		ResponseEntity<CoordinateResponse> response
		  = restTemplate.getForEntity(uri, CoordinateResponse.class);
		PlacesRestApi interestingPlaces=new PlacesRestApi();
		List<Feature> places=interestingPlaces.getInterestingPlaces(response.getBody(),radius);
		return places;
	}
}


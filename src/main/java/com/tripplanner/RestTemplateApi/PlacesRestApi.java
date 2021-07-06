package com.tripplanner.RestTemplateApi;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import com.tripplanner.model.CoordinateResponse;
import com.tripplanner.model.Feature;
import com.tripplanner.model.InterestingPlaces;

public class PlacesRestApi {

	private final String openTripPlacesUrl="https://api.opentripmap.com/0.1/en/places/radius";
	private final String openTripKey="5ae2e3f221c38a28845f05b6dc99f7373176fcd195db4f7912094a13";
	
	public List<Feature> getInterestingPlaces(CoordinateResponse coordinates,String radius) {
		RestTemplate restTemplate = new RestTemplate();
		String uri=openTripPlacesUrl+ "?radius=" +radius+ "&lon=" + coordinates.getLon() + "&lat=" +coordinates.getLat() +"&kinds=climbing,"
				+ "winter_sports,religion,view_points,natural,historic,cultural,historic_architecture"
				+ "&apikey="+openTripKey;
		ResponseEntity<InterestingPlaces> response= restTemplate.getForEntity(uri, InterestingPlaces.class);
		List<Feature> features=response.getBody().getFeatures().stream().filter((feature)-> feature.getProperties().getName()!=null 
				&& !feature.getProperties().getName().isEmpty()).collect(Collectors.toList());
		return features;
	}

	
}
package com.tripplanner.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.tripplanner.RestTemplateApi.CoordinateRestApi;
import com.tripplanner.model.Feature;

@Service(value = "placesService")
public class PlacesServiceImpl implements PlacesService {

	@Override
	public List<Feature> getListOfPlaces(String city, String radius) throws Exception {
		CoordinateRestApi rest=new CoordinateRestApi();
		List<Feature> response=rest.getQuardinates(city,radius);
		return response;
	}

	
	
}

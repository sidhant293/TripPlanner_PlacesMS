package com.tripplanner.service;

import java.util.List;

import com.tripplanner.model.Feature;

public interface PlacesService {

	public List<Feature> getListOfPlaces(String city,String radius) throws Exception;

	
}

package com.tripplanner.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

import com.tripplanner.model.Feature;
import com.tripplanner.service.PlacesService;
import com.tripplanner.utility.HimachalCities;

@CrossOrigin
@RestController
@RequestMapping("places")
public class OpenTripAPI {

	@Autowired
	private PlacesService placesService;
	
	@GetMapping(value="/getCoordinates/{city}/{radius}")
	public ResponseEntity<List<Feature>> getListOfPlaces(@PathVariable(value = "city") String city,@PathVariable(value = "radius") String radius){
		
		List<Feature> response;
		try {
			response = placesService.getListOfPlaces(city, radius);
			return new ResponseEntity<List<Feature>>(response,HttpStatus.OK);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			throw new ResponseStatusException(HttpStatus.UNAUTHORIZED, e.getMessage());
		}	
	}
	
	@GetMapping(value="/getCities")
	public ResponseEntity<String[]> getCities(){
	
		try {
			String cities[]= new HimachalCities().getListOfCities();
			return new ResponseEntity<String[]>(cities,HttpStatus.OK);
		} catch (Exception e) {
			throw new ResponseStatusException(HttpStatus.UNAUTHORIZED, "Some Error Occured While Getting Cities");
		}
				
	}

}

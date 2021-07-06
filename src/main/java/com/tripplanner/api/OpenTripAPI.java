package com.tripplanner.api;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tripplanner.RestTemplateApi.CoordinateRestApi;
import com.tripplanner.model.Feature;

@CrossOrigin
@RestController
@RequestMapping("places")
public class OpenTripAPI {

	@GetMapping(value="/getCoordinates/{city}/{radius}")
	public ResponseEntity<List<Feature>> registerUser(@PathVariable(value = "city") String city,@PathVariable(value = "radius") String radius){
		CoordinateRestApi rest=new CoordinateRestApi();
		List<Feature> response=rest.getQuardinates(city,radius);
		return new ResponseEntity<List<Feature>>(response,HttpStatus.OK);
	}

}

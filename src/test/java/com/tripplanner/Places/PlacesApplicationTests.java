package com.tripplanner.Places;

import java.util.List;

import org.apache.http.util.Asserts;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import com.tripplanner.RestTemplateApi.CoordinateRestApi;
import com.tripplanner.model.Feature;
import com.tripplanner.utility.HimachalCities;

@SpringBootTest
class PlacesApplicationTests {

	@Test
	void testPlacesService() {
		String cities[]= new HimachalCities().getListOfCities();
		CoordinateRestApi rest=new CoordinateRestApi();
		
		for(String city:cities) {
			System.out.println("****************************"+city+"***********************");
			List<Feature> response=rest.getQuardinates(city,"10000");
			
			System.out.println(response);
			for(int i=0;i<10000;i++);
		}
		Asserts.notNull(cities,"Shouldnt be null");
	}

}

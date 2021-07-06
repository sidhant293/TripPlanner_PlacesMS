package com.tripplanner.model;

import lombok.Getter;

@Getter
public class Feature {
	private String type;
	private String id;
	private Geometry geometry;
	private Properties properties;
}

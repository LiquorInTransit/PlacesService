package com.gazorpazorp.model;

import java.util.List;

public class PlaceList {
	private List<Place> places;
	
	public PlaceList(List<Place> places) {
		this.places = places;
	}

	public List<Place> getPlaces() {
		return places;
	}
	public void setPlaces(List<Place> places) {
		this.places = places;
	}
}

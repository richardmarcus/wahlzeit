package org.wahlzeit.model;

public class Location {

	private Coordinate coord;
		
	public Location(Coordinate coord) {
		this.coord=coord;
	}
	
	public void setCoordinate(Coordinate coord) {
		this.coord=coord;
	}
	
	public Coordinate getCoordinate() {
		return coord;
	}
	
	@Override
	public boolean equals (Object comp) {
		if(comp!=null && comp.getClass()==this.getClass()) {
			return getCoordinate().isEqual(((Location) comp).getCoordinate());
		}
		return false;
	}
}

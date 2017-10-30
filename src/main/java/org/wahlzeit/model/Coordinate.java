package org.wahlzeit.model;

public class Coordinate {

	private double x;
	private double y;
	private double z;
	
	public Coordinate(double x, double y, double z) {
		this.x=x;
		this.y=y;
		this.z=z;
	}
	
	public void setX(double x) {
		this.x=x;
	}
	public double getX() {
		return x;
	}
	
	public void setY(double y) {
		this.y=y;
	}
	public double getY() {
		return y;
	}
	
	public void setZ(double z) {
		this.z=z;
	}
	public double getZ() {
		return z;
	}
	
	
	
	public double getDistance(Coordinate coord) {
		
		double dX=coord.x-this.x;
		double dY=coord.y-this.y;
		double dZ=coord.z-this.z;
		
		return Math.sqrt(dX*dX+dY*dY+dZ*dZ);
	}
	
	public boolean isEqual(Coordinate coord) {
		
		if(this.x==coord.x && this.y==coord.y && this.z==coord.z) {
			return true;
		}
			
		return false;
	}
	
	@Override
	public boolean equals(Object comp) {
		
		if (comp!=null && comp.getClass()==this.getClass()) {
	
			return isEqual((Coordinate) comp);
			
		}
			return false;
		
	}
	
}

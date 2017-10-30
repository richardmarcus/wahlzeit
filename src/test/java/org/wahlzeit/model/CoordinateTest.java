package org.wahlzeit.model;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNotNull;


import org.junit.Before;
import org.junit.Test;

public class CoordinateTest {
	
	private Coordinate coord;
	private Coordinate xOff;
	private Coordinate yOff;
	private Coordinate zOff;
	private double epsilon = 0.00001;
	private double x=10;
	private double y=-2;
	private double z=0;
	private double offset =1;
	
	
	
	
	@Before
	public void initCoordinate() {
		coord= new Coordinate(x,y,z);
		xOff= new Coordinate(x-offset,y,z);
		yOff= new Coordinate(x,y-offset,z);
		zOff= new Coordinate(x,y,z-offset);
	}
	
	
	@Test
	public void testEquals() {
		
		Object fake = new Object();
		
		
		assertEquals(coord,coord);
		assertEquals(coord, new Coordinate(x,y,z));
		assertNotEquals(coord,fake);
		assertNotEquals(fake,coord);
		assertNotEquals(null,coord);
		assertNotEquals(coord,null);
		assertNotEquals(xOff,coord);
		assertNotEquals(yOff,coord);
		assertNotEquals(zOff,coord);
	}
	
	@Test
	public void testConstructor() {
		assertNotNull(coord);
	}
	
	
	@Test
	public void testGetter() {
		assertEquals(coord.getX(),x,epsilon);
		assertEquals(coord.getY(),y,epsilon);
		assertEquals(coord.getZ(),z,epsilon);
			
	}
	
	@Test
	public void testSetter() {
		
		Coordinate base = new Coordinate(-1,-1,-1);
		
		assertNotEquals(coord,base);
		
		base.setX(x);
		base.setY(y);
		base.setZ(z);
		
		assertEquals(coord,base);
	
			
	}
	
	@Test
	public void testGetDistance() {
		
	
		
		assertEquals(0,coord.getDistance(coord),epsilon);
		assertEquals(1,coord.getDistance(xOff),epsilon);
		assertEquals(1,coord.getDistance(yOff),epsilon);
		assertEquals(1,coord.getDistance(zOff),epsilon);
		
		
	}
	


	
	
}

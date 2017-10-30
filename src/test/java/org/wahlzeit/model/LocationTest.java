package org.wahlzeit.model;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Before;
import org.junit.Test;

public class LocationTest {

	private Coordinate coord;
	private Location loc;
	private double x=10;
	private double y=-2;
	private double z=0;

	@Before
	public void initCoordinate() {
		coord= new Coordinate(x,y,z);
		loc = new Location(coord);
	}
	
	@Test
	public void testConstructor() {
		assertNotNull(loc);
		
	}
	
	
	@Test
	public void testGetter() {
		assertEquals(loc.getCoordinate(),coord);
	
			
	}
	
	@Test
	public void testEquals() {
		
		assertEquals(new Location(coord), loc);
		assertEquals(loc, loc);
		Object fake = new Object();
		assertNotEquals(fake,loc);
		assertNotEquals(loc,fake);
		assertNotEquals(null,loc);
		assertNotEquals(loc,null);
	
	
				
	}
	
	@Test
	public void testSetter() {
		
		Coordinate base = new Coordinate(-1,-1,-1);
		Location test= new Location(base);
		
		assertNotEquals(loc,test);
		
		base.setX(x);
		base.setY(y);
		base.setZ(z);
		
		test.setCoordinate(base);
		
		assertEquals(loc,test);
	
			
	}
}

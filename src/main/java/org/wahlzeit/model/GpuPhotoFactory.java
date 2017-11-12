/*
 * GpuPhotoFactory.java
 * 
 * Version 1.0
 * 
 * 12.11.2017
 */
package org.wahlzeit.model;

public class GpuPhotoFactory extends PhotoFactory{

	
	//factory methods, same as in PhotoFactory, one with id and one without
	
	public GpuPhoto createPhoto(String model, int ram, int year) {
		return new GpuPhoto(model, ram, year);
	}

	
	public GpuPhoto createPhoto(PhotoId id,String model, int ram, int year) {
		return new GpuPhoto(id, model, ram, year);
	}
	
	
}

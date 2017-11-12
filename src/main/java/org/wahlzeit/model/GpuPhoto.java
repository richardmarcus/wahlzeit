/*
 * GpuPhoto.java
 * 
 * Version 1.0
 * 
 * 12.11.2017
 */
package org.wahlzeit.model;

public class GpuPhoto extends Photo{


protected String gpuModel;
protected int vRamSize; 
protected int releaseYear;


//two constructors, one with id as input and one without just as in Photo.java

public GpuPhoto(String model, int ram, int year){
	id = PhotoId.getNextId();
	incWriteCount();

	gpuModel=model;
	vRamSize=ram;
	releaseYear=year;
    
}

public GpuPhoto(PhotoId myId, String model, int ram, int year) {
	id = myId;
	incWriteCount();

	gpuModel=model;
	vRamSize=ram;
	releaseYear=year;
}


//setters
public void setModel(String model) {
	gpuModel=model;
}

public void setRam(int ram) {
	vRamSize=ram;
}

public void setYear(int year) {
	releaseYear=year;
}

//getters
public String getModel() {
	return gpuModel;
}

public int getRam() {
	return vRamSize;
}

public int getYear() {
	return releaseYear;
}



}

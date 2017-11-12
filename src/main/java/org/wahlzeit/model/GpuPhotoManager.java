/*
 * GpuPhotoManager.java
 * 
 * Version 1.0
 * 
 * 12.11.2017
 */
package org.wahlzeit.model;

import java.util.ArrayList;
import java.util.Collection;
import java.util.logging.Logger;

import org.wahlzeit.services.LogBuilder;

import com.googlecode.objectify.ObjectifyService;
import com.googlecode.objectify.Work;

public class GpuPhotoManager extends PhotoManager{

	private static final Logger log = Logger.getLogger(GpuPhotoManager.class.getName());
	
	//this seemed to not work with GpuPhoto out of the box (maybe), so I tried to change it...
	
	@Override
	public void loadPhotos() {
		Collection<GpuPhoto> existingPhotos = ObjectifyService.run(new Work<Collection<GpuPhoto>>() {
			@Override
			public Collection<GpuPhoto> run() {
				Collection<GpuPhoto> existingPhotos = new ArrayList<GpuPhoto>();
				readObjects(existingPhotos, GpuPhoto.class);
				return existingPhotos;
			}
		});

		for (GpuPhoto photo : existingPhotos) {
			if (!doHasPhoto(photo.getId())) {
				log.config(LogBuilder.createSystemMessage().
						addParameter("Load Photo with ID", photo.getIdAsString()).toString());
				loadScaledImages(photo);
				doAddPhoto(photo);
			} else {
				log.config(LogBuilder.createSystemMessage().
						addParameter("Already loaded Photo", photo.getIdAsString()).toString());
			}
		}

		log.info(LogBuilder.createSystemMessage().addMessage("All photos loaded.").toString());
	}
	
	
}

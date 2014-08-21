package com.epam.airline.creators;
import com.epam.airline.plane.Plane;

public abstract class Builder{

		
		public abstract Plane getPlane(String name, int...args);
	
	
		
}
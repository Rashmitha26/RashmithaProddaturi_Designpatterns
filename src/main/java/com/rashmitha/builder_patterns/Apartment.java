package com.rashmitha.builder_patterns;

public class Apartment extends House {
	int noOfFloors;
    int noOfFlatsPerFloor;
	Apartment(double sqfeet, boolean basementAllowed, String nameOfArchitect,int noOfFloors,int noOfFlatsPerFloor) {
		super(sqfeet, basementAllowed, nameOfArchitect);
		this.noOfFloors=noOfFloors;
		this.noOfFlatsPerFloor=noOfFlatsPerFloor;
		
	}
	@Override
	public String toString()
	{
		String x="Area is "+this.sqfeet+"sq feet.Name of the architect is "+this.nameOfArchitect+" Number of floors are: "+this.noOfFloors+". Number of flats per floor: "+this.noOfFlatsPerFloor;
		if(this.basementAllowed)
			x=x+" Basement allowed";
		else x=x+" Basement not allowed";
		return x;
	}

}

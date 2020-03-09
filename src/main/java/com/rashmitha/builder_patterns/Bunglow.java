package com.rashmitha.builder_patterns;

public class Bunglow extends House{
	int noOfRooms;
	double areaOfVerenda;
	Bunglow(double sqfeet, boolean basementAllowed, String nameOfArchitect,int noOfRooms,double areaOfVerenda) {
		super(sqfeet, basementAllowed, nameOfArchitect);
		this.noOfRooms=noOfRooms;
		this.areaOfVerenda=areaOfVerenda;
		
	}
	@Override
	public String toString()
	{
		String x="Area of bunglow: "+this.sqfeet+" sqfeet. Name of the architect is: "+this.nameOfArchitect+" Number of rooms: "+this.noOfRooms+" Area of verenda is: "+this.areaOfVerenda;
		if(this.basementAllowed)
			x=x+" Basement Allowed.";
		else x=x+" Basement not allowed";
		return x;
	}
	

}

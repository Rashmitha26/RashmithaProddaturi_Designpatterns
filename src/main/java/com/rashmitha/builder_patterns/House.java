package com.rashmitha.builder_patterns;

public abstract class House {
	double sqfeet;
	boolean basementAllowed;
	String nameOfArchitect;
	House(double sqfeet, boolean basementAllowed,String nameOfArchitect){
		this.sqfeet=sqfeet;
		this.basementAllowed=basementAllowed;
		this.nameOfArchitect=nameOfArchitect;
	}

}

package com.rashmitha.builder_patterns;

public class BuilderPattern {
	public static void main(String args[]) {
		Apartment apartment1=new Apartment(200,false,"Mr. XYZ",5,3);
		Apartment apartment2=new Apartment(300,true,"Mr. ABC",4,3);
		Bunglow bunglow1=new Bunglow(250,true,"Ms. PQR",3,100);
		Bunglow bunglow2=new Bunglow(300,false,"Mrs. QWE",5,125);
		System.out.println(apartment1);
		System.out.println(apartment2);
		System.out.println(bunglow1);
		System.out.println(bunglow2);
	}

}

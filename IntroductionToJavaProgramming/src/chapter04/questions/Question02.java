package chapter04.questions;

import java.util.Scanner;

public class Question02 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter point 1 (latitude and longtitude) in degrees: ");
		
		double latitude1 = input.nextDouble();
		double longtitude1 = input.nextDouble();
		
		System.out.println("Enter point 2 (latitude and longtitude) in degrees: ");
		
		double latitude2 = input.nextDouble();
		double longtitude2 = input.nextDouble();
		
		double latitudeR1 = Math.toRadians(latitude1);
		double longtitudeR1 = Math.toRadians(longtitude1);
		
		double latitudeR2 = Math.toRadians(latitude2);
		double longtitudeR2 = Math.toRadians(longtitude2);
		
		double radiusOfEarth = 6_371.01; //km
		double distance = radiusOfEarth * Math.acos(Math.sin(latitudeR1) * Math.sin(latitudeR2) + 
				Math.cos(latitudeR1) * Math.cos(latitudeR2) * Math.cos(longtitudeR1 -longtitudeR2));
		
		System.out.println("The distance between the two points is " + distance + " km.");
		
	}

}

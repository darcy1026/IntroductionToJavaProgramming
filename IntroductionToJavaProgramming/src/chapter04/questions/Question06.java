package chapter04.questions;

public class Question06 {

	public static void main(String[] args) {
		/*
		 * (Random points on a circle) Write a program that generates three random
		 * points on a circle centered at (0, 0) with radius 40 and display three angles
		 * in a triangle formed by these three points, as shown in Figure 4.7a. (Hint:
		 * Generate a random angle a in radians between 0 and 2p, as shown in Figure
		 * 4.7b and the point determined by this angle is (r*cos(a), r*sin(a)).)
		 */
		
		final double RADIUS = 40;
		
		// angles
		double angle1 = (Math.random() * (2 * Math.PI));
		double angle2 = (Math.random() * (2 * Math.PI));
		double angle3 = (Math.random() * (2 * Math.PI));
		
		
		// x and y coordinates of the triangle
		double x1 = RADIUS * Math.cos(angle1);
		double y1 = RADIUS * Math.sin(angle1);
		double x2 = RADIUS * Math.cos(angle2);
		double y2 = RADIUS * Math.sin(angle2);
		double x3 = RADIUS * Math.cos(angle3);
		double y3 = RADIUS * Math.sin(angle3);
		
		//compute three sides
		double a = Math.sqrt(Math.pow(x2 - x3, 2) + Math.pow(y2 - y3, 2));
		double b = Math.sqrt(Math.pow(x1 - x3, 2) + Math.pow(y1 - y3, 2));
		double c = Math.sqrt(Math.pow(x1 - x2, 2) + Math.pow(y1 - y2, 2));
		
		//compute three sides
		double A = Math.toDegrees(Math.acos((a * a - b * b - c * c) / 
				-2 * b * c));
		double B = Math.toDegrees(Math.acos((b * b - a * a - c * c) / 
				-2 * a * c));
		double C = Math.toDegrees(Math.acos((c * c - b * b - a * a) / 
				-2 * b * a));
		
		//results
		System.out.println("The three results are " + 
		Math.round(A * 100) / 100.0 + " " + 
		Math.round(B * 100) / 100.0 + " " +		
		Math.round(C * 100) / 100.0);

		
	}

}

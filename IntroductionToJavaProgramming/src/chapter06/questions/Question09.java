package chapter06.questions;

public class Question09 {

	public static void main(String[] args) {
		
		System.out.printf("%-10s%-10s\t|\t%-10s%-10s","Feet", "Meters", "Meters", "Feet");
		System.out.print("\n------------------------------------------------------");
		// i displays foot, j displays meter, 
		for (int i = 1, j = 20; i <= 10 && j <= 65; i++, j += 5) {
			double feetToMeter = feetToMeter(i);
			double meterToFeet = meterToFeet(j);
			System.out.printf("\n%d\t  %.3f\t\t|\t%d\t  %.3f", i, feetToMeter, j, meterToFeet);
		}
	}
	public static double feetToMeter(double i) {
		double meter = 0.305 * i; 
		return meter;
	}
	public static double meterToFeet(double j) {
		double feet = 3.279 * j; 
		return feet;
	}
}

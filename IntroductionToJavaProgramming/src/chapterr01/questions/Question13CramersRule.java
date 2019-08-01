package chapterr01.questions;

public class Question13CramersRule {

	public static void main(String[] args) {
		double a, b, c, d, e, f;
		a = 3.4;
		b = 50.2;
		c = 2.1;
		d = 0.55;
		e = 44.5;
		f = 5.9;
		double x = ((e * d) - (b * f)) / ((a * d) - (b * c)); // ax + by = e
		double y = ((a * f) - (e * c)) / ((a * d) - (b * c)); // cx + dy = f
		
		System.out.println("x is equal = " + x);
		System.out.println("y is equal = " + y);
		

	}

}

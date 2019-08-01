package chapter05.questions;

public class Question35 {

	public static void main(String[] args) {
		
		double result = 0;
		double sum = 0;
		for (double i = 1; i <= 625; i++) {
			result = 1 / (Math.sqrt(i) + Math.sqrt(i + 1));
			sum += result;
		}
		System.out.printf("%.2f", sum);
	}

}

package chapter05.questions;

public class Question26 {

	public static void main(String[] args) {
		
		double sum = 0;
		double factrl = 1;
		
		for (double i = 1; i <= 10_000; i++) {
			factrl = factrl * i;
			sum += 1 / factrl;
		}
		double e = 1 + sum;
		System.out.println(e);
		
		double sum2 = 0;
		double fact2 = 1;
		for (int j = 1; j <= 20_000; j++) {
			factrl = factrl * j;
			sum2 += 1 / factrl;
		}
		double e2 = 1 + sum;
		System.out.println(e2);
	}

}

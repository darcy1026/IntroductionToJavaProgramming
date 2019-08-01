package chapter05.questions;

public class Question25 {

	public static void main(String[] args) {

		double sum = 0;
		double value = 10_000;
		for (double d = 1; d <= (2 * value - 1); d += 2) {
			sum += 1 / d;
			d += 2;
			sum -= 1 / d;
		}
		double pi = 4 * sum;
		System.out.println(pi);
		
		double sum2 = 0;
		double value2 = 20_000;
		for (double i = 1; i <= (2 * value2 - 1); i+=2) {
			sum2 += 1 / i;
			i+=2;
			sum2 -= 1 / i;
		}
		double pi2 = 4 * sum2;
		System.out.println(pi2);
	}
}

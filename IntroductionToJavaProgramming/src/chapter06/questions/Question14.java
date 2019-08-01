package chapter06.questions;

public class Question14 {

	public static void main(String[] args) {
		double i = 901;
		System.out.println("i\tm(i)\n----------------");
		sum(i);
	}

	public static void sum(double i) {
		for (int l = 1; l <= i; l += 100) {
			double sum = 0;
			for (double j = 1; j <= l; j++) {
				sum += Math.pow(-1, j + 1) / (2 * j - 1);
			}
			sum = sum * 4;
			System.out.printf("%-3d\t%.4f\n", l, sum);

		}
	}
}

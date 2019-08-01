package chapter06.questions;

public class Question13 {

	public static void main(String[] args) {
		double i = 20;
		System.out.println("i\tm(i)\n---------------");
		sum(i);
	}
	public static void sum(double i) {
		int count = 0;
		double sum = 0;
		for (double j = 1; j <= i; j++) {
			sum += j / (j + 1);
			count++;
			System.out.printf("%d\t%.4f\n",count, sum);
		}
	}

}

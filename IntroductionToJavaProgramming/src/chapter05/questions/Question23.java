package chapter05.questions;

public class Question23 {

	public static void main(String[] args) {
		float sum1 = 0;
		int n = 50_000;
		float currentValue = 1 / n;
		for (int i = 1; i < 50_000; i++) {
			sum1 += currentValue;
			n = n - 1;
			currentValue = (float)(1 / n);
			
		}
		
		System.out.println("sum1 = " + sum1);

		float sum2 = 0;
		int n2 = 1;
		float currentValue2 = 1;
		for (int j = 1; j < 50_000; j++) {
			sum2 += currentValue2;
			n2 += 1;
			currentValue2 = (float)(1 / n2);
		}
		System.out.println("sum2 = " + sum2);
		
	}

}

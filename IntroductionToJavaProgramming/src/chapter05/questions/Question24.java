package chapter05.questions;

public class Question24 {

	public static void main(String[] args) {
		int numberPerLine = 10;
		int a = 1;
		int b = 3;
		float sum = 0;
		for (int i = 1; i < 50; i++) {
			if (i % numberPerLine == 0 && i!= 49) {
				System.out.println(a + "/" + b + " + ");
				
			} else if (i != 49) {
				System.out.print(a + "/" + b);
				System.out.print(" + ");
			}
			if(i == 49) {
				System.out.print(a + "/" + b + " = ");
			}
			sum = sum + (float)a/b;
			a += 2;
			b += 2;
		}
		System.out.printf("%.3f", sum);
	}

}

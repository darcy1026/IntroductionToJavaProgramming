package chapter05.questions;

public class Question02 {

	public static void main(String[] args) {
		/*
		 * (Repeat additions) Listing 5.4, SubtractionQuizLoop.java, generates five
		 * random subtraction questions. Revise the program to generate ten random
		 * addition questions for two integers between 1 and 15. Display the correct
		 * count and test time.
		 */
		
		int sum = 0;
		float time1 = System.currentTimeMillis();
		
		for (int i = 0; i < 10; i++) {
			int number1 = (int)(1 + Math.random() * 15);
			int number2 = (int)(1 + Math.random() * 15);
			sum = number1 + number2;
			System.out.println(number1 + " + " + number2 + " = " + sum);
		}
		float time2 = System.currentTimeMillis();
		float time = (time2 - time1);
		System.out.println("total time in second is: " + time);// bu kismi tam anlayamadim
		
	}

}

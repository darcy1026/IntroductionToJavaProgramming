package chapter_07_questions;

public class Question_07_02 {

	public static void main(String[] args) {

		int[] numbers = {10,20,30,40,50,60,70,80,90};

		for (int i = 0; i < numbers.length; i++) {
			System.out.print(numbers[i] + " ");
		}
		 
		System.out.println();
		
		int[] reverse = new int[numbers.length];
		
		for (int i = 0, j = numbers.length - 1; i < numbers.length; i++, j--) {
			reverse[j] = numbers[i];
		}
		for (int i = 0; i < reverse.length; i++) {
			System.out.print(reverse[i] + " ");
		}
		
	}
}

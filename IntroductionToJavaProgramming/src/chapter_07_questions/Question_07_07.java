package chapter_07_questions;

public class Question_07_07 {

	public static void main(String[] args) {
		int numberOfInt = 100;
		int[] number = new int[10];
		int num;
		for (int i = 0; i < numberOfInt; i++) {
			num = (int)(Math.random() * 10);
			number[num]++;
		}
		printArray(number);
	
		
	}

	public static void printArray(int[] number) {
		for (int i = 0; i < number.length; i++) {
			System.out.print("There are " + number[i] + " times " + i + "\n");
		}
		
	}

}

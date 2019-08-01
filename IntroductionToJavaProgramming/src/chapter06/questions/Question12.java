package chapter06.questions;

public class Question12 {

	public static void main(String[] args) {
		System.out.println("The characters between '1' and 'Z' is: ");
		char ch1 = '1';
		char ch2 = 'Z';
		int numberPerLine = 10;
		printChars(ch1, ch2, numberPerLine);
	}

	public static void printChars(char ch1, char ch2, int numberPerLine) {
		
		int count = 0;
		for (char i = ch1; i <= ch2; i++) {
			count++;
			if (count % numberPerLine == 0) {
				System.out.println();
			} else {
				System.out.print(i + " ");
			}

		}

	}

}

package chapter06.questions;

public class Question_38_I_DID_LIKE_IT {

	public static void main(String[] args) {

		int numberOfChar = 100;
		int numberPerLine = 10;

		char letter1 = 'A';
		char letter2 = 'Z';
		char digit1 = '0';
		char digit2 = '9';
		
		printChar(letter1, letter2, numberOfChar, numberPerLine);
		printChar(digit1, digit2, numberOfChar, numberPerLine);

	}

	public static void printChar(char ch1, char ch2, int numberOfChar, int numberPerLine) {
		for (int i = 1; i <= numberOfChar; i++) {
			randomChar(ch1, ch2);
			if (i % numberPerLine == 0) {
				System.out.print(randomChar(ch1, ch2) + " \n");
			} else {
				System.out.print(randomChar(ch1, ch2) + " ");
			}
		}
	}

	public static char randomChar(char ch1, char ch2) {
		return (char) (ch1 + Math.random() * (ch2 - ch1 + 1));
	}

}

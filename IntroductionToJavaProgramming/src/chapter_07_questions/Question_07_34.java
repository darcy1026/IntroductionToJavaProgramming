package chapter_07_questions;

public class Question_07_34 {

	public static void main(String[] args) {
		String str = "helloworld";

		char[] strArray = str.toCharArray();

		java.util.Arrays.sort(strArray);

		for (int i = 0; i < strArray.length; i++) {
			System.out.print(strArray[i]);
		}
	}

}

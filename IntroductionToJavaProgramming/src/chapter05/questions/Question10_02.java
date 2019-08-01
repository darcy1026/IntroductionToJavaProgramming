package chapter05.questions;

public class Question10_02 {

	public static void main(String[] args) {

		int NUMBERS_PER_LINE = 10;
		int count = 0;
		for (int i = 100; i < 1_000; i++) {
			if((i % 5 == 0) && (i % 6 == 0)) {
				count++;
				if (count % NUMBERS_PER_LINE == 0) {
					//System.out.print(i);
					System.out.println();
				}else {
					System.out.print(i + " ");
				}
			}
		}
	}

}

package chapter05.questions;

public class Question27 {

	public static void main(String[] args) {
		int count = 0;
		int tenPerLine = 10;
		for (int leapYear = 101; leapYear < 2100; leapYear++) {
			boolean isLeap = true;
			if ((leapYear % 4 == 0 && leapYear % 100 != 0) || (leapYear % 400 == 0)) {
				isLeap = true;
				count++;
				if (count % 10 == 0) {
					System.out.println(leapYear);
					
				}else {
					System.out.printf("%-5d", leapYear);
				}

			}

		}

	}

}

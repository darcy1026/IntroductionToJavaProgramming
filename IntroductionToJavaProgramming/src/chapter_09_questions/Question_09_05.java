package chapter_09_questions;

import java.util.GregorianCalendar;

public class Question_09_05 {

	public static void main(String[] args) {

		GregorianCalendar calendar = new GregorianCalendar();

		System.out.println("the date is: " + calendar.get(GregorianCalendar.MONTH) + ":"
				+ calendar.get(GregorianCalendar.DAY_OF_MONTH) + ":" + calendar.get(GregorianCalendar.YEAR));

		calendar.setTimeInMillis(1234567898765L);
		System.out.println("Elapsed time since Jan 1 1970"
				+ "");
		System.out.println("the date is: " + calendar.get(GregorianCalendar.MONTH) + ":"
				+ calendar.get(GregorianCalendar.DAY_OF_MONTH) + ":" + calendar.get(GregorianCalendar.YEAR));
		
	}

}

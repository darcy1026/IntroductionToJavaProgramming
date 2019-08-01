package chapter03.questions;

import java.util.Scanner;

public class Question30 {

	public static void main(String[] args) {
		/*
		 * (Current time) Revise Programming Exercise 2.8 to display the hour using a
		 * 12-hour clock.
		 */
		Scanner input = new Scanner(System.in);
		
		long totalMillisecond = System.currentTimeMillis();
		
		long totalSecond = totalMillisecond / 1000;
		
		long currentSecond = totalSecond % 60;
		
		long totalMinute = totalSecond / 60;
		
		long currentMinute = totalMinute % 60;
		
		long totalHour = totalMinute / 60;
		
		long currentHour = totalHour % 24;
		
		System.out.println("Enter the time zone offset to GMT(ex: -5 or +2): ");
		int timeZone = input.nextInt();
		
		currentHour = Math.abs(currentHour + timeZone);
		
		System.out.println("current time is " + ((currentHour > 12) ? currentHour - 12 : currentHour) + ":" + currentMinute +
				 ":" + currentSecond + ((currentHour > 12) ? " PM" : " AM"));
		
	
	
	}
	
}

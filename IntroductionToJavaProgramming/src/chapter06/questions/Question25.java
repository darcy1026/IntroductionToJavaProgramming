package chapter06.questions;

import java.util.Scanner;

public class Question25 {

	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	System.out.print("Enter a milisecond: ");
	long milisecond = input.nextLong();
	
	convertMillis(milisecond);
	
	}
	private static void convertMillis(long milisecond) {
		int seconds = (int)milisecond / 1000;
		if(60 <= seconds) {
			int minutes = seconds / 60;
			seconds = seconds % 60;
			if(60 <= minutes) {
				int hours = minutes / 60;
				minutes = minutes % 60;
				System.out.println(hours + ":" + minutes + ":" + seconds);
			}else {
				System.out.println("0:" + minutes + ":" + seconds);
			}
			
		}else {
			System.out.println("0:0:" + seconds);
		}
		
	}

}

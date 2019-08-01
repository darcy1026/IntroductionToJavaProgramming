package chapter05.questions;

import java.util.Scanner;

public class Question39 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("How much comission you would like to take: ");
		double cmsTotal = input.nextDouble();
		
		double cmsFinal = cmsTotal - 900;
		
		double pay = cmsFinal * (100 / 12);
		pay += 10_000;
		
		System.out.println("You have to sale:" + pay);
		
		
		
	}

}

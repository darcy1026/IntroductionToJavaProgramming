package chapter_07_questions;

import java.util.Scanner;

public class Question_07_26 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter list1: ");
		int first1 = input.nextInt();
		int[] list1 = new int[first1];
		for (int i = 0; i < list1.length; i++) {
			list1[i] = input.nextInt();
		}
		
		System.out.print("Enter list2: ");
		int first2 = input.nextInt();
		int[] list2 = new int[first2];
		for (int i = 0; i < list2.length; i++) {
			list2[i] = input.nextInt();
		}
		
		System.out.println("Two lists are" + (check(list1, list2) ? " " : " not ") + "strictly identical.");
	}

	public static boolean check(int[] list1, int[] list2) {
		for (int i = 0; i < list2.length; i++) {
			if (list1[i] != list2[i])
				return false;
		}
		return true;
	}

}

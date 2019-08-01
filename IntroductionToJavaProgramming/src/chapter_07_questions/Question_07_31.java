package chapter_07_questions;

import java.util.Scanner;

public class Question_07_31 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Enter the LIST1: ");
		int[] list1 = new int[input.nextInt()];
		for (int i = 0; i < list1.length; i++) {
			list1[i] = input.nextInt();
		}

		System.out.println("Enter the LIST2: ");
		int[] list2 = new int[input.nextInt()];
		for (int i = 0; i < list2.length; i++) {
			list2[i] = input.nextInt();
		}

		int[] list3 = merge(list1, list2);

		System.out.println("The merged list is: ");
		for (int e : list3) {
			System.out.print(" " + e);
		}
		System.out.println();

		
	
	}

	public static int[] merge(int[] list1, int[] list2) {
		int[] list3 = new int[list1.length + list2.length];
		
		for (int i = 0; i < list1.length; i++) {
			list3[i] = list1[i];
		}
		
		for (int i = 0, j = list1.length; i < list2.length; i++, j++) {
			list3[j] = list2[i];
	
		}
		
		sorted(list3);
		
		return list3;
	}

	public static void sorted(int[] list3) {
		for (int i = 0; i < list3.length; i++) {
			int currentMin = list3[i];
			int currentMinIndex = i;
			for (int j = i + 1; j < list3.length; j++) {
				if(currentMin > list3[j]) {
					currentMin = list3[j];
					currentMinIndex = j;
				}
			}
			if(currentMinIndex != i) {
				list3[currentMinIndex] = list3[i];
				list3[i] = currentMin;
			}
		}
	}

}

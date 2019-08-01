package chapter05.questions;

public class Question18PatternA {
	public static void main(String[] args) {
		System.out.println("Pattern A");	
		
		int n = 8;
		
		for (int i = 1; i < n; i++) {
			for (int j = 1; j < i + 1; j++) {
				System.out.print(j + " ");
			}
			System.out.println();
		}
	}
}

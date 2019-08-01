package chapter_08_questions;

import java.util.Scanner;

public class Question_08_15_I_DID_LIKE_IT {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter five points: ");
		double[][] points = getPoints();
		System.out.println("The five points are " + (sameLine(points) ? "" : "not ") + "on the same line.");
	}

	public static double[][] getPoints() {
		Scanner input = new Scanner(System.in);
		double[][] m = new double[5][2];
		for (int i = 0; i < m.length; i++) {
			m[i][0] = input.nextDouble();
			m[i][1] = input.nextDouble();
		}
		return m;
	}
	
	public static boolean sameLine(double[][] m) {
		boolean check = true;
		for (int i = 0; i < m.length; i++) {
			for (int j = i + 1; j < m.length; j++) {
				for (int k = j + 1; k < m.length; k++) {
					if(check(m[i][0],m[i][1],m[j][0],m[j][1], m[k][0], m[k][1]) == false) {
						return false;
					}
				}
			}
		}
		return true;
	}

	public static boolean check(double x0, double y0, double x1, double y1, double x2, double y2) {
		double answer = (x1 - x0)*(y2 - y0) - (x2 - x0)*(y1 - y0);
		return (answer == 0) ? true : false;
	}
}

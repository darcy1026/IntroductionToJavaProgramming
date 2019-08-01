package chapter_08_questions;

import java.util.Scanner;

public class Question_08_08 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the number of points");
		int num = input.nextInt();

		System.out.println("Enter " + num + " points");
		double[][] points = getPoints(num);

		int p1 = 0;
		int p2 = 1;
		double shortestDistance = distance(points[p1][0], points[p1][1], points[p2][0], points[p2][1]);

		for (int i = 0; i < points.length; i++) {
			for (int j = i + 1; j < points.length; j++) {
				double distance = distance(points[i][0], points[i][1], points[j][0], points[j][1]);

				if (shortestDistance >= distance) {
					shortestDistance = distance;
					p1 = i;
					p2 = j;
				}
			}
		}

		for (int i = 0; i < points.length; i++) {
			for (int j = i + 1; j < points.length; j++) {
				if (distance(points[i][0], points[i][1], points[j][0], points[j][1]) == shortestDistance) {
					System.out.println("The closest two points are (" + points[i][0] + ", " + points[i][1] + ") and ("
							+ points[j][0] + ", " + points[j][1] + ")");
				}
			}
		}

		System.out.println("Their distance is " + shortestDistance);
	}

	public static double[][] getPoints(int num) {
		Scanner input = new Scanner(System.in);
		double[][] p = new double[num][2];
		for (int i = 0; i < p.length; i++) {
			p[i][0] = input.nextInt();
			p[i][1] = input.nextInt();
		}
		return p;
	}

	public static double distance(double x1, double y1, double x2, double y2) {

		return Math.sqrt(Math.pow(x1 - x2, 2) + Math.pow(y1 - y2, 2));
	}
}

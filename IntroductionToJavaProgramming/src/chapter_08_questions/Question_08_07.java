package chapter_08_questions;

public class Question_08_07 {

	public static void main(String[] args) {
		double[][] points = {{-1, 0, 3}, {-1, -1, -1}, {4, 1, 1},
				{2, 0.5, 9}, {3.5, 2, -1}, {3, 1.5, 3}, {-1.5, 4, 2},
				{5.5, 4, -0.5}};
		
		int p1 = 0;
		int p2 = 1;
		
		double shortestDistance = distance(points[p1][0], points[p1][1], points[p1][2], points[p2][0], points[p2][1], points[p2][2]);
		
		for (int i = 0; i < points.length; i++) {
			for (int j = i + 1; j < points.length; j++) {
				double distance = distance(points[i][0], points[i][1], points[i][2], points[j][0], points[j][1], points[j][2]);
				
				if(shortestDistance > distance) {
					shortestDistance = distance;
					p1 = i;
					p2 = j;
				}
			}
			
		}
		
		System.out.print("The closest two points are (" + points[p1][0] + ", " + points[p1][1] + ", " + points[p1][2] 
				+ ") and (" + points[p2][0] + ", " + points[p2][1] + ", " + points[p2][2] + ")");
	}

	public static double distance(double x1, double y1, double z1, double x2, double y2, double z2) {
		
		return Math.sqrt(Math.pow(x1 - x2, 2) + Math.pow(y1 - y2, 2) + Math.pow(z1 - z2, 2));
	}

}

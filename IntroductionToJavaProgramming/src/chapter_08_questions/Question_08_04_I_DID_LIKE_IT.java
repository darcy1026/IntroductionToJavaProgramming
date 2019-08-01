package chapter_08_questions;

import javax.swing.border.EmptyBorder;

public class Question_08_04_I_DID_LIKE_IT {

	public static void main(String[] args) {

		int[][] employeeHours = { 			// employee[employee number][daily hours]
				{2, 4, 3, 4, 5, 8, 8}, 
				{7, 3, 4, 3, 3, 4, 4}, 
				{3, 3, 4, 3, 3, 2, 2},
				{9, 3, 4, 7, 3, 4, 1}, 
				{3, 5, 4, 3, 6, 3, 8}, 
				{3, 4, 4, 6, 3, 4, 4}, 
				{3, 7, 4, 8, 3, 8, 4},
				{6, 3, 5, 9, 2, 7, 9}};
		
		// name and total hours
		int[][] nameAndTotalHours = new int[employeeHours.length][2]; 
		
		findTotalHours(employeeHours, nameAndTotalHours);
		
		print(nameAndTotalHours);
		
		System.out.println("===================================");
		
		sort(nameAndTotalHours);
		
		print(nameAndTotalHours);
		
		//----------------------------------------------------------------------------
	}

	public static void findTotalHours(int[][] employeeHours, int[][] nameAndTotalHours) {
		for (int i = 0; i < employeeHours.length; i++) {
			int sum = 0;
			for (int j = 0; j < employeeHours[i].length; j++) {
				sum += employeeHours[i][j];
			}
			nameAndTotalHours[i][0] = i;
			nameAndTotalHours[i][1] = sum; 
		}
	}
	//------------------------------------------------------------------
	public static void sort(int[][] m) {
		for (int i = 0; i < m.length; i++) {
			int minEmpName = m[i][0];
			int minHour = m[i][1];
			int minIndex = i;
			for (int j = i + 1; j < m.length; j++) {
				if(minHour < m[j][1]) {
					minHour = m[j][1];
					minEmpName = m[j][0];
					minIndex = j;
				}
			}
			if(minIndex != i) {
				m[minIndex][0] = m[i][0];
				m[minIndex][1] = m[i][1];
				m[i][0] = minEmpName;
				m[i][1] = minHour;
			}
		}
	}
	//-------------------------------------------------------------------
	public static void print(int[][] nameAndTotalHours) {
		for (int i = 0; i < nameAndTotalHours.length; i++) {
			System.out.println("Employee " + nameAndTotalHours[i][0] + " has " + nameAndTotalHours[i][1] + " hours worked.");
		}
	}
}

package chapter06.questions;

public class Question16 {

	public static void main(String[] args) {
		int year1 = 2000;
		int year2 = 2020;
		System.out.print("Years\tNumber of Days\n");
		System.out.print("=======================\n");
		numberOfDays(year1, year2);
	}
	public static void numberOfDays(int year1, int year2) {
		for (int i = year1; i <= year2; i++) {
			System.out.print(i + "\t" + ((isLeap(i)) ? "366" : "365"));
			System.out.println();
		}
	}
	public static boolean isLeap(int i) {
		if ((i % 4 == 0 && i % 100 != 0) || (i % 400 == 0)) {
			return true;
		} else {
			return false;
		}
	}
}

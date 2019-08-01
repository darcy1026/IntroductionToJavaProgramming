package chapter06.questions;

public class Question15I_DID_LIKE_IT {
	public static void main(String[] args) {
		System.out.print("Taxable\t\tSingle\t\tMarried Joint\t\tMarried \t\tHead of\n");
		System.out.print("Income \t\t      \t\tor Qualifying\t\tSeparate\t\ta House\n");
		System.out.print("\t\t\t\tWindow(er)\n");
		System.out.println("=======================================================================================");
		for (int income = 50_000; income <= 60_000; income += 50) {
			System.out.print(income + "\t\t" + Math.round(single(income)) + "\t\t" + Math.round(marriedJoint(income)) + "\t\t\t"
					+ Math.round(marriedSeparate(income)) + "\t\t\t" + Math.round(headHouse(income)));
			System.out.println();
		}
	}

	public static double single(double income) {
		double single = 8_350 * 0.1 + (33_950 - 8_350) * 0.15 + (income - 33_950) * 0.25;
		return single;
	}

	public static double marriedJoint(double income) {
		double marriedJoint = 16_100 * 0.1 + (income - 16_100) * 0.15;
		return marriedJoint;
	}

	public static double marriedSeparate(double income) {
		double marriedSeparate = 8_350 * 0.1 + (33_950 - 8_350) * 0.15 + (income - 33_950) * 0.25;
		return marriedSeparate;
	}
	public static double headHouse(double income) {
		double headHouse = 11_950 * 0.1 + (45_500 - 11_950) * 0.15 + (income - 45_500) * 0.25;
		return headHouse;
	}
}

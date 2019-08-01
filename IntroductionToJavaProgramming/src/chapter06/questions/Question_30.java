package chapter06.questions;

public class Question_30 {

	public static void main(String[] args) {
		int sum = rollDice();
		System.out.println("You rolled" + sum);

		if (craps(sum)) {
			System.out.println("You lost.");
		} else if (natural(sum)) {
			System.out.println("You win.");
		} else if (established(sum) == true) {
			System.out.println("You win.");
		} else {
			System.out.println("You lose.");
		}

	}

	public static boolean established(int sum) {
		if (sum == 4 || sum == 5 || sum == 6 || sum == 8 || sum == 10) {
			int temp = 30;
		}
			

	}

	public static boolean natural(int sum) {
		if (sum == 7 || sum == 11)
			return true;
		else
			return false;
	}

	public static boolean craps(int sum) {
		if (sum == 2 || sum == 3 || sum == 12)
			return true;
		else
			return false;
	}

	public static int rollDice() {
		int dice1 = 1 + (int) (Math.random() * 6);
		int dice2 = 1 + (int) (Math.random() * 6);
		int sum = dice1 + dice2;
		return sum;
	}

}

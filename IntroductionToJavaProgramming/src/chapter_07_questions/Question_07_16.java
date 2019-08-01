package chapter_07_questions;

public class Question_07_16 {

	public static void main(String[] args) {
		int[] number = new int[100_000];

		int key = getNumber();
		System.out.println("Key is: " + key);

		for (int i = 0; i < number.length; i++) {
			number[i] = getNumber();
		}

		linearSearch(number, key);
		java.util.Arrays.sort(number);
		long startTime = System.currentTimeMillis();
		binarySeacrh(number, key);
		long endTime = System.currentTimeMillis();
		long totalBinaryTime = endTime - startTime;
		System.out.println("Total time for binary"
				+ " search:" + totalBinaryTime);
		
		

	}

	public static int binarySeacrh(int[] number, int key) {
		int low = 0;
		int high = number.length - 1;
		while (high >= low) {
			int mid = (low + high) / 2;
			if(key < number[mid])
				high = mid - 1;
			else if(key == number[mid])
				return mid;
			else if (key > number[mid])
				low  = mid + 1;
		}
		return -1;
		
	}

	public static void linearSearch(int[] array, int key) {
		long startTime = System.currentTimeMillis();
		
		for (int i = 0; i < array.length; i++) {
			if(key == array[i])
				break;
		}
		}
		
		long endTime = System.currentTimeMillis();
		long totalLinearTime = endTime - startTime;
		System.out.println("Total time for linear search:" + totalLinearTime);
	}

	private static int getNumber() {
		return (int) (Math.random() * 100_000);

	}

}

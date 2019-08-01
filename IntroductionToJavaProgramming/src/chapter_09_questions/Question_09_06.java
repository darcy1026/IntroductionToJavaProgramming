package chapter_09_questions;

public class Question_09_06 {

	public static void main(String[] args) {

		StopWatch stopWatch = new StopWatch();

		int[] randomArray = getArray();

		selectionSort(randomArray);

		stopWatch.stop();

		System.out.println("The execution time of sorting 100_000\n" + "numbers using selection sort: "
				+ stopWatch.getElapsedTime() + "milliseconds");
	}

	public static int[] getArray() {
		int[] array = new int[100_000];
		for (int i = 0; i < array.length; i++) {
			array[i] = (int) (Math.random() * 100);
		}
		return array;
	}

	public static void selectionSort(int[] array) {
		for (int i = 0; i < array.length; i++) {
			int min = array[i];
			int minIndex = i;
			for (int j = i + 1; j < array.length; j++) {
				if (array[i] > array[j]) {
					min = array[j];
					minIndex = j;
				}
			}
			if (minIndex != i) {
				array[minIndex] = array[i];
				array[i] = min;
			}

		}
	}

}

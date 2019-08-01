package chapter06.questions;

public class Question08 {

	public static void main(String[] args) {
		//double fahrenheit = 120;
		//double celsius = 40;
		System.out.print("Celcius\t\tFahrenheit\t|\tFahrenheit\tCelsius\n");
		System.out.print("---------------------------------------------------------------");
		for (int i = 40, j = 120; i >= 31 && j >= 30; i--, j -= 10) {
			double celciusToFahrenheit = celciusToFahrenheit(i);
			double fahrenheitToCelcius = fahrenheitToCelcius(j);
			System.out.printf("\n%d\t\t%.1f\t\t|\t%d\t\t%.2f", i, celciusToFahrenheit, j, fahrenheitToCelcius);
		}
	}

	public static double celciusToFahrenheit(double i) {
		double fahrenheit = (9.0 / 5) * i + 32;
		return fahrenheit;
	}

	public static double fahrenheitToCelcius(double j) {
		double celsius = (5.0 / 9) * (j - 32);
		return celsius;
	}
}

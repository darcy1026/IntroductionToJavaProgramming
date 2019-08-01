package chapter02.questions;

import java.util.Scanner;

public class Question01 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Write a Celsius degree and I will convert to the Fahrenheit.");

		Double celcius = input.nextDouble();

		double fahrenheit;

		fahrenheit = (9.0 / 5) * celcius + 32;

		System.out.println(celcius + " Celcius equals " + fahrenheit + " Fahrenheit.");

	}

}

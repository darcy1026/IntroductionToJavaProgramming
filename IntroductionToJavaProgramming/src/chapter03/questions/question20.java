package chapter03.questions;

import java.util.Scanner;

public class question20 {
	public static void main(String[] args) {
		/*
		 * (Science: wind-chill temperature) Programming Exercise 2.17 gives a formula
		 * to compute the wind-chill temperature. The formula is valid for temperatures
		 * in the range between −58ºF and 41ºF and wind speed greater than or equal to
		 * 2. Write a program that prompts the user to enter a temperature and a wind
		 * speed. The program displays the wind-chill temperature if the input is valid;
		 * otherwise, it displays a message indicating whether the temperature and/or
		 * wind speed is invalid.
		 */

		Scanner input = new Scanner(System.in);
		System.out.println("Enter a temperature (-58 F < Temp < 41 F) and wind speed (wind speed >= 2).");

		double temperature = input.nextDouble();
		double windSpeed = input.nextDouble();

		double windChillTemp = 35.74 + 0.6215 * temperature - 35.75 * Math.pow(windSpeed, 0.16)
				+ 0.4275 * temperature * Math.pow(windSpeed, 0.16);

		if ((temperature <= -58 || temperature >= 41) || windSpeed < 2) {
			System.out.println("The temperature or wind speed is invalid");
		} else {
			System.out.println("The wind shill temperature is " + windChillTemp);
		}

	}

}

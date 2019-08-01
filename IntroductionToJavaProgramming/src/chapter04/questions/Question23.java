package chapter04.questions;

import java.util.Scanner;

public class Question23 {

	public static void main(String[] args) {
		/*
		 * (Financial application: payroll) Write a program that reads the following
		 * information and prints a payroll statement: Employee’s name (e.g., Smith)
		 * Number of hours worked in a week (e.g., 10) Hourly pay rate (e.g., 9.75)
		 * Federal tax withholding rate (e.g., 20%) State tax withholding rate (e.g.,
		 * 9%)
		 */
		Scanner input = new Scanner(System.in);

		System.out.println("Enter employee's name: ");
		String name = input.nextLine();

		System.out.println("Enter number of hours worked in a week: ");
		double workHours = input.nextDouble();

		System.out.println("Enter hourly pay rate: ");
		double payRate = input.nextDouble();

		System.out.println("Enter federal tax withholding rate: ");
		double federalTax = input.nextDouble();

		System.out.println("Enter state tax witholding rate: ");
		double stateTax = input.nextDouble();

		// gross pay
		double grossPay = workHours * payRate;

		// deductions
		double federalDeduction = grossPay * federalTax;
		double stateDeduction = grossPay * stateTax;
		double totalDeduction = federalDeduction + stateDeduction;

		// net pay
		double netPay = grossPay - totalDeduction;

		System.out.println("Employee name: " + name);
		System.out.println("Hours worked " + workHours);
		System.out.println("Pay rate: " + payRate);
		System.out.println("Gross pay" + grossPay);
		System.out.println("Deductions: \n\tFederal Withholding (" + (federalTax * 100.0) + "%) :" + federalDeduction);
		System.out.println("\tState Withholding (" + (stateTax * 100.0) + "%) :" + stateDeduction);
		System.out.println("\tTotal Deduction: " + totalDeduction);
		System.out.println("Net Pay: " + netPay);

	}

}

package chapter_09_questions;

public class Account {

	private int id = 0;
	private double balance = 0;
	private double annualInterestRate = 0;
	private Date dateCreated = new Date();
	public double monthlyInteresRate = annualInterestRate / 12;

	Account() {

	}

	public double withdraw() {
		return  ,
	}

	public double getMonthlyInterest() {
		return balance * (annualInterestRate / 12);
	}

	public double getMonthyInteresRate() {
		return annualInterestRate / 12;
	}

	public Date getDateCreated() {
		return dateCreated;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public double getAnnualInterestRate() {
		return annualInterestRate;
	}

	public void setAnnualInterestRate(double annualInterestRate) {
		this.annualInterestRate = annualInterestRate;
	}
}

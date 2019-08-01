package chapter_09_questions;

public class Question_09_02 {

	public static void main(String[] args) {
		
		Stock stock1 = new Stock("ORCL", "Oracle Corporation", 34.5, 34.35);
		
		System.out.println("stock1 symbol is: " + stock1.symbol);
		System.out.println("stock1 name is: " + stock1.name);
		System.out.println("stock1 previous closing price is: " + stock1.previousClosingPrice);
		System.out.println("stock1 current price is: " + stock1.currentPrice);
		System.out.println("stock1 change percent is: " + stock1.getChangePercent());
		
	}

}

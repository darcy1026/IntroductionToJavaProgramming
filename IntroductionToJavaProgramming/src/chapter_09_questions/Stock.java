package chapter_09_questions;

public class Stock {
	
	String symbol = "O";
	String name = "O.C.";
	double previousClosingPrice = 1;
	double currentPrice = 1;
	
	
	Stock(){
		
	}
	
	Stock(String newSymbol, String newName, double newPreClosePrice, double newCurrentPrice ){
		symbol = newSymbol;
		name = newName;
		previousClosingPrice = newPreClosePrice;
		currentPrice = newCurrentPrice;
	}
	
	double getChangePercent(){
		 
		return currentPrice / previousClosingPrice;
	}

}

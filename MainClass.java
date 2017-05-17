

import java.util.Scanner;

public class MainClass {
	
	public static void main(String[] args) {
		
		Scanner scanner_object= new Scanner(System.in);
		
		//code for the first challenge
		System.out.println("Output for challenge 1...");
		
		//This class calculates the max profit from the entered stock
		
		StockCalculator stock_calc = new StockCalculator();
		
		System.out.println("Profit is: "+stock_calc.stockProfitCalculator());
		
		
		//Code for the second challenge
		System.out.println("===================================================================");
		System.out.println("\nOutput for challenge 2...");
		
		int input_from_user; //variable to store the natural number from user
		
		//class calculates the multiplier for 3 & 5
		MultiplesCalculator mul_calc= new  MultiplesCalculator();
		
		System.out.println("Enter the number: ");
		
		input_from_user = scanner_object.nextInt();
		
		//Here we are passing the input_from_user to the calculate() method which returns the sum of multiplier
		
		System.out.println(mul_calc.calculate(input_from_user));
		}

}

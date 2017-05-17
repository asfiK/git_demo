

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

//This class calculates max profit from a stock
public class StockCalculator {
	
	
	public float stockProfitCalculator()
	{
		Scanner scanner_object = new Scanner(System.in);
		int total_number_stocks; //Total number stocks to be entered by the user
		float stock_value; //This temporarily store individual stock value
		float profit=0;  //This will store the final profit
		
		System.out.println("Enter the total number of stocks: ");
		total_number_stocks = scanner_object.nextInt();
		
		System.out.println("Enter the stock price: ");
		//ArrayList is used to store all the stock prices
		
		ArrayList<Float> stockCollection = new ArrayList<Float>(total_number_stocks);
		
		//accepting all the stock prices in arraylist
		for(int i=0;i<total_number_stocks;i++)
			stockCollection.add(scanner_object.nextFloat());
		
		//iterator is used to scan through all the stock object	
		Iterator iterator = stockCollection.iterator();
		
		//scanning all the elements in the arraylist and applying the stock profit logic
		while(iterator.hasNext())
		{
			stock_value = (float) iterator.next();
			if(stock_value>(5.5/22 *14) || stock_value%3==0)
			{
				// applying the profit to the selected stock 
				profit  = stock_value * 5 /3 + 22;  
				//The loop will stop if a particular stock has been selected
				break;
			}
			else
			{
				//If not profit made then the program will return -1
				profit = stockCollection.indexOf(1);
			}
		}
				
		return profit;
	}

}

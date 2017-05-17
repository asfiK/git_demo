

public class MultiplesCalculator{

	

	public int calculate(int number)
	{
		int sum=0; //variable to store the final sum of multipilers
		
		//variable to display the information
		String information = "The multiple of " + number + " is: ";
		
		System.out.println(information);
		
		//Here we are checking if the a given number is divisible by 3 and 5, then it will be added to the sum 
		//else the loop will skip the current number and continue
		for(int i=1;i<number;i++)
		{
			if(i%3==0 || i%5==0) 
			{
				sum=sum+i;
				System.out.println(i);
			}
			
		}
		
		return sum; // we are returning the final sum of the multipliers
	}
}

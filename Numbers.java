
class square
{
	int add = 0,sum = 0,n,sqr,diff;

	void sum()
	{
			//sum of squares of first 10 numbers
		for(int i=1;i<=10;i++)
		{
			 sqr=i*i;
			 add += sqr;
		}
	
			//square of sum of first 10 numbers
		for(int j=1;j<=10;j++)
		{
			sum += j;
			sqr= sum*sum;
		}
		
		//Difference b/w the 2
		diff= sqr - add;
		
		//display
		System.out.println("The sum of square first ten natural numbers is: "+add);
		System.out.println("The square of the sum of first ten natural numbers is: "+sqr);
		System.out.println("The difference b/w the two is: "+diff);	
	}
	
	//for 100 numbers
	void addition()
	{
			//sum of squares of first 10 numbers
		for(int i=1;i<=100;i++)
		{
			 sqr=i*i;
			 add += sqr;
		}
	
			//square of sum of first 10 numbers
		for(int j=1;j<=100;j++)
		{
			sum += j;
			sqr= sum*sum;
		}
		
		//Difference b/w the 2
		diff= sqr - add;
		
		//display
		System.out.println("\nThe sum of square first Hundred natural numbers is: "+add);
		System.out.println("The square of the sum of first Hundred natural numbers is: "+sqr);
		System.out.println("The difference b/w the two is: "+diff);	
	}

}




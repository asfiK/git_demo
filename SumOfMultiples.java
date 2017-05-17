

import java.util.ArrayList;

public class SumOfMultiples 
{
	public static void main(String args[])
	{
		//Till Which Number You want Multiples
		int n=1000,ans=0;
		ArrayList multiples=new ArrayList();
		for(int i=2;i<n;i++)
		{
			//You Want Multiples of 3 and 5
			if(i%3==0 || i%5==0)
			{
				//sum the multiples
				ans+=i;
				//add each element to arrayist
				multiples.add(i);
			}
		}
		//Display the multiples of 3 and 5 below n
		System.out.println("The Multiples are:"+multiples.toString());
		System.out.println("The Sum Of the multiples is:"+ans);
	}
}

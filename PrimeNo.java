import java.util.Scanner;

public class PrimeNo {
	// class primeNo to find the nth prime number the user wants
	
/* In this method two for loops are used to find the nth prime number with the complexity of o(n^2)*/	
	public int PrimeMover1(int n)  //method to return the nth prime number wanted by the user
	{
		int flag=0,ctr=0,i,j;
		for(i=2;i<1000;i++)
		{
			for(j=1;j<=i;j++)   //for loop to check whether the particular number is prime or not
			{
				if(i%j==0)
				{
					 flag++;
				}
			}
			if(flag==2)
			{
				ctr++;
			}
			flag=0;
			if(ctr==n)     // comparing the nth element of user with the continuous element of loop
			{
				break;
			}	
		}
		return i;     // returns the prime number to the main method
	}

/* This approach to find the nth Prime number is more efficient as a different method is used to check 
	  the prime number within the while block with  regards to the object orientation concept*/
	
	public int check(int n) // method to check whether the particular number is prime or not
	{
		int i=1,flag=0;
		while(i<=n)
		{
			if(n%i==0)
				flag++;
			i++;
		}
		if(flag==2)
			return 1;
		else
			return 0;
	}
	public int PrimeMover2(int n) //method to return the nth prime number wanted by the user
	{
		int ctr=0,i=1;
		while(i<1000) 
		{
			i++;
			ctr+=check(i);
			if(ctr==n)     // comparing the nth element of user with the continuous element of loop
			{
				break;
			}	
		}
		return i;    // returns the prime number to the main method
	}
	public static void main(String[] args) {   // main method
		PrimeNo p=new PrimeNo();
		int n;
		System.out.println("Enter the nth element ");
		Scanner sc=new Scanner(System.in);    // use of Scanner class to take the input of nth prime number
		n=sc.nextInt();      // taking the nth prime element from the user
		sc.close();
		System.out.println("( Method-1 ) The prime number is : "+p.PrimeMover1(n));//calling the method to get the nth prime number using two for loop
		System.out.println("( Method-2 ) The prime number is : "+p.PrimeMover2(n));//calling the method to get the nth prime number using while loop
		 
	}

}

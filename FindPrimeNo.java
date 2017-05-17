import java.io.*;

public class FindPrimeNo
{	
		static public int findPrime(int in)
		{

			int value,count;
			for(value=2,count=0; count<in;value++)
			{
				if(CheckPrime(value))
				{
					++count;
				}
			}
			return value-1;
			
		}
		static boolean CheckPrime(int n)
		{
			for(int i=2;i<n;++i)
			{
				if(n%i==0)
				{
					return false;
				}
			}
			return true;
		}
			public static void main(String args[])
		{	
			
			try
			{
				int input,r;
				//input: to take the input
				//r: to store the result
				BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
				System.out.println("Which Nth prime you want: ");
				input=Integer.parseInt(br.readLine());
			
				r=findPrime(input);
				System.out.println("The prime no. on position "+input+" is "+r);
			}
			catch(IOException ex)
			{
				ex.printStackTrace();
			}
		}
}
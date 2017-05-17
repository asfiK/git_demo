
import java.util.Scanner;

public class CustomPower {
	public static void main(String args[])
	{
		int base,exponenet,ans;
		//To take the base from user
		System.out.println("Enter The base");
		Scanner sc=new Scanner(System.in);
		base=sc.nextInt();
		//To take the exponent from the user
		System.out.println("Enter The exponent");
        exponenet=sc.nextInt();
        System.out.println("The Answer of the method is"+findPower(base,exponenet));
       // System.out.println("True Answer is:"+Math.pow(base,exponenet));
        
	}

	private static int findPower(int base,int exponenet) {
	   int ans=base;
		for(int i=1;i<exponenet;i++)
	   {
			//As we are not supposed to use multiply a method which does the same work has been called
			ans=multiplication(ans,base);
	   }
		return ans;
	}
	//Multiplication method
	private static int multiplication(int a,int b) {
		   int ans=0;
			for(int i=0;i<b;i++)
		   {
				ans+=a;
		   }
			return ans;
		}
}


import java.util.Scanner;

public class String_Challenge {

	@SuppressWarnings("resource")
	public static void main(String[] args) 
	{
		String actualString;
		String jumbledString;
		Scanner sc=new Scanner(System.in);
		
		System.out.print("Enter Actual String: ");
		actualString=sc.next();
		
		System.out.print("Enter the Jumbled String: ");
		jumbledString=sc.next();
		
		char[] charSeq1=new char[actualString.length()];
		char[] charSeq2=new char[jumbledString.length()];
		char[] result=new char[jumbledString.length()];
		
		
		if(actualString.length()!=jumbledString.length())
		{
			System.out.println("Strings Cannot be matched");
		}
		else
		{
			for(int i=0;i<actualString.length();i++)
			{
				charSeq1[i]=actualString.charAt(i);	
				charSeq2[i]=jumbledString.charAt(i);
				
			}
			
			for(int i=0;i<jumbledString.length();i++)
			{
				for(int j=0;j<jumbledString.length();j++)
				{
					if(charSeq1[i]==charSeq2[j])
					{
						result[i]=charSeq2[j];
					}
					
				}
			}
			
			for(int j=0;j<actualString.length();j++)
			{
				System.out.print(result[j]);
			}
		}
	}

}

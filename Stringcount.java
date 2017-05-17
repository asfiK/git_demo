
import java.util.Scanner;

public class Stringcount 
{
	public static void main(String[] args) 
	{
		int upp=0,lower=0,space=0,special=0,digit=0;
		System.out.println("enter a string");
		Scanner line= new Scanner(System.in);
		String str=line.nextLine();
		System.out.println("String entered is : "+str);
		for(char c:str.toCharArray())
		{
			if(c==' ')
				space++;
			else if(c>=65 && c<90)
				upp++;
			else if(c>=97 && c<122)
				lower++;
			else if(c=='0' || c=='1' || c=='2' || c=='3' || c=='4' || c=='5' || c=='6' || c=='7' || c=='8' || c=='9' )
				digit++;
			else 
			special++;
		}
		line.close();
		System.out.println("Number of Digits : "+digit+"\nNumber of spaces is : "+space+ "\nNumber of UpperCase : "+upp+"\nNumber of Lowercase : "+lower+"\nNumber of special characters : "+special);
	}

}

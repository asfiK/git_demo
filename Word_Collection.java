

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Scanner;

class Words {
	
	public void display() throws IOException {
		// TODO Auto-generated constructor stub
		
		//programme that return word which has highest no of repeated characters
	int count=1,fix=0;
	String str1=null;
	BufferedReader br=new BufferedReader(new FileReader("src\\c.txt"));
	String str;
	while((str=br.readLine())!=null)
	{
		String words[]=str.split(" ");
		for(int i=0;i<words.length;i++)
		{
			for(int j=0;j<words[i].length();j++)
			{
				for(int k=j+1;k<words[i].length();k++)
				{
				if((words[i].charAt(j))==(words[i].charAt(k)))
						{
					
					count++;
					//System.out.println(count);
					if(fix>=count)
					{
						fix=count;
					}
					else
					{
						str1=words[i];
					fix=count;
					}
					
					//fix=count;
					
						}
				}
				count=1;
				}
	}
		}
	if(fix==0)
	System.out.println(-1);
	
	else
	System.out.println(str1);
	}
}







//programme that print the sum of prime numbers below the given no
//Takes time to give output for greater number
class Prime
{ 
	Double sum=(double) 2;
	int count=0;
	void sum_prime()
	{
		
System.out.println("enter number");
Scanner sc=new Scanner(System.in);
		Double no=Double.parseDouble(sc.next());
		for(Double i=(double) 3;i<no;i++)
		{
			for(Double j=(double) 2;j<i;j++)
			{
				if(i%j==0)
				{
					count++;
					break;
				}
				else
				{
					
					
				}
			}
			if(count==0)
			{
				sum=sum+i;
				
			}
			count=0;
		}
		System.out.println(sum);
	}

}


public class Word_Collection
{
	public static void main(String[] args) throws IOException {
		Words w=new Words();
		w.display();
		Prime p=new Prime();
		p.sum_prime();
	}
}
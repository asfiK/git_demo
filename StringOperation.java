import java.util.Scanner;

public class StringOperation {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter string");
		char[] test=sc.next().toCharArray();
		find_perc(test);
		
	}
	public static void find_perc(char [] test)
	{
		double upper_case=0;
		double lower_case=0;
		double digits=0;
		double special_char=0;
		
		for(int i=0;i<test.length;i++)
		{
			if(Character.isUpperCase(test[i]))
			{
				upper_case++;
			}
			else if(Character.isLowerCase(test[i]))
			{
				lower_case++;
			}
			else if(Character.isDigit(test[i]))
			{
				digits++;
			}
			else
			{
				special_char++;
			}
		}
		System.out.println("Uppercase Percentage:"+((upper_case/test.length)*100));
		System.out.println("lowercase Percentage:"+((lower_case/test.length)*100));
		System.out.println("digits Percentage:"+((digits/test.length)*100));
		System.out.println("special character Percentage:"+((special_char/test.length)*100));
	}

}


class Division {
	public void div(float x,float y)
	{	
		float z=0.0f; int i=0; char ch=' ';
		z= x/y;
		String s=String.valueOf(z);
		System.out.println(s);
		while(i<s.length())
		{
			ch=s.charAt(i);
			if(ch=='.')
			{
				if(s.substring(i+1,i+5)=="0000")
					System.out.printf("%.8f",z);
				else if(s.substring(i+1,i+4)=="000")
					System.out.printf("%.7f",z);
				else if(s.substring(i+1,i+3)=="00")
					System.out.printf("%.6f",z);
				else if(s.substring(i+1,i+2)=="0")
					System.out.printf("%.5f",z);
				break;
			}
			i++;
		}
	}
}

class Divide
{
	public static void main(String ar[])
	{
		new Division().div(4.0f,5.0f);
	}
}
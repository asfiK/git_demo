
class PreserveSpace
{
	public String reverse(String s)
	{	int j=s.length()-1;char ch=' '; char ch1=' ';String rev=" ";
		for(int i=0;i<s.length();i++)
		{	ch=s.charAt(i); ch1=s.charAt(j);
			if(ch!=' ' && j>=0)
			{
				rev=rev+ch1;
				j--;
				if(j>=1)
				{
					ch1=s.charAt(j);
					if(ch1==' ')
					j--;
				}	
			}
			else
			{
				rev+=" ";
			}
			
		}
		return rev;
	}
}
public class ReverseMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(new PreserveSpace().reverse("I Am Not String"));
	}

}

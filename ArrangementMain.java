
import java.util.Arrays;

class Arrange
{
	public boolean check(String s1,String s2)
	{
		if(s1.length()!=s2.length())
			return false;

		char ch1[]=s1.toCharArray();
		char ch2[]=s2.toCharArray();
		Arrays.sort(ch1);
		Arrays.sort(ch2);
		s1=new String(ch1);
		s2=new String(ch2);
		if(s1.equals(s2))
		return true;
		else
		return false;
	}
}
public class ArrangementMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(new Arrange().check("rab", "bar"));
	}

}


import java.util.ArrayList;

public class SumOfArrays {
	static int sum = 0;
	public static int a1[] = { 3, 2 };
	public static int a2[] = { 1 };
	public static int a3[] = { 4, 12 };

	public int sumofelements(ArrayList<int[]>al)
	{
		for (int[] i : al) {
			for (int j : i) {
				sum = sum + j;
			}
		}

		return sum;
	}

	public static void main(String[] args) {
		int total;
		SumOfArrays s=new SumOfArrays();
		ArrayList<int[]> al = new ArrayList<int[]>();
		al.add(a1);
		al.add(a2);
		al.add(a3);

		total=s.sumofelements(al);
		System.out.println("Sum of All elements in Arraylist is: "+total);
	}
}

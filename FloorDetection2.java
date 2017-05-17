import java.io.*;


public class FloorDetection2 
{
	public int floor(int a[],int val)
	{
		int floor=0;
		for(int i=0;i<a.length;i++)
			if(a[i]<val)
				floor=a[i];
		return floor;
	}
	
 public static void main(String[] args) throws IOException 
 {
	 FloorDetection2 ob= new FloorDetection2();
	//array and values can be taken from user.
 	int arr[]= new int[]{1,1,2,3,3,5,8,10,10,12,19};
 	int val=10;
 	int floor= ob.floor(arr,val);
 	System.out.println("value was : "+val +"\n floor is : "+floor);
 }
}

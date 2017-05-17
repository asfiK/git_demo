
public class FloorDetection 
{
 
	public int size(int b[],int val)
	{
		int count=0;
		for(int i=0;i<b.length;i++)
			if(b[i]<=val)
				count++;
		return count;
	}
	
	public int floor(int b[],int val, int c)
	
	{
		int temp[]=new int[c];
		for(int i=0,j=0;i<b.length;i++,j++)
		{
			if(b[i]<=val)
			{
				temp[j]=b[i];
				}
			}
		for(int i=0;i<temp.length;i++)
			System.out.println(temp[i]);
		   
		return temp[temp.length-1];
	}
		
	
    public static void main(String[] args) throws Exception
    {
    	FloorDetection ob= new FloorDetection();
    	//array and values can be taken from user.
    	int arr[]= new int[]{1,2,3,4,8,10,10,12,19};
    	int val=5;
    	int size=ob.size(arr, val);
    	int floor= ob.floor(arr,val, size);
    	System.out.println("value was : "+val+"\n floor is : "+floor);
    	
	}
}

import java.util.ArrayList;
import java.util.Scanner;

public class FloorDemo {
	public static void main(String[] args) {
		 
		ArrayList<Integer> al=new ArrayList<>();
		System.out.println("enter no of elements");
		Scanner sc=new Scanner(System.in);
		int size=sc.nextInt();
		System.out.println("enter nos");
		for(int i=0;i<size;i++)
		{
			al.add(sc.nextInt());
		}
		System.out.println("enter no to find it's floor");
		int no=sc.nextInt();
		int floor1=find_floor1(al,no);
		System.out.println("floor of no with first implementation:");
		System.out.println(floor1);
		int floor2=find_floor2(al,no,0,al.size());
		System.out.println("floor of no with second implementation:");
		System.out.println(floor2);
	}
		
		
		
		//way-1
		
		public static int find_floor1(ArrayList<Integer>al,int no)
		{
			int i=0;
		
		for(i=0;i<al.size();i++)
		{
			if(al.get(i)>no)
			{
				break;
			}
		}
	
		return al.get(i-1);
	}
		
		//way-2 is better as it requires less no of iteration compare to way-1. so it is efficient approach.here list is being devided and searching is performed on that shorter list.
		public static int find_floor2(ArrayList<Integer>al,int no,int start,int end)
		{
			/*int i=0;
			int mid=0;
			int index=0;
			int no_of_iteration=0;
			int size=al.size();
			if(size%2==0)
			{
			   mid=size/2;
			}
			else
			{
				mid=(size/2)+1;
			}
			
			if(al.get(mid)>=no)
			{ 
				for(i=mid;i>=0;i--)
				{
					no_of_iteration++;
					if(al.get(i)<=no)
					{
						index=i;
						break;
					}
				}
				
			}
			else
			{ 
				for(i=mid+1;i<size;i++)
				{   
					no_of_iteration++;
					if(al.get(i)>no)
					{
						index=i-1;
						break;
					}
				}
				
			}
			System.out.println("no of iteration with second implementation");
			System.out.println(no_of_iteration);
			return (al.get(index));*/
			int mid=(start+end)/2;
			if(start==end-1)
			{
				if(al.get(end)>no)
				{
					return al.get(start);
				}
				return al.get(end);
			}
			if(al.get(mid)>no)
			{
				end=mid-1;
			}
			else if(al.get(mid)<no)
			{
				start=mid+1;
			}
			else
			{
				return al.get(mid);
			}
			return find_floor2(al,no,start,end);
		}

}

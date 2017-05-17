import java.io.*;
/**
This approach doesn't use any library
*/
public class CircularPrime1{
	static int sieve[]=new int[100000001]; 
	static int prime[]=new int[100000001];
	static{
		sieve[0]=1;
		sieve[1]=1;
		int k=0;
		for(int i=2;i<100000001;i++)
		{
			if(sieve[i]==0){
				prime[k++]=i;
				for(int j=2;(i*j)<100000001;j++){
					sieve[j*i]=1;
				}
			}
		}
	}
	static void insert(int a[],int val,int pos){
		int curr_index=pos-1;
		while(curr_index>=0 && a[curr_index]>val)
		{
			a[curr_index+1]=a[curr_index];
			curr_index--;
		}
			a[curr_index+1]=val;
	}
	static boolean binary_search(int a[],int val){
		int l=0,h=a.length-1;
		while(l<=h)
		{
			int mid=(l+h)/2;
			if(a[mid]==val)return true;
			else if(a[mid]<val)l=mid+1;
			else h=mid-1;
		}
		return false;
	}
	public static int countCircularPrimeTill(int n){
		int count=0;
		for(int i=0;prime[i]<=n;i++){
			if(prime[i]!=0 && sieve[prime[i]]!=1)
			{
				int[] array=getAllCircular(prime[i]);
				int counter=0,localcount=0;
				for(;counter<array.length;counter++){
					if(sieve[array[counter]]==1 && array[counter]!=0)break;
					else{
						if(array[counter]!=0)localcount++;
						sieve[array[counter]]=1;
					}
				}
				if(counter==array.length){
					count+=localcount;
				}
			}
		}
		return count;
	}
	public static int[] getAllCircular(int num){
		int n=num,digits=0;
		while(n>0){
			n/=10;
			digits++;
		}
		int k=1;
		n=num;
		int array[]=new int[digits];
		insert(array,num,0);
		n=((n%10)*(int)Math.pow(10,digits-1))+(n/10);
		while(n!=num){
			if(!binary_search(array,n))
				insert(array,n,k++);
			n=((n%10)*(int)Math.pow(10,digits-1))+(n/10);
		}
		return array;
	}
	public static void main(String args[])throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int n=Integer.parseInt(br.readLine());
		System.out.println(countCircularPrimeTill(n));
		
	}
}
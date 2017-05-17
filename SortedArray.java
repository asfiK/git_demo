
public class SortedArray {
	//Efficient
	static void method1(int arr[]){
		int lower=0;
		int upper =arr.length-1;
		int m=(lower+upper)/2;
		int x=5;
		while(arr[m]!=x){
			if(arr[m]>x){
				upper=m;
				m=(lower+upper)/2;
			}else{
				lower=m;
				m=(lower+upper)/2;
			}
			if(arr[m]==arr[lower] && lower+1==upper){
				break;
			}
		}
		System.out.println(arr[m]);
	}
	
	
	static void method2(int arr[]){
		int search=0;
		int x=5;
		while(true){
			if(arr[search]>x){
				break;
			}
			search++;
		}
		System.out.println(arr[search-1]);
	}
	
	public static void main(String[] args) {
		
		int arr[]={1,3,8,10,10,12,19};
		method1(arr);
		method2(arr);
	}
}

class Sequence{
	
	public int  whichSeq(int array[]){
		int difference = array[1] - array[0], arithmetic = 1;
		int ratio = array[1] / array[0], geometric = 1;
		
		for (int i = 2; i < array.length; i++) {
//System.out.println("hi");
			if( difference != (array[i]-array[i-1]) ){
				arithmetic = 0;
			}
			if( ratio != (array[i]/array[i-1]) ){
				geometric = 0;
			}
			if(arithmetic==0 && geometric==0){	//this if() statement is to minimize the no of loops.
				break;
			}
		}
		
		if(arithmetic == 1){
			return 1;
		}else if (geometric == 1) {
			return 0;
		}else{
			return -1;
		}
	}
	
	public int findNumber(){
		int num = 20, i = 2;	//Started from num=20 because it is clear that numbers <20 can not be divided by 20.
		
		while(true) {			// i<11; For smallest no. divisible by each no. from 1 to 10.
			while(i < 21){		// i<21; For smallest no. divisible by each no. from 1 to 20.
								
				if( (num % i) != 0){
					num++;
					i=2;
				}else{
					i++;	
				}
			}
			return num;
		}
	}
	
	
//			DON'T USE RECURSIVE FUNCTION, IT GIVES "STACK OVERFLOW EXCEPTION".....
//	
//	public int findNumber(int num){
//		int j = 2;
//					
//			while(j < 21){								
//				if( (num%j) != 0){
//					return findNumber(num++);
//				}else{
//					j++;
//				}
//			}
//			return num;
//	}
	
}




public class Test {

	public static void main(String[] args) {
		Sequence s = new Sequence();
		//		int[] array = {5,10,15,20,25,30,35,40};
		int[] array = {5,10,20,40,80,160,320};
	//	int[] array = {5,10,20,25,80,160,320};
		int seq = s.whichSeq(array);
		
		if(seq == 1){
			System.out.println("Given sequence is Arithmatic Sequence.");
		}else if (seq == 0) {
			System.out.println("Given sequence is Geometric Sequence.");
		}else{
			System.out.println("Given sequence is neither Arithmatic Sequence nor Geometric Sequence.");
		}
		
		System.out.println("Smallest number divisible by each numbers from 1 to 20:\n"+s.findNumber());
	}
}

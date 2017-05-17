//store the elements in two different array list and add all in order to get the union of lists so that no elements are repeated

import java.util.ArrayList;
import java.util.Iterator;
import java.util.*;
public class PowerSetch {
	public static void main(String[] args) {
		ArrayList<Integer> list1 =new ArrayList<Integer>();			//taking arraylist
		ArrayList<Integer> list2 =new ArrayList<Integer>();
		ArrayList<Integer> list3 =new ArrayList<Integer>();
		list1.add(1);																		//adding elements in two different arraylist 
		list1.add(2);
		list1.add(3);
		list2.add(2);
		list3.addAll(list1);														//taking union of list to remove the repeated elements
		Iterator<Integer> i=list2.iterator();
		//Union
		while(i.hasNext()){																			
			Integer elem = i.next();
			if(!list3.contains(elem))
				list3.add(elem);
		}
		System.out.println("InputSet"+list3);				//printing the list
	}
}

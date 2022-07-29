package CollectionFramework;

import java.util.ArrayList;
import java.util.Iterator;

public class List_ArrayList_4_Generic {
	
	//Generic is the idea to make the arrayList to allow same type data

	public static void main(String[] args) {
		ArrayList<Integer>  arrayList1=new ArrayList<Integer>();
		//arrayList1.add("Sohag");
		//arrayList1.add('M');
		//arrayList1.add(42.5);
		arrayList1.add(5);
		arrayList1.add(15);
		arrayList1.add(25);
		arrayList1.add(35);
		
		
		//for each
		for(int oneItem:arrayList1) {
			System.out.println(oneItem);
		}
		
		
		
		//iterator available in collection
		Iterator<Integer> it=arrayList1.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		
		
		

	}

}

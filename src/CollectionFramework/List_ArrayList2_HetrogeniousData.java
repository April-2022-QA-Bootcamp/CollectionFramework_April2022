package CollectionFramework;

import java.util.ArrayList;
import java.util.Iterator;

public class List_ArrayList2_HetrogeniousData {

	public static void main(String[] args) {
		ArrayList arrayList1=new ArrayList();
		arrayList1.add("Sohag");
		arrayList1.add(42);
		arrayList1.add(42.5);
		arrayList1.add('M');
		
		//printing approach
		
		//printing the obj
		
		System.out.println(arrayList1);
		
		//by passing index number in get()
		System.out.println(arrayList1.get(1));
		
		//looping--for each 
		for(int i=0;i<arrayList1.size();i++) {
			System.out.println(arrayList1.get(i));
		}
		System.out.println("using iterator----------");
		//iterator available in collection
				Iterator it=arrayList1.iterator();
				while(it.hasNext()) {
					System.out.println(it.next());
				}
		
		

	}

}

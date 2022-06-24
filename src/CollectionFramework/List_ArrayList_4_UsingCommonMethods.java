package CollectionFramework;

import java.util.ArrayList;

public class List_ArrayList_4_UsingCommonMethods {

	public static void main(String[] args) {
		ArrayList<Integer>  arrayList1=new ArrayList<Integer>();
		arrayList1.add(5);
		arrayList1.add(25);
		arrayList1.add(1,15);
		arrayList1.set(0, 55);//replacing specific index value
		arrayList1.add(35);
		
	
		//for each
				for(int oneItem:arrayList1) {
					System.out.println(oneItem);
				}
				
				
		arrayList1.remove(0);
		System.out.println("after removing 0 index value--no more 55");
		//for each
		for(int oneItem:arrayList1) {
			System.out.println(oneItem);
		}
		
		System.out.println("2nd array list----");
		ArrayList<Integer>  arrayList2=new ArrayList<Integer>();
		arrayList2.add(66);
		arrayList2.add(76);
		
		for(int oneItem2:arrayList2) {
			System.out.println(oneItem2);
		}
		arrayList2.addAll(arrayList1);//start adding in next availaable index
		arrayList2.addAll(0,arrayList1);//start from 0 index
		System.out.println();
		for(int oneItem2:arrayList2) {
			System.out.println(oneItem2);
		}
		
		System.out.println("Removing all --arraylist1 item");
		arrayList2.removeAll(arrayList1);
		for(int oneItem2:arrayList2) {
			System.out.println(oneItem2);
		}
		
		//arrayList2.clear();
		System.out.println("AFter clear");
		for(int oneItem2:arrayList2) {
			System.out.println(oneItem2);
		}
		
		System.out.println("Using isEmpty()");
		//is empty
		if(arrayList2.isEmpty()) {
			System.out.println("No element");
		}else {
			for(int oneItem2:arrayList2) {
				System.out.println(oneItem2);
			}
		}
		
		
		
		
	
		
		
		
		
		
	}

}

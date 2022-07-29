package CollectionFramework;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class List_LinkedList_02_Basic {

	public static void main(String[] args) {
		List<Integer> llist=new LinkedList<>();
		llist.add(65);
		llist.add(5);
		llist.add(5);//duplicate
		llist.add(15);
		llist.add(25);
		llist.add(35);
		llist.add(45);
		llist.add(55);
		//approached of element to get conrol
		for(int singlelist:llist) {
			System.out.println(singlelist);
		}
		
		Iterator it =llist.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		for(int i=0;i<llist.size();i++) {
			System.out.println(llist.get(i));
		}
		

	}

}

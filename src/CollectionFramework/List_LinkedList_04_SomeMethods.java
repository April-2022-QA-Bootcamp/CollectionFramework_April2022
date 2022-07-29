package CollectionFramework;

import java.util.LinkedList;

public class List_LinkedList_04_SomeMethods {

	public static void main(String[] args) {
		LinkedList<Integer> list=new LinkedList<>();
		
		list.add(5);
		list.add(15);
		list.add(25);
		list.addFirst(35);
		list.addLast(45);
		for(int singleItem:list) {
			System.out.println(singleItem);
		}
		
		
		System.out.println(list.getFirst());
		System.out.println(list.getLast());
		
	}

}

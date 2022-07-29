package CollectionFramework;

import java.util.ArrayDeque;
import java.util.Deque;

public class Queue_Dqueue_02_ImpByArrayDque {

	public static void main(String[] args) {
		Deque<Integer> q=new ArrayDeque<>();
		//FIFO
		q.add(5);
		q.add(50);
		q.addFirst(100);//first
		q.add(55);
		q.add(1055);
		q.addLast(111);//Last
		
		System.out.println(q.peek());
		
	}
	


}

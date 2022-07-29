package CollectionFramework;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class Queue_02_ImpByLinkedList {

	public static void main(String[] args) {
		Queue<Integer> q=new LinkedList<>();
		//FIFO
		q.add(5);//first
		q.add(50);
		q.add(55);
		q.add(1055);//Last
		
		
		System.out.println(q.peek());
		q.poll();//get peek item and removes
		System.out.println(q.peek());
		
	}
	


}

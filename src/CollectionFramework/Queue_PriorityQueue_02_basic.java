package CollectionFramework;

import java.util.PriorityQueue;
import java.util.Queue;

public class Queue_PriorityQueue_02_basic {

	public static void main(String[] args) {
		Queue<Integer> q=new PriorityQueue<>();
		
		//lower to higher
		q.add(5);
		q.add(50);
		q.add(1);//top
		q.add(1055);
		
		System.out.println(q.peek());
		
		Queue<String> q1=new PriorityQueue<>();
		q1.add("Kabir");
		q1.add("Akber");
		q1.add("Abbas");
		q1.add("Sohag");
		System.out.println(q1.peek());
		
		
		
	}
	
	

}

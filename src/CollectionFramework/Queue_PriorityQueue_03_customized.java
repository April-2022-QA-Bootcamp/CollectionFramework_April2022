package CollectionFramework;

import java.util.Comparator;
import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Queue;

public class Queue_PriorityQueue_03_customized {

	public static void main(String[] args) {
		EnthrallApr22 st1=new EnthrallApr22("Ryhan",70);
		EnthrallApr22 st2=new EnthrallApr22("Kabir",90);
		EnthrallApr22 st3=new EnthrallApr22("Nahida",99);
		EnthrallApr22 st4=new EnthrallApr22("Imran",100);
		
		
		
	Queue<EnthrallApr22> q =new PriorityQueue<>(new CompareSt());
	q.add(st1);
	q.add(st2);
	q.add(st3);
	q.add(st4);
	
	
	while(!q.isEmpty()) {
		System.out.println("Name:"+q.peek().name+" Result:"+q.peek().result);
		q.poll();
	}

		}

	

	}



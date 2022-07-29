package CollectionFramework;

import java.security.PublicKey;
import java.util.LinkedList;
import java.util.Random;

/*
 Objectives: to see elements are adding correctly or notn as we know linkedList is not Sycronized
 How we do our code:
 we will create a method wheich method will add 1 element for one call
 We will have multiple Threads will call the method-so that elements get added*/

public class List_LinkedList_03_CheckingNonSyncronized {
	static LinkedList<Integer> list = new LinkedList<>();

	public static void addingElement() {
		Random random = new Random(100);
		list.add(random.nextInt());

	}

	public static void main(String[] args) {

		// creating Threads:
		Thread t1 = new Thread(new Runnable() {

			@Override
			public void run() {
				for (int i = 0; i < 1000; i++) {
					addingElement();
					
				}

			}
		});

		Thread t2 = new Thread(new Runnable() {

			@Override
			public void run() {
				for (int i = 0; i < 1000; i++) {
					addingElement();
					
				}

			}
		});
		
		Thread t3 = new Thread(new Runnable() {

			@Override
			public void run() {
				for (int i = 0; i < 1000; i++) {
					addingElement();
					
				}

			}
		});
		
		
		//Start Threads
		t1.start();
		t2.start();
		t3.start();
		
		//to stop letting threads to join
		try {
			t1.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			t2.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		try {
			t3.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(list.size()); //3000
		System.out.println("Thread: "+ Thread.currentThread().getName());


	}

}

package CollectionFramework;

import java.util.Vector;

public class List_Vector_02_Basic {

	public static void main(String[] args) {
		Vector<Integer> vector=new Vector<>();
		vector.add(5);
		vector.add(15);
		vector.add(25);
		vector.add(35);
		
		
		Vector<Integer> vector1=new Vector<>();
		vector1.add(50);
		vector1.add(150);
		vector1.addAll(vector);
		
		
		for(int singleItem:vector1) {
			System.out.println(singleItem);
		}

	}

}

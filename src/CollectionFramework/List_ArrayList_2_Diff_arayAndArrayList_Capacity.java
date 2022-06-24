package CollectionFramework;

import java.util.ArrayList;
import java.util.List;

public class List_ArrayList_2_Diff_arayAndArrayList_Capacity {

	public static void main(String[] args) {
		
		//how we declare array
		int[] array=new int[5];  //size is 5
		array[0]=5;
		array[1]=15;
		array[2]=52;
		array[3]=55;
		array[4]=15;
		int[] array2={5,8,9};//size is 3--literal presentation
		//array2[]
		System.out.println(array.length);
		//how we create arrayL.ist
		List list=new ArrayList(); //as we are using default const----capacity will be 10
		list.add(5);
		list.add(0,15);
		list.add(5);
		list.add(5);
		list.add(5);
		list.add(5);
		list.add(5);
		list.add(5);
		list.add(5);
		list.add(5);
		list.add(5);//10th index
		list.add(5);//will give new capacity
		list.add(5);
		list.add(5);
		list.add(5);
		list.add(5);
		list.add(5);
		list.add(5);
		
		System.out.println(list.get(0));
		
		//size
		System.out.println(list.size());
		
		
		//assume that initial capacity is 10----> 10+5=15----> 10+(10>>1)
		System.out.println(10+(10>>1));//15
		
		//geting diff initial capacity
		List list1=new ArrayList(12);
		
		List list2=new ArrayList(list.size());
		
		
		
		
		
		
		

		
		
	}

}

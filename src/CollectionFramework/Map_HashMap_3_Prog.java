package CollectionFramework;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Map_HashMap_3_Prog {

	public static void main(String[] args) {
		Map<Integer,Double> result=new HashMap<>();
		result.put(101, 2.0);
		result.put(102, 4.0);
		result.put(103, 3.0);
		result.put(104, 3.5);
		result.put(105, 4.2);
		
		System.out.println("Please put your roll number");
		Scanner scanner=new Scanner(System.in);
		int roll=scanner.nextInt();
		
		System.out.println(result.get(roll));
		
	
		

	}

}

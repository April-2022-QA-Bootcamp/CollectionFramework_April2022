package CollectionFramework;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Map_HashMap_01 {
	public static void main(String[]args) {
	
	Map<Integer,String> map=new HashMap<Integer,String>();
	map.put(101, "Ryhan");
	map.put(102, "Sohag");
	map.put(103, "Sahana");
	map.put(104, "Murad");
	
	
	System.out.println(map.get(102));//sohag
	
	Set<Integer> keys=map.keySet();
	
	for(int key:keys) {
		System.out.println("Key:"+key+" Value:"+map.get(key));
	}
	

	
	}
	
	

}

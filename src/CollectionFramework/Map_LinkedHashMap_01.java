package CollectionFramework;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class Map_LinkedHashMap_01 {
	public static void main(String[] args) {
		Map<Integer,String> linkedHmap=new LinkedHashMap<>();
		
		linkedHmap.put(101, "Sohag");
		linkedHmap.put(1011, "Sahana");
		linkedHmap.put(1000, "Ryhan");
		linkedHmap.put(1051, "Murad");
		
		Set<Integer> keys=linkedHmap.keySet();
		Iterator<Integer> itr=keys.iterator();
		while(itr.hasNext()) {
			System.out.println(linkedHmap.get(itr.next()));
		}
	}

}

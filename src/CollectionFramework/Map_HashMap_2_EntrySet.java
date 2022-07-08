package CollectionFramework;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Map_HashMap_2_EntrySet {

	public static void main(String[] args) {
		HashMap<String, String> capital=new HashMap<>();
		capital.put("BD", "Dhk");
		capital.put("USA", "DC");
		capital.put("IND", "Delhi");
		
		Set<Map.Entry<String, String>> eset=capital.entrySet();
		System.out.println(eset);
		
		Iterator<Map.Entry<String, String>> itr=capital.entrySet().iterator();
		
		while(itr.hasNext()){
			System.out.println(itr.next());
		}
		

	}

}

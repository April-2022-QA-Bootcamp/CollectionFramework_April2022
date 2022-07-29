package CollectionFramework;

import java.util.Set;
import java.util.TreeMap;

public class Map_TreeMap_01 {

	public static void main(String[] args) {
		TreeMap<Integer, EnthrallApr22> tree=new TreeMap<>();
		
		EnthrallApr22 st1=new EnthrallApr22("Ryhan",90);
		EnthrallApr22 st2=new EnthrallApr22("Murad",80);
		EnthrallApr22 st3=new EnthrallApr22("Sahana",50);
		
		
		
		tree.put(101, st1);
		tree.put(102, st2);
		tree.put(108, st3);
		
		
		Set<Integer> keys=tree.keySet();
		for(int key:keys) {
			System.out.println(tree.get(key).name);
			
		}
		
		

	}

}

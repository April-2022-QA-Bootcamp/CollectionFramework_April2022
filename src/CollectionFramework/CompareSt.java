package CollectionFramework;

import java.util.Comparator;

public class CompareSt implements Comparator<EnthrallApr22> {

	@Override
	public int compare(EnthrallApr22 st1, EnthrallApr22 st2) {
		if(st1.result>st2.result) {
			return -1;
		}
		return 1;
		
	}

}

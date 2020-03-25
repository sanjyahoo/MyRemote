package arraylistconcept;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Test1 {

	public static void main(String[] args) {
		
	Integer array[] = new Integer[] {1,66,7,43,21,34,56};
	List<Integer> ar = Arrays.asList(array);
	
	ArrayList<Integer> list = new ArrayList<Integer>(Arrays.asList(1,2,3,4,3,2,1));
	System.out.println(list);
	
	Collections.sort(list);
	System.out.println(list);
	
	Collections.sort(list,Collections.reverseOrder());
	System.out.println(list);
	}
	
}

package arraylistconcept;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Test {

	public static void main(String[] args) {
		
		ArrayList<Integer> ar = new ArrayList<>(Arrays.asList(1,1,1,1,1,2,3,3,4,5,6,6,6,6,7,7,8,8,9));
		System.out.println(ar);
		for(int i=0;i<ar.size();i++)
		{
			for(int j=i+1;j<ar.size();j++)
			{
				if(ar.get(i).equals(ar.get(j)))
						{
							ar.remove(j);
							j--;
//							System.out.println(j);
						}
			}
		}
		System.out.println(ar);
		
	}
}

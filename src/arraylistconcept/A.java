package arraylistconcept;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class A {
	
	public static void main(String[] args) {
		ArrayList<Integer> ar = new  ArrayList<Integer>();
		ar.add(1);
		ar.add(2);
		ar.add(2);
		ar.add(1);
		LinkedHashSet<Integer> hashSet = new LinkedHashSet<>(ar);
		ArrayList<Integer> arNew = new ArrayList<>(hashSet);
		System.out.println(arNew);
	
		
		
		
	}

}

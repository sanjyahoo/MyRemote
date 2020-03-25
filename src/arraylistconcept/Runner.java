package arraylistconcept;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Runner {

	public static void main(String[] args) {
		List<Laptop> laps = new ArrayList<Laptop>();
		laps.add(new Laptop(15, "Dell", 1200));
		laps.add(new Laptop(8, "Apple", 2000));
		laps.add(new Laptop(32, "HP", 30000));
		
		Comparator<Laptop> com = new Comparator<Laptop>() {
			
			@Override
			public int compare(Laptop o1, Laptop o2) {
				if(o1.getPrice()>o2.getPrice())
				{
					return 1;
				}
				else
					return -1;				
			}
		};
		
		Collections.sort(laps, com);
		
	}
}

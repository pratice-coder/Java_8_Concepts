package lambdaExpressionsWithCollections;

import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

/**
 * @author abinash
 */
public class SortTreeMapElementsWithLambdaExpression {
	
	public static void main(String args[]) {
		//Default sorting order in TreeMap is Ascending order.
		// The sorting happens based on the keys as it is unique NOT on values.
		
		//Customized sorting (Descending order)
		Comparator< Integer> comparator = (Integer obj1, Integer obj2) -> {
			if(obj1 > obj2)
				return -1;
			else if(obj1 < obj2)
				return 1;
			else 
				return 0;
		};
		
		Map<Integer, String> map = new TreeMap<Integer,String>(comparator);
		map.put(2, "20");
		map.put(5, "50");
		map.put(6, "60");
		map.put(3, "30");
		map.put(4, "40");
		map.put(1, "10");
		System.out.println("After sorting the TreeMap elements :  " + map);
		
	}

}

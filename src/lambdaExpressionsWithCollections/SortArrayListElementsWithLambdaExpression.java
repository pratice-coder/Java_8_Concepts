package lambdaExpressionsWithCollections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * @author abinash
 */
public class SortArrayListElementsWithLambdaExpression {
	
	public static void main(String[] args) {
		
		List<Integer> list = new ArrayList<Integer>();
		  list.add(10);
		  list.add(0);
		  list.add(15);
		  list.add(5);
		  list.add(20);
		  
		  System.out.println("Before sorting :  " + list);
		  
		  Comparator<Integer> comparator = (Integer obj1, Integer obj2) -> {
			  if(obj1 > obj2)
				  return -1;
			  else if (obj1 < obj2)
				  return 1;
			  else 
				  return 0;
		  };
		  
		  Collections.sort(list, comparator);
		  
		  System.out.println("After sorting :  " + list);
	}

}

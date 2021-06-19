package lambdaExpressionsWithCollections;

import java.util.*;
/**
 * @author abinash
 */
public class SortTreeSetElementsWithLambdaExpression {
	
	public static void main(String...strings) {
		
		 Comparator<Integer> comparator = (Integer obj1, Integer obj2 ) -> {
			 if(obj1 > obj2)
				 return -1;
			 else if(obj1 < obj2)
				 return 1;
			 else 
				 return 0;
		 };
		 
		Set<Integer> set = new TreeSet<Integer>(comparator);
		 set.add(10);
		 set.add(0);
		 set.add(15);
		 set.add(5);
		 set.add(20);
		 
		 // By default the natural sorting order in TreeSet is "Ascending" order always.
		 
		 System.out.println("Treeset custom  sorting elements order : " + set);
	}

}

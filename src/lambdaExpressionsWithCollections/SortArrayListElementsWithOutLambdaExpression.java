package lambdaExpressionsWithCollections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * @author abinash
 */
class MyComparator implements Comparator<Integer> {
	
	@Override
	public int compare(Integer Obj1, Integer Obj2) {
		
		if(Obj1 > Obj2)
			return -1;
		else if (Obj1 < Obj2)
			return 1;
		else
			return 0;
	}
}
public class SortArrayListElementsWithOutLambdaExpression {
	
	public static void main(String[] args) {
		 
		  List<Integer> list = new ArrayList<Integer>();
		  list.add(10);
		  list.add(0);
		  list.add(15);
		  list.add(5);
		  list.add(20);
		  
		  System.out.println("Before sorting :  " + list);
		  
		  Collections.sort(list);  // This is default natural sorting order which is always ascending
		  System.out.println("After sorting :  " + list);
		  
		  // In case, now you want to have your own customized sorting order then you have use Comparator interface
		  Collections.sort(list,new MyComparator());
		  System.out.println("After sorting :  " + list);
	}

}

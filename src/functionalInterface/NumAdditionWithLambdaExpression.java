package functionalInterface;

/** 
 * @author abinash
 *  
 */
@FunctionalInterface
interface Interf3 {
	public int add(int num1, int num2);
}

public class NumAdditionWithLambdaExpression {
	
	public static void main(String[] args) {
		Interf3  i = (a,b) -> (a+b);
		
		System.out.println("Sum of 2 numbers = " + i.add(10,20));
	}
}

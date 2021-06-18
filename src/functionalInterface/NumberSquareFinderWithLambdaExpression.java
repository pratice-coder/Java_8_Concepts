package functionalInterface;

/**
 * @author abinash
 */

@FunctionalInterface
interface SquareFormatter {
	
	public int squareIt(int  a);
}

public class NumberSquareFinderWithLambdaExpression {
	
	public static void main(String...args) {
		
		SquareFormatter formatter = a -> a*a;
		System.out.println(formatter.squareIt(10));
	}

}

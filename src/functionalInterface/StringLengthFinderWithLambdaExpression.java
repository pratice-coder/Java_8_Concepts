package functionalInterface;

/**
 * @author abinash
 */

@FunctionalInterface
interface StringOp {
	
	public int getLength(String s);
}
public class StringLengthFinderWithLambdaExpression {
	
	public static void main(String[] args) {
		StringOp op = s -> s.length();
		System.out.println("Length of the String = " + op.getLength("Hello"));
	}
}

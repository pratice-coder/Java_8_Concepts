package anonymousInnnerClassesAndLambdaExpressions;

/**
 * @author abinash
 */

@FunctionalInterface
interface Interf {
	
	public void m1();
}

public class CommonPointerLambdaExpressionProgram {
	
	int x = 20;
	
	public void m2() {
		/*
		 * y is a local variable to m2().
		 * So, the local variable which is referenced from Lambda expression is always considered as final
		 * variable.
		 * But, there is no restriction for class level variable (here it is x)
		 */
		int y = 30;
		
		Interf i = () -> {
			System.out.println("value of x = " + x);
			System.out.println("value of y = " + y);
			// So now if you try to change the value of y then immediately there will be compile time error.
			// CE : Local variables referenced from Lambda expression must be final, or effectively final.
		};
		i.m1();
	}
	
	public static void main(String...strings) {
		CommonPointerLambdaExpressionProgram program = new CommonPointerLambdaExpressionProgram();
		program.m2();
	}

}

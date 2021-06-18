package functionalInterface;

/**
 * @author abinash
 * To invoke Lambda expression, we can use Functional Interface.
 * Interface holds the implementation of Lambda expression.
 * 
 * Following program demonstrates that
 */

interface Interf1 {
	public void m1();
}

public class FuncInterfaceWithLambdaExpressionDemo {
	
	public static void main(String[] args) {
		// So, when ever compiler comes across the following line.. it will look-up the interface and provide the implementation
		// for that abstract method.
		Interf1 demo = () -> {
			for(int i=0;i<5;i++) {
				System.out.println("Index = " + i);
			}
		};
		demo.m1();
	}

}

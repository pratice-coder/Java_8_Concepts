package functionalInterface;

/**
 * @author abinash
 */

// This is an Functional Interface
interface Interf {
	
	public void m1();

}

class Demo implements Interf {
	
	@Override
	public void m1() {
		System.out.println("m1() method implementation");
	}
	
}

public class FuncInterfaceWithOutLambdaExpressionDemo {
	
	public static void main(String[] args) {
		Interf demo = new Demo();
		demo.m1();
	}
}

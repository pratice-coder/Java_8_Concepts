package defaultAndStaticMethods;

/**
 * @author abinash
 */

interface Left  {
	default void m1() {
		System.out.println("Left Interface");
	}
}

interface Right  {
	default void m1() {
		System.out.println("Right Interface");
	}
}


class Center implements Left,Right {
	/*
	 * If we don't provide any implemenations to this class then we will get ambiguity problem and leads us to Compilation Error.
	 * CE: Duplicate default methods named m1 with the parameters () and () are inherited from the types Right and Left
	 */
	/*
	 * How to solve that ?
	 * Ans - There are 2 ways to solve this.
	 *              1. provide your own implemenation
	 *              2. Sometimes you will need to use interface default method implementation in your class.
	 *                  In that case, use Interface_Name.super.method_name
	 */
	
	@Override
	public void m1() {
		System.out.println("This is my own implementation...");
		Left.super.m1();
	}
}

public class DefaultMethodsWrtMultipleInheritance {
	
	public static void main(String...strings) {
		Center c = new Center();
		c.m1();
	}
}

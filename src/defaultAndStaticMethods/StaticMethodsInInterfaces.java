package defaultAndStaticMethods;

/**
 * @author abinash
 *
 */
interface Interf2 {
	
	public static void m1() {
		System.out.println("Interface static method....");
	}
	
	public void m2() ;
	
}

class Test implements Interf2 {
	
	@Override
	public void m2() {
		System.out.println("m2().... imeplementation method");
	}
}

public class StaticMethodsInInterfaces  {
	
	public static void main(String[] args) {
		Test t1 = new Test();
		t1.m2();
		
		Interf2.m1(); // Only way to access static methods
	}
}

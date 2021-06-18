package functionalInterface;

/**
 * @author abinash
 *  Following program is completely valid
 *  
 *  Reason - The Child interface is not a Functional interface.
 *                  So, we can have multiple abstract methods.
 */
@FunctionalInterface
public interface FuncInterfaceDemoWrtInheritance3 {
  
	 public void m1();
	 
}

interface ChildInterface3 extends FuncInterfaceDemoWrtInheritance3 {
	public void m2();
}

package functionalInterface;

/**
 * @author abinash
 * In the child interface we can't define any new abstract methods otherwise we will get compile time error.
 * 
 * CE: Unexpected @FunctionalInterface annotation, multiple non-overriding abstract methods found in interface ChildInterface2
 */

@FunctionalInterface
public interface FuncInterfaceDemoWrtInheritance2 {
	
	public void m1();
}

@FunctionalInterface
interface ChildInterface2 extends FuncInterfaceDemoWrtInheritance2 {
	
	public void m2();
}

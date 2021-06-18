package functionalInterface;

/**
 * @author abinash
 * If an interface extends Functional Interface and child interface does not contain any abstract method, then
 * the child interface is always Functional Interface.
 * 
 * So, the following program is completely valid
 */
@FunctionalInterface
public interface FuncInterfaceDemoWrtInheritance {
	
	public void m1();
}

@FunctionalInterface
interface ChildInterface extends FuncInterfaceDemoWrtInheritance {
	// So though we have not defined any abstract method.. still it will carry the abstract method of parent interface
}

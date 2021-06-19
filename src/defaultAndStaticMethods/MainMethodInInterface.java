package defaultAndStaticMethods;

/**
 * @author abinash
 * From Java 1.8 we can define main() method inside interface as static methods are allowed inside interface now.
 */
public interface  MainMethodInInterface {
	
	public static void main() {
		System.out.println("Interface main() method.....");
	}
}

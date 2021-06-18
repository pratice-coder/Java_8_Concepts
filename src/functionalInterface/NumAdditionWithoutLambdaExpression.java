package functionalInterface;


/**
 * @author abinash
 */
interface Interf2{
	public  int add(int a, int b);
}

class Addition implements Interf2 {
	
	@Override
	public int add(int a,int b) {
		return (a+b);
	}
}
public class NumAdditionWithoutLambdaExpression {
	
	public static void main(String...args) {
		Interf2 i = new Addition();
		System.out.println("Addition of 2 numbers  = " + i.add(10,20));
	}

}

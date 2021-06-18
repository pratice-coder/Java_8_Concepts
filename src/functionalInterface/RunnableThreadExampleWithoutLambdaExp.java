package functionalInterface;

/**
 * @author abinash
 */

class MyRunnable implements Runnable {
	
	@Override
	public void run() {
		for(int i=0;i<10;i++) {
			System.out.println("Child Thread");
		}
	}
	
}

public class RunnableThreadExampleWithoutLambdaExp {
	
	public static void main(String...strings) {
		
		Runnable r = new MyRunnable();
		Thread  thread = new Thread(r);
		thread.start();
		for(int i=0;i<10;i++) {
			System.out.println("Main Thread");
		}
	}
}

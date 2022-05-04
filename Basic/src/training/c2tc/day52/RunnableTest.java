package training.c2tc.day52;

class MyRunnable implements Runnable {
// Implementing run method of Runnable
	public void run() {
		for (int i = 1; i <= 5; i++)
			System.out.println(" Message " + i);
	}
}

public class RunnableTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MyRunnable r = new MyRunnable();
		Thread t = new Thread(r);
		System.out.println(t);
		// starting the thread by start method which will
		// call run method internally
		t.start();
	}

}

package Thread_Ex;

public class MainEntry {
	public static void main(String[] args) {
		UserRunnable u1 = new UserRunnable("u1");
		Thread t1 = new Thread(u1);
		t1.start();
		Thread t2 = new Thread(new UserRunnable("u2"));
		Thread t3 = new Thread(new UserRunnable("u3"));
		
	}

}


/*public class MainEntry {
	public static void main(String[] args) {
		
		
		Thread t1 = new UserThread("t1");
		Thread t2 = new UserThread("t2");
		Thread t3 = new UserThread("t3");
		t1.start();
		t2.start();
		t3.start();
	}
}
*/
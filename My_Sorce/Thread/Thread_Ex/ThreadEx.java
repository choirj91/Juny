package Thread_Ex;

class UserThread extends Thread {
	String star;
	
	public UserThread(String star){
		this.star = star;
	}

	public void run() {
		 for (int i = 0; i < 10; i++) {
			try {
				sleep(100);
			} catch (Exception e) {
				e.printStackTrace();
			} //try end
			
			System.out.println(star);
		} //for end
	}
}

public class ThreadEx {
	public static void main(String[] args) {
		UserThread1 st = new UserThread1("¡Ù");
		UserThread1 st2 = new UserThread1("¡Ú");
		
		st.start();
		st2.start();
	}
}
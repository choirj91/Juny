package Thread_Ex;

public class UserThread1 extends Thread {
	
	String name;
	
	public UserThread1(String name){
		this.name = name;
	
	}

	@Override
	public void run() {
		System.out.println(name);
		for (int i = 0; i <= 10; i++) {
			if (i == 7) {
				try {
					sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
			}
			System.out.println(i);
	
		}
		}
	
}

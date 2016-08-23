package Thread_Ex;

public class UserRunnable implements Runnable {

	String name;
	
	public UserRunnable(String name){
		this.name = name;
	
	}

	@Override
	public void run() {
		System.out.println(name);
		for (int i = 0; i <= 10; i++) {
			if (i == 7) {
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
			}
			System.out.println(i);
	
		}
		}
	

}

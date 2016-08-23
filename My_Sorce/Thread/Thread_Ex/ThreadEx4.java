package Thread_Ex;

public class ThreadEx4 extends Thread {
	String name;
	
	public ThreadEx4(String name) {
		this.name = name;
	}
	
	
		public void run(){
			int i = 0;
			while (true) {
				System.out.println("thread name : " + name + "\t number : " + i++);
				if ( i == 10) break;
				try {
					sleep(5);
				} catch (Exception e) {
					e.printStackTrace();
				}
				
				
			}
		}
		
		public static void main(String[] args) {
			Thread t1 = new ThreadEx4("���� ���� ������");
			Thread t2 = new ThreadEx4("���� ������");
			Thread t3 = new ThreadEx4("���� ������");
			
			t1.setPriority(MAX_PRIORITY);	//10
			t2.setPriority(NORM_PRIORITY);	//5
			t3.setPriority(MIN_PRIORITY);		//1
			
			t1.start();
			t3.start();
			t2.start();
		}
}

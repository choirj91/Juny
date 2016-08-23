package Thread_Ex;

public class SimpleThread {  // outer class - 외부클래스 
	
	static void threadMessage(String message){
		String threadName = Thread.currentThread().getName();
		System.out.format("%s : %s%n", threadName, message );	//지정한 서식에 맞춰 사용
	}
	
	static class MessageLoop implements Runnable {  //inner class - 내부클래스

		@Override
		public void run() {
			String importantInfo[] = { "aa aa", "bb b", "cc c" , "dd d" };
			try {
				for (int i = 0; i < importantInfo.length; i++) {
					Thread.sleep(4000);
					threadMessage(importantInfo[i]);
				}
			} catch (Exception e) {
				threadMessage("I wasn't done!!!");
			}
		} // run() end	
		
	} // MessageLoop class end
	
	public static void main(String[] args) throws InterruptedException {
		long patience = 1000 * 60 * 60; 
		
		if( args.length > 0  ) {
			try {
				patience = Long.parseLong(args[0]) * 1000;
				
			} catch (Exception e) {
				System.err.println("argument integer input ");
				System.exit(1); //강제 종료 
			}
		}// if end
		
		threadMessage("Start MessageLoop thread");
		long startTime = System.currentTimeMillis();
		Thread t = new Thread(new MessageLoop());
		//Thread t2 = new Thread(new MessageLoop());
		t.start();   //t2.start();
		
		while( t.isAlive() ) {
			threadMessage("still waitting....");
			t.join(1000);
			
			if(  ( (System.currentTimeMillis() - startTime )  > patience ) && t.isAlive() ) {
				threadMessage("Tired of watting....");
				t.interrupt();
				t.join();
			}// if end
		} // while end
		
		threadMessage("Finally....");
	}
}







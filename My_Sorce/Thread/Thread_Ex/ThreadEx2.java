package Thread_Ex;

public class ThreadEx2 {
	public static void main(String[] args) {
		long id = Thread.currentThread().getId();	//
		String name = Thread.currentThread().getName();
		int priority = Thread.currentThread().getPriority();
		Thread.State state = Thread.currentThread().getState();
		
		System.out.println("현재 스레드 ID : " + id);
		System.out.println("현재 스레드 name : " + name);
		System.out.println("현재 스레드 priority : " + priority);
		System.out.println("현재 스레드 state : " + state);
	}
}

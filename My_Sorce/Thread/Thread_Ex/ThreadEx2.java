package Thread_Ex;

public class ThreadEx2 {
	public static void main(String[] args) {
		long id = Thread.currentThread().getId();	//
		String name = Thread.currentThread().getName();
		int priority = Thread.currentThread().getPriority();
		Thread.State state = Thread.currentThread().getState();
		
		System.out.println("���� ������ ID : " + id);
		System.out.println("���� ������ name : " + name);
		System.out.println("���� ������ priority : " + priority);
		System.out.println("���� ������ state : " + state);
	}
}

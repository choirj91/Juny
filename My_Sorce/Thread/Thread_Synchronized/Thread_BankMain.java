package Thread_Synchronized;

// 은행업무
class Atm{
	private int money;
	
	public Atm(int money) {
		this.money = money;
	}
	//입금함수
	public synchronized void deposit(int amount, String name){
		money += amount;
		System.out.println(name + " : 입금액 " + amount);
	}
	//출금함수
	synchronized public  void withdraw(int amount, String name){
		if ((money - amount) > 0) {
			Thread.yield();// 
			money -= amount;
			System.out.println(name + " : 출금액 " + amount);
		} else{
			System.out.println(name + "잔액이 부족하여 출금 불가");
		}
	}// if end
	//잔액 확인
	public void getMoney(){
		System.out.println("        잔액은 :  " + money);
	}
} // end Atm

// 사용자 & 스레드
class UserAtm extends Thread{
	
	Atm obj;	// 
	boolean flag = false;
	
	public UserAtm(Atm obj, String name) {
		super(name);
		this.obj	= obj;
	}
	
	
	@Override
	public void run() {
		for (int i = 0; i < 2; i++) {
			try {
				sleep(50);
				
			} catch (Exception e) {
				e.printStackTrace();
			}
			if (flag) {
				obj.deposit( (int)(Math.random()*10+2)*100, getName());
				obj.getMoney();
			}else{
				obj.withdraw( (int)(Math.random()*10+2)*100, getName());
				obj.getMoney();
			}
		} //for end
	}
	
	
} // end UserAtm

public class Thread_BankMain {
	public static void main(String[] args) {
		Atm at = new Atm(1000);
		UserAtm user1 = new UserAtm(at, "박정희");
		UserAtm user2 = new UserAtm(at, "전두환");
		UserAtm user3 = new UserAtm(at, "노태우");
		
		user1.start();
		user2.start();
		user3.start();
		
	}
}

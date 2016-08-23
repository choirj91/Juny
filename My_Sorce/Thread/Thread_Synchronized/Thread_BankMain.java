package Thread_Synchronized;

// �������
class Atm{
	private int money;
	
	public Atm(int money) {
		this.money = money;
	}
	//�Ա��Լ�
	public synchronized void deposit(int amount, String name){
		money += amount;
		System.out.println(name + " : �Աݾ� " + amount);
	}
	//����Լ�
	synchronized public  void withdraw(int amount, String name){
		if ((money - amount) > 0) {
			Thread.yield();// 
			money -= amount;
			System.out.println(name + " : ��ݾ� " + amount);
		} else{
			System.out.println(name + "�ܾ��� �����Ͽ� ��� �Ұ�");
		}
	}// if end
	//�ܾ� Ȯ��
	public void getMoney(){
		System.out.println("        �ܾ��� :  " + money);
	}
} // end Atm

// ����� & ������
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
		UserAtm user1 = new UserAtm(at, "������");
		UserAtm user2 = new UserAtm(at, "����ȯ");
		UserAtm user3 = new UserAtm(at, "���¿�");
		
		user1.start();
		user2.start();
		user3.start();
		
	}
}

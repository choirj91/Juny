package Oder;

import java.io.IOException;
import java.util.Calendar;
import java.util.HashMap;

public class Order_Statement_Main {
	private int resisterNumber;
	private String resisterDate;
	private ObtainOrder oo;
	

	
	public Order_Statement_Main(){
		
	}
	


	public static void main(String[] args) throws Exception {
		Order_UI use = new Order_UI();
		Customer cus = new Customer();		
		
		while(true){
			use.menu();
			String x = null;
			x = use.scan(x);
		if (x.equals("1")) {																	//���� ���
			
			Calendar today = Calendar.getInstance();
			Order_Statement_Main main = new Order_Statement_Main();
			String name = main.resister();														//���� �������
			main.resisterNumber = (int) (Math.random()*9999+1);
			main.resisterDate = use.todayImpo(today, today.get(Calendar.DAY_OF_WEEK));
			ObtainOrder o1 = new ObtainOrder(name, main.resisterNumber, main.resisterDate);		//���� ��
			
			
			
			}else if (x.equals("2")) {															//���� ���� Ȯ��
				ObtainOrder oo = new ObtainOrder();
				oo.printReceip();																//���� ��ǥ ���
				
			
				}else if (x.equals("3")) {
					Storage s = new Storage();													//â�� ���� Ȯ��
				
		
					}else if (x.equals("4")) {													//����
						
						System.exit(0);
			
						}else if (x.equals("99")) {												//������ ��� (1. ȸ������Ȯ�� 2. ���ο� ȸ�� ��� 3. ȸ������ ����)
						Manager m = new Manager();
						m.Manager();
			

}else System.out.println("�Źٸ��� �ٽ� �Է��� �ּ���.");
		
			}
	

	}
	public String resister(){
		Order_UI use = new Order_UI();
		
		System.out.println("�̸��� �Է��� �ּ���.");
		String name = use.scan(null);
		Customer cus = new Customer(name);
		int ex = use.scan(0);
		if (ex == 1) {
			return name;
			
		}else {
			System.out.println("���ο� ȸ�� ����� ���Ͻø� ī���Ϳ� ���� ���ּ���. \r\n ���α׷��� �����մϴ�.");
			 System.exit(0);
			 return "��";
			 
		}
				
		
	}
	
}

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
		if (x.equals("1")) {																	//수주 등록
			
			Calendar today = Calendar.getInstance();
			Order_Statement_Main main = new Order_Statement_Main();
			String name = main.resister();														//수주 등록정보
			main.resisterNumber = (int) (Math.random()*9999+1);
			main.resisterDate = use.todayImpo(today, today.get(Calendar.DAY_OF_WEEK));
			ObtainOrder o1 = new ObtainOrder(name, main.resisterNumber, main.resisterDate);		//수주 명세
			
			
			
			}else if (x.equals("2")) {															//수주 정보 확인
				ObtainOrder oo = new ObtainOrder();
				oo.printReceip();																//수주 명세표 출력
				
			
				}else if (x.equals("3")) {
					Storage s = new Storage();													//창고 정보 확인
				
		
					}else if (x.equals("4")) {													//종료
						
						System.exit(0);
			
						}else if (x.equals("99")) {												//관리자 모드 (1. 회원정보확인 2. 새로운 회원 등록 3. 회원정보 복구)
						Manager m = new Manager();
						m.Manager();
			

}else System.out.println("옮바르게 다시 입력해 주세요.");
		
			}
	

	}
	public String resister(){
		Order_UI use = new Order_UI();
		
		System.out.println("이름을 입력해 주세요.");
		String name = use.scan(null);
		Customer cus = new Customer(name);
		int ex = use.scan(0);
		if (ex == 1) {
			return name;
			
		}else {
			System.out.println("새로운 회원 등록을 원하시면 카운터에 문의 해주세요. \r\n 프로그램을 종료합니다.");
			 System.exit(0);
			 return "끝";
			 
		}
				
		
	}
	
}

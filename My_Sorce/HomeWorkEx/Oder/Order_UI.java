package Oder;

import java.util.*;

public class Order_UI {
	
	public Order_UI(){
		
	} //ordr_UI end
	
	public void menu(){
		Calendar today = Calendar.getInstance();
		
		System.out.println(todayImpo(today, today.get(Calendar.DAY_OF_WEEK)));
		System.out.println("<1> 수주등록 <2> 수주정보확인 <3>창고정보 확인 <4> 종료	<99> 관리자 모드");
	} //menu end
	
	public static String todayImpo(Calendar today, int x){
		day to = null;
		switch (x) {
		case 1 : to = day.일요일;  	break;
		case 2 : to = day.월요일;  	break;
		case 3 : to = day.화요일;  	break;
		case 4 : to = day.수요일;  	break;
		case 5 : to = day.목요일;  	break;
		case 6 : to = day.금요일;  	break;
		case 7 : to = day.토요일;  	break;

		default:
			break;
		}
		return today.get(Calendar.YEAR)+"년 "+ (today.get(Calendar.MONTH)+1) + 
				"월 " + today.get(Calendar.DATE)+ " " + to + " " + today.get(Calendar.HOUR_OF_DAY)
				+ "시 " + today.get(Calendar.MINUTE)+"분 " + today.get(Calendar.SECOND)+"초";
	}
	
	public int scan(int x){
		Scanner sc = new Scanner(System.in);
		x = sc.nextInt();
		return x;
	}
	
	public String scan(String x){
		Scanner sc = new Scanner(System.in);
		x = sc.nextLine();
		return x;
	}
}

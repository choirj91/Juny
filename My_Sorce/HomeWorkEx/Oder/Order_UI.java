package Oder;

import java.util.*;

public class Order_UI {
	
	public Order_UI(){
		
	} //ordr_UI end
	
	public void menu(){
		Calendar today = Calendar.getInstance();
		
		System.out.println(todayImpo(today, today.get(Calendar.DAY_OF_WEEK)));
		System.out.println("<1> ���ֵ�� <2> ��������Ȯ�� <3>â������ Ȯ�� <4> ����	<99> ������ ���");
	} //menu end
	
	public static String todayImpo(Calendar today, int x){
		day to = null;
		switch (x) {
		case 1 : to = day.�Ͽ���;  	break;
		case 2 : to = day.������;  	break;
		case 3 : to = day.ȭ����;  	break;
		case 4 : to = day.������;  	break;
		case 5 : to = day.�����;  	break;
		case 6 : to = day.�ݿ���;  	break;
		case 7 : to = day.�����;  	break;

		default:
			break;
		}
		return today.get(Calendar.YEAR)+"�� "+ (today.get(Calendar.MONTH)+1) + 
				"�� " + today.get(Calendar.DATE)+ " " + to + " " + today.get(Calendar.HOUR_OF_DAY)
				+ "�� " + today.get(Calendar.MINUTE)+"�� " + today.get(Calendar.SECOND)+"��";
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

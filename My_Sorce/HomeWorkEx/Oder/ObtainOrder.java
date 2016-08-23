package Oder;

import java.util.HashMap;
import java.util.Set;

import javax.sound.midi.Synthesizer;

public class ObtainOrder extends Item {
	static HashMap<Integer, Object> reci = new HashMap<Integer , Object >();
		protected int obtainCount;
		private double discount;
		Order_UI ui = new Order_UI();
	
	public static void resister_receip(String name, int obnum, String day, int obcount, double dis , int cod,String itname, int price ){
		
		reci.put(obnum,"수주 날짜 = " +day + " \n수주번호 = "+obnum+"   수주자 = "+ name +"   상품 = " +itname+"   상품코드 = "+ 
				cod+" 상품 갯수 = " +obcount+" 회원 등급별 할인율 = " +dis+"  수주 총 가격 = "+price);
		System.out.println("------------------------수주 명세표-------------------------");
		System.out.println(reci.get(obnum));
		System.out.println("---------------------------------------------------------");
		
	}
	
	public void printReceip(){
		Set<Integer> prin = reci.keySet();
		
		for(Object pp : prin){
			System.out.println("------------------------수주 명세표-------------------------");
			System.out.println(reci.get(pp));
			System.out.println("---------------------------------------------------------");
		}
	}
	
	public ObtainOrder(){
		
	}
	
	ObtainOrder(String name, int obnum, String day)throws Exception{
		Order_Statement_Main main = new Order_Statement_Main();
		this.discount = this.discont(name);
		System.out.println("수량을 입력하세요."); int x = ui.scan(0);
		this.obtainCount = x;
		Item it = new Item(name, x, this.discont(name));
		this.resister_receip(name, obnum, day,this.obtainCount ,this.discount , it.itemCod, it.itemName, it.price);
		
				
	}
	
	public double discont(String name){
		Customer cu = new Customer();
		String vv;
			vv = cu.in.get(name).Vipmember;
		if (vv.equals("특별회원")) {
			return  0.15;
		}else return 0.05;
		}
	}

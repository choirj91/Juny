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
		
		reci.put(obnum,"���� ��¥ = " +day + " \n���ֹ�ȣ = "+obnum+"   ������ = "+ name +"   ��ǰ = " +itname+"   ��ǰ�ڵ� = "+ 
				cod+" ��ǰ ���� = " +obcount+" ȸ�� ��޺� ������ = " +dis+"  ���� �� ���� = "+price);
		System.out.println("------------------------���� ��ǥ-------------------------");
		System.out.println(reci.get(obnum));
		System.out.println("---------------------------------------------------------");
		
	}
	
	public void printReceip(){
		Set<Integer> prin = reci.keySet();
		
		for(Object pp : prin){
			System.out.println("------------------------���� ��ǥ-------------------------");
			System.out.println(reci.get(pp));
			System.out.println("---------------------------------------------------------");
		}
	}
	
	public ObtainOrder(){
		
	}
	
	ObtainOrder(String name, int obnum, String day)throws Exception{
		Order_Statement_Main main = new Order_Statement_Main();
		this.discount = this.discont(name);
		System.out.println("������ �Է��ϼ���."); int x = ui.scan(0);
		this.obtainCount = x;
		Item it = new Item(name, x, this.discont(name));
		this.resister_receip(name, obnum, day,this.obtainCount ,this.discount , it.itemCod, it.itemName, it.price);
		
				
	}
	
	public double discont(String name){
		Customer cu = new Customer();
		String vv;
			vv = cu.in.get(name).Vipmember;
		if (vv.equals("Ư��ȸ��")) {
			return  0.15;
		}else return 0.05;
		}
	}

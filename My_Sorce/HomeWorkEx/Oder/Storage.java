package Oder;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.HashMap;

public class Storage extends Item implements Serializable {
	HashMap<String, Storage> st = new HashMap<String, Storage>();
	 static HashMap<String, Storage> stin = new HashMap<String, Storage>();
	String st_name;
	String st_Addr;
	String st_Ph;
	int it_cod;
	String it_name;
	int count;
	
	public Storage(String name,int price, String itemName, int count) throws Exception{
		Order_UI ui = new Order_UI();
		Item it = new Item();
		
		Customer cus = new Customer(name, 0, 0);
		
		
		st.put(name, new Storage(cus.st.get(name).st_name, cus.st.get(name).st_addr, cus.st.get(name).st_phone,
				price, itemName, count));
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("stock.txt"));
		oos.writeObject(st);
		oos.flush(); oos.close();
		
	}

	public Storage(String st_name, String st_Addr, String st_Ph, int it_cod, String it_name, int count) {
		this.st_name = st_name;
		this.st_Addr = st_Addr;
		this.st_Ph = st_Ph;
		this.it_cod = it_cod;
		this.it_name = it_name;
		this.count = count;
	}
	
	public Storage()  {
	try {
		Order_UI ui = new Order_UI();
		System.out.println("이름을 입력해 주세요."); String name = ui.scan(null);
		System.out.println("비밀번호를 입력해 주세요."); int pass = ui.scan(0);
		Customer cus = new Customer(name, pass);
		 ObjectInputStream ois = new ObjectInputStream(new FileInputStream("stock.txt")); 
	      stin = (HashMap<String, Storage>)ois.readObject();
	      ois.close();
	      if (stin.containsKey(name)) {
	    	  st_name = stin.get(name).st_name;
	    	  st_Addr = stin.get(name).st_Addr;
	    	  st_Ph = stin.get(name).st_Ph;
	    	  it_cod = stin.get(name).it_cod;
	    	  it_name = stin.get(name).it_name;
	    	  count = stin.get(name).count;
	    	  System.out.println("================창고 정보=======================");
	    	  System.out.println("창고 이름 = " + st_name +"\n 창고 주소지 = " +st_Addr +
	    			  "\n 창고 연락처 = " + st_Ph +"\n 저장 정보 ==>  " + " Item Code = "+ 
	    			  it_cod +" Item Name = "  + it_name +"  현재 재고 수량 = " +count);
	    	  System.out.println("=============================================");
		}
	} catch (Exception e) {
		System.out.println("잘못된 접근 입니다. 다시 확인해 주십시오.");
	}
	}
}

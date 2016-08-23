package Oder;

import java.io.*;
import java.text.SimpleDateFormat;
import java.util.*;
public class Customer extends Vip implements Serializable {
	 HashMap<String, Customer> customerImpo = new HashMap<String, Customer>();
	 static HashMap<String, Customer> in = new HashMap<String, Customer>();
	 HashMap<String, Customer> stImpo = new HashMap<String, Customer>();
	 static HashMap<String, Customer> st = new HashMap<String, Customer>();
	protected int customer_Number ;
	protected String customer_Name;
	protected String customer_Address;
	protected String customer_Phone;
	protected String customer_Joindate;
	protected String Vipmember;
	
	protected String st_name;
	protected String st_addr;
	protected String st_phone;
	protected int st_pass;
	
	public Customer(String name, int pass, int ss){
		
		
	}
	
	public Customer(String name, int pass){
		if (st.get(name).st_pass != pass ) {
			System.out.println("비밀번호가 맞지 않아, 프로그램을 종료 합니다.");
			System.exit(0);
		}
		
	}
	
	public Customer() {
		try {
			
			ObjectInputStream ois = new ObjectInputStream(new FileInputStream("join.txt")); 
		      in = (HashMap<String, Customer>)ois.readObject();
		      ois.close(); 
		      ObjectInputStream oiss = new ObjectInputStream(new FileInputStream("storage.txt")); 
		      st = (HashMap<String, Customer>)oiss.readObject();
		      oiss.close();
					
		     /* Set<String> set = in.keySet();
		      for( String join  :  set ){
		    	  customer_Name = in.get(join).customer_Name;
		    	  customer_Address = in.get(join).customer_Address;
		    	  customer_Phone = in.get(join).customer_Phone;
		    	  customer_Joindate = in.get(join).customer_Joindate;
		    	  customer_Number = in.get(join).customer_Number;
		    	  Vipmember = in.get(join).Vipmember;
		    	  
		    	  }*/
		     
		}catch (Exception e) {
			System.out.println("현재 읽어올 수 없는 데이터가 없습니다. 관리자 모드로 진입하십시오.");
		}
	}
	public Customer(String stname, String stAddr, String stPhone, int stpass) {
		st_name = stname;
		st_addr = stAddr;
		st_phone = stPhone;
		st_pass = stpass;
	}
	
	public Customer(String name){
		if (in.containsKey(name)) {
			 customer_Name = in.get(name).customer_Name;
	    	  customer_Address = in.get(name).customer_Address;
	    	  customer_Phone = in.get(name).customer_Phone;
	    	  customer_Joindate = in.get(name).customer_Joindate;
	    	  customer_Number = in.get(name).customer_Number;
	    	  Vipmember = in.get(name).Vipmember;
	    	  System.out.println(customer_Name +"님의 회원 번호 " + customer_Number + " , 주소지 = " + customer_Address
	    			  + "  연락처  = " + customer_Phone + " \n가 맞으면 1번, 틀리면 2번을 눌러주세요.");
			
		}else if (! in.containsKey(name)) {
			System.out.println("회원 정보에 존재하지 않습니다. 확인 후 다시 접근해주세요.");
			System.exit(0);
			
		}
	}
	
	protected Customer(String name, String address, String phone, int num , String vip) {
		this.customer_Name = name;
		this.customer_Address = address;
		this.customer_Phone = phone;
		this.customer_Joindate = todayDate();
		this.customer_Number = num;
		this.Vipmember = vip;
	}

	
	
	protected void customer_Join() throws IOException{
		Order_UI ui = new Order_UI();
		
		System.out.println("회원 번호를 입력하세요.");
		int num =ui.scan(0);
		System.out.println("이름을 입력하세요.");
		String Name = ui.scan(null);
		System.out.println("주소를 입력하세요.");
		String Address = ui.scan(null);
		System.out.println("핸드폰 번호를 입력하세요.");
		String Phone = ui.scan(null);
		System.out.println("회원등급을 입력하세요.(특별회원 , 일반회원)");
		String vip = ui.scan(null); 
		 
		customerImpo.put(Name, new Customer(Name, Address, Phone, num, vip) );
		 ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("join.txt"));
		 oos.writeObject(customerImpo);
		 oos.flush(); oos.close();
		 
		 System.out.println("창고이름을 입력해 주세요.");
			String Stname = ui.scan(null);
			System.out.println("창고주소를 입력해 주세요.");
			String StAddr = ui.scan(null);
			System.out.println("창고 전화번호를 입력해 주세요.");
			String stPhone = ui.scan(null);
			System.out.println("비밀번호를 설정해 주세요.");
			int stpass = ui.scan(0);
			
			stImpo.put(Name, new Customer(Stname,StAddr,stPhone,stpass));
			ObjectOutputStream oos1 = new ObjectOutputStream(new FileOutputStream("storage.txt"));
			oos1.writeObject(stImpo);
			oos1.flush(); oos1.close();
		
	

	}
	
	
	
	
	
	protected void customer_Intput() throws FileNotFoundException, IOException, ClassNotFoundException{
		
	try {
		HashMap<String, Customer> in = new HashMap<String, Customer>();
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("join.txt")); 
	      in = (HashMap<String, Customer>)ois.readObject();
		ois.close();
		HashMap<String, Customer> stin = new HashMap<String, Customer>();
		ObjectInputStream oiss = new ObjectInputStream(new FileInputStream("storage.txt")); 
		stin = (HashMap<String, Customer>)oiss.readObject();;
		oiss.close();
	      
				
	      Set<String> set = in.keySet();
	      for( String join  :  set  ){
				String name = in.get(join).customer_Name;
				String addr = in.get(join).customer_Address;
				String phone = in.get(join).customer_Phone;
				String joday = in.get(join).customer_Joindate;
				int num = in.get(join).customer_Number;
				String vip = in.get(join).Vipmember;
				
				String sti_name = stin.get(join).st_name;
		    	  String sti_addr = stin.get(join).st_addr;
		    	  String sti_ph = stin.get(join).st_phone;
				 
				System.out.println("회원 번호 = " + num +"  성함 = " + name + " 주소 = " + addr + "  연락처 = "+ phone 
						+ "  가입 날짜  = " + joday + "  회원등급 = " + vip);
				System.out.println("========>  창고 이름 : " + sti_name + "  창고 주소 = " + sti_addr + " 창고 연락처 =  " + sti_ph);
	      }
				
	      
	} catch (Exception e) {
		System.out.println("현재 읽어 올 수 있는 데이터가 없습니다.");
	}
	      
	}
	
	private String todayDate() {
		Calendar cal = Calendar.getInstance();
		Date day = cal.getTime();
		SimpleDateFormat today;
		today = new SimpleDateFormat("yy-MM-dd E요일");
		return today.format(day);
	}
}

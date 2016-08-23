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
			System.out.println("��й�ȣ�� ���� �ʾ�, ���α׷��� ���� �մϴ�.");
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
			System.out.println("���� �о�� �� ���� �����Ͱ� �����ϴ�. ������ ���� �����Ͻʽÿ�.");
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
	    	  System.out.println(customer_Name +"���� ȸ�� ��ȣ " + customer_Number + " , �ּ��� = " + customer_Address
	    			  + "  ����ó  = " + customer_Phone + " \n�� ������ 1��, Ʋ���� 2���� �����ּ���.");
			
		}else if (! in.containsKey(name)) {
			System.out.println("ȸ�� ������ �������� �ʽ��ϴ�. Ȯ�� �� �ٽ� �������ּ���.");
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
		
		System.out.println("ȸ�� ��ȣ�� �Է��ϼ���.");
		int num =ui.scan(0);
		System.out.println("�̸��� �Է��ϼ���.");
		String Name = ui.scan(null);
		System.out.println("�ּҸ� �Է��ϼ���.");
		String Address = ui.scan(null);
		System.out.println("�ڵ��� ��ȣ�� �Է��ϼ���.");
		String Phone = ui.scan(null);
		System.out.println("ȸ������� �Է��ϼ���.(Ư��ȸ�� , �Ϲ�ȸ��)");
		String vip = ui.scan(null); 
		 
		customerImpo.put(Name, new Customer(Name, Address, Phone, num, vip) );
		 ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("join.txt"));
		 oos.writeObject(customerImpo);
		 oos.flush(); oos.close();
		 
		 System.out.println("â���̸��� �Է��� �ּ���.");
			String Stname = ui.scan(null);
			System.out.println("â���ּҸ� �Է��� �ּ���.");
			String StAddr = ui.scan(null);
			System.out.println("â�� ��ȭ��ȣ�� �Է��� �ּ���.");
			String stPhone = ui.scan(null);
			System.out.println("��й�ȣ�� ������ �ּ���.");
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
				 
				System.out.println("ȸ�� ��ȣ = " + num +"  ���� = " + name + " �ּ� = " + addr + "  ����ó = "+ phone 
						+ "  ���� ��¥  = " + joday + "  ȸ����� = " + vip);
				System.out.println("========>  â�� �̸� : " + sti_name + "  â�� �ּ� = " + sti_addr + " â�� ����ó =  " + sti_ph);
	      }
				
	      
	} catch (Exception e) {
		System.out.println("���� �о� �� �� �ִ� �����Ͱ� �����ϴ�.");
	}
	      
	}
	
	private String todayDate() {
		Calendar cal = Calendar.getInstance();
		Date day = cal.getTime();
		SimpleDateFormat today;
		today = new SimpleDateFormat("yy-MM-dd E����");
		return today.format(day);
	}
}

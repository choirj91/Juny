package JDBC_Update;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class MainEntry {
	 String url;
	 String id;
	 String pwd;
	 Connection conn;
	 Statement stmt;
	 ResultSet rs;
	 int x;
	
	public static void main(String[] args) throws Exception {
		MainEntry me = new MainEntry();
		//me.conn.setAutoCommit(false);// �ڵ�Ŀ�� ����. �ڹٿ����� �ڵ� Ŀ��.
		me.open();
		me.ip();
		
		
		do{
		me.selec();
		me.x = me.scan(0);
		if (me.x == 1) {
			me.delete();
		}else {
			me.update();
			System.out.println("�����Ϸ�!");
		}
		
		}while(true);
		
		
		
		}
		
		
		
		
		
	 // main end
	
	public void selec(){
		System.out.println("�����͸� ���� �Ͻ� �Ÿ� 1��,");
		System.out.println("�����͸� �����ϽǰŸ� 2���� �����ּ���. ��!.....");
	}
	
	public void delete() throws Exception{
		MainEntry me = new MainEntry();
		Scanner sc = new Scanner(System.in);
		System.out.println("\n ��Ͽ��� ������ ��ȣ��?");
		int num = sc.nextInt();
		String sql = "delete from gift where gno = " + num;
		
		int result = stmt.executeUpdate(sql);
		System.out.println(result + "�����ͻ��� ���� \n" );
	}
	
	public void open() throws Exception{
		
		Class.forName("oracle.jdbc.OracleDriver");
		System.out.println("driver load success!!");
		url = "jdbc:oracle:thin:@221.141.152.31:1521:xe";
		 id = "jun";
		 pwd = "oracle";
		conn = DriverManager.getConnection(url, id, pwd);
		stmt = conn.createStatement();	//DML ��ɾ�...��ȯ���� �ִ� select
		 rs =stmt.executeQuery("select * from gift");
		 
		 
	}
	public void close() throws Exception{
		rs.close();	stmt.close();	conn.close();
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
	public void update() throws Exception{
		System.out.println("\n������ ������ ǰ�� �Է� = ");
        int up_num = this.scan(0);
        System.out.println("������ Gname �Է�");
        String x = this.scan(null);
        String up_sql = "Update gift set gname = " + " ' " + x + " ' " + "where gno =" +up_num;
        stmt.executeUpdate(up_sql);
	}
	
	public void ip() throws Exception{
		System.out.println("���� ���̺� ����.");
		while (rs.next()) {
			int gno = rs.getInt(1); //getxxx(�ε�����ȣ) - �ڹٿʹ� �޸� 1���� ����.
			String gname = rs.getString("gname");	// getxxx("�ʵ��");
			int g_s = rs.getInt("g_start");
			int g_e = rs.getInt("g_end");
			
			System.out.println(gno  + " , " + gname + " , " + g_s + " , " + g_e);
		}
		
		
	
	}
}

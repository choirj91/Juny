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
		//me.conn.setAutoCommit(false);// 자동커밋 안함. 자바에서는 자동 커밋.
		me.open();
		me.ip();
		
		
		do{
		me.selec();
		me.x = me.scan(0);
		if (me.x == 1) {
			me.delete();
		}else {
			me.update();
			System.out.println("수정완료!");
		}
		
		}while(true);
		
		
		
		}
		
		
		
		
		
	 // main end
	
	public void selec(){
		System.out.println("데이터를 삭제 하실 거면 1번,");
		System.out.println("데이터를 수정하실거면 2번을 눌러주세요. 삐!.....");
	}
	
	public void delete() throws Exception{
		MainEntry me = new MainEntry();
		Scanner sc = new Scanner(System.in);
		System.out.println("\n 목록에서 삭제할 번호는?");
		int num = sc.nextInt();
		String sql = "delete from gift where gno = " + num;
		
		int result = stmt.executeUpdate(sql);
		System.out.println(result + "데이터삭제 성공 \n" );
	}
	
	public void open() throws Exception{
		
		Class.forName("oracle.jdbc.OracleDriver");
		System.out.println("driver load success!!");
		url = "jdbc:oracle:thin:@221.141.152.31:1521:xe";
		 id = "jun";
		 pwd = "oracle";
		conn = DriverManager.getConnection(url, id, pwd);
		stmt = conn.createStatement();	//DML 명령어...반환값이 있는 select
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
		System.out.println("\n수정할 데이터 품명 입력 = ");
        int up_num = this.scan(0);
        System.out.println("수정할 Gname 입력");
        String x = this.scan(null);
        String up_sql = "Update gift set gname = " + " ' " + x + " ' " + "where gno =" +up_num;
        stmt.executeUpdate(up_sql);
	}
	
	public void ip() throws Exception{
		System.out.println("현재 테이블 정보.");
		while (rs.next()) {
			int gno = rs.getInt(1); //getxxx(인덱스번호) - 자바와는 달리 1부터 시작.
			String gname = rs.getString("gname");	// getxxx("필드명");
			int g_s = rs.getInt("g_start");
			int g_e = rs.getInt("g_end");
			
			System.out.println(gno  + " , " + gname + " , " + g_s + " , " + g_e);
		}
		
		
	
	}
}

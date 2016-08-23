package JDBC_Open;

import java.sql.Connection;
import java.sql.DriverManager;

public class MainEntry {
	public static void main(String[] args) throws Exception {
		//1. Driver load, ... excection.....
		//Class.forName("oracle.jdbc.driver.OracleDriver");
		Class.forName("oracle.jdbc.OracleDriver");
		System.out.println("Driver load success!!");
		//2 connection & open	// 드라이버:@IP:PortNumber:SID(or 전역데이터베이스명)
		String url = "jdbc:oracle:thin:@221.141.152.31:1521:xe";
		String id = "jun";
		String pwd = "oracle";
		Connection conn = DriverManager.getConnection(url, id, pwd);
		System.out.println("성공했다요");
		//3. 사용(DML 명령어)
		
		//4. 닫기
		conn.close();
	}
}

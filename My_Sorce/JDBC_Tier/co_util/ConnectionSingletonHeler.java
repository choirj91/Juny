package co_util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/*
 ConnectionHelper ?��?��?��?�� 문제
매번 ?��?��?���? 로드 ....
     connection?��?��....

?��차피 ?��?��?�� ?��로세?��?��?�� ?��?���? 만들?��?��
?��?��?��?���? ?�� ?��?��

?���? 방법?? > 공유?��?�� ?���??��  
 */
public class ConnectionSingletonHeler {
	
	//?��?��?�� ?��로세?��?��?�� 공통?���? ?��?��?�� ?�� ?��?�� 공용?��?�� (static)
	private static Connection conn;
	private ConnectionSingletonHeler(){}
	
	//?��?�� (?��근자: public , static ) 
	public static  Connection getConnection(String dsn){
		//Connection conn = null;
		if(conn != null){
			return conn;
		}
		
		try{
			if(dsn.equals("mysql")){
				 Class.forName("com.mysql.jdbc.Driver");
				 conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/sampledb","sampleUser","1004");
				
			}else if(dsn.equals("oracle")){
				Class.forName("oracle.jdbc.OracleDriver");
				conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","kingsmile","oracle");
			}
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			return conn;
		}
	}
   
	public static void close() throws SQLException {
		if(conn != null){
			if(!conn.isClosed()){
				conn.close();
			}
		}
	}

}

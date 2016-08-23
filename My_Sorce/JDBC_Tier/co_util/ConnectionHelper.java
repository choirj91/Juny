package co_util;

import java.sql.Connection;
import java.sql.DriverManager;

//DB?���? ?���? 반복?��?���? 코딩 ?���?
/*
?���? ?��?��?��?��?�� ?��?�� 코드 구현?�� ?���? ?��?���? ?���?

Class.forName("oracle.jdbc.OracleDriver"); //?��?��?���? ?��?��?�� ?���? 명시 
conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","SCOTT","1004");

?��?�� ?��?���? ?��?�� 
ConnectionHelper.getConnection("mysql") or ("oracle")
dsn = > data source name 
 
 */

public class ConnectionHelper {
	
	//?��?�� (?��근자: public , static ) 
	public static  Connection getConnection(String dsn){
		Connection conn = null;
		
		try{
			if(dsn.equals("mysql")){
				 Class.forName("com.mysql.jdbc.Driver");
				 conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/sampledb","sampleUser","1004");
				
			}else if(dsn.equals("oracle")){
				Class.forName("oracle.jdbc.OracleDriver");
				conn = DriverManager.getConnection("jdbc:oracle:thin:@127.0.0.1:1521:xe","jun","oracle");
			}
		}catch(Exception e){
			
		}finally{
			return conn;
		}
	}
	
	public static  Connection getConnection(String dsn , String userid , String pwd){
		Connection conn = null;
		
		try{
			if(dsn.equals("mysql")){
				 Class.forName("com.mysql.jdbc.Driver");
				 conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/sampledb",userid,pwd);
				
			}else if(dsn.equals("oracle")){
				Class.forName("oracle.jdbc.OracleDriver");
				conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe",userid,pwd);
			}
		}catch(Exception e){
			
		}finally{
			return conn;
		}
	}
}

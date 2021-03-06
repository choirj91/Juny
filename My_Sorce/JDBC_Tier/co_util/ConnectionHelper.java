package co_util;

import java.sql.Connection;
import java.sql.DriverManager;

//DB?°κ²? ? λ³? λ°λ³΅? ?Όλ‘? μ½λ© ?΄κ²?
/*
?€λ₯? ?΄??€?? ?? μ½λ κ΅¬ν? ?μ§? ??λ‘? ?€κ³?

Class.forName("oracle.jdbc.OracleDriver"); //??Ό?΄λ²? ?΄??€ ?΄λ¦? λͺμ 
conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","SCOTT","1004");

?΄?° ??Όλ‘? ?¬?© 
ConnectionHelper.getConnection("mysql") or ("oracle")
dsn = > data source name 
 
 */

public class ConnectionHelper {
	
	//?¨? (? κ·Όμ: public , static ) 
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

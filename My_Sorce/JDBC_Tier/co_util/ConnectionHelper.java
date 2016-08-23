package co_util;

import java.sql.Connection;
import java.sql.DriverManager;

//DB?ó∞Í≤? ?†ïÎ≥? Î∞òÎ≥µ?†Å?úºÎ°? ÏΩîÎî© ?ï¥Í≤?
/*
?ã§Î•? ?Å¥?ûò?ä§?óê?Ñú ?ïÑ?ûò ÏΩîÎìú Íµ¨ÌòÑ?ùÑ ?ïòÏß? ?ïä?èÑÎ°? ?Ñ§Í≥?

Class.forName("oracle.jdbc.OracleDriver"); //?ìú?ùº?ù¥Î≤? ?Å¥?ûò?ä§ ?ù¥Î¶? Î™ÖÏãú 
conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","SCOTT","1004");

?ù¥?ü∞ ?ãù?úºÎ°? ?Ç¨?ö© 
ConnectionHelper.getConnection("mysql") or ("oracle")
dsn = > data source name 
 
 */

public class ConnectionHelper {
	
	//?ï®?àò (?†ëÍ∑ºÏûê: public , static ) 
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

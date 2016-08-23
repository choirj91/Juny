package co_util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/*
 ConnectionHelper ?Å¥?ûò?ä§?ùò Î¨∏Ï†ú
Îß§Î≤à ?ìú?ùº?ù¥Î≤? Î°úÎìú ....
     connection?Éù?Ñ±....

?ñ¥Ï∞®Ìîº ?ïò?Çò?ùò ?îÑÎ°úÏÑ∏?ä§?óê?Ñú ?ïò?ÇòÎß? ÎßåÎì§?ñ¥?Ñú
?û¨?Ç¨?ö©?ïòÎ©? ?ê† ?Öê?ç∞

?ï¥Í≤? Î∞©Î≤ï?? > Í≥µÏú†?ûê?õê ?ã±Í∏??Ü§  
 */
public class ConnectionSingletonHeler {
	
	//?ïò?Çò?ùò ?îÑÎ°úÏÑ∏?ä§?óê?Ñú Í≥µÌÜµ?úºÎ°? ?Ç¨?ö©?ï† ?àò ?ûà?äî Í≥µÏö©?ûê?õê (static)
	private static Connection conn;
	private ConnectionSingletonHeler(){}
	
	//?ï®?àò (?†ëÍ∑ºÏûê: public , static ) 
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

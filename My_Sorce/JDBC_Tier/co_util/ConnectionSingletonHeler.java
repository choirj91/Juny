package co_util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/*
 ConnectionHelper ?΄??€? λ¬Έμ 
λ§€λ² ??Ό?΄λ²? λ‘λ ....
     connection??±....

?΄μ°¨νΌ ??? ?λ‘μΈ?€?? ??λ§? λ§λ€?΄?
?¬?¬?©?λ©? ?  ??°

?΄κ²? λ°©λ²?? > κ³΅μ ?? ?±κΈ??€  
 */
public class ConnectionSingletonHeler {
	
	//??? ?λ‘μΈ?€?? κ³΅ν΅?Όλ‘? ?¬?©?  ? ?? κ³΅μ©?? (static)
	private static Connection conn;
	private ConnectionSingletonHeler(){}
	
	//?¨? (? κ·Όμ: public , static ) 
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

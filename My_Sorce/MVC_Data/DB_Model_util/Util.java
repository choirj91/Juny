package DB_Model_util;

public class Util {  //한글처리
	public static String toKor(String str) {
		try {
			byte[] b = str.getBytes("euc-kr");  // or "utf-8"
			return new String(b);
			
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}	
	}
	
	public static String toLatin(String str ) {		//한글이 아닌 그 외 언어들
			try {
				byte[] b = str.getBytes();  
				return new String(b, "euc-kr");
				
			} catch (Exception e) {
				e.printStackTrace();
				return null;
			}
	}
}

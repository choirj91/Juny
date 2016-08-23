package API;

public class Object_Class {		//Object 를 상속하지 않아도 기본적으로 자동으로 상속되기 때문에, 모든 메소드 사용가능.
	public static void main(String[] args) {
		
//=====================equals()	-	문자열이 동일한지 조사하는 메소드.
		
		String str1 = new String("hh");
		String str2 = new String("hH");
		
		System.out.println(str1.equals(str2));						//대소문자 구분.
		System.out.println(str1.equalsIgnoreCase(str2));		//대소문자 구분 없이.

//=====================hashCode()	- 객체 해시코드란 객체를 식별할 하나의 정수값을 말함.
//														- hashCode() 메소드는 객체의 메모리 번지를 이용해서 해시코드를 만들어 
//														- 리턴하기 때문에 객체마다 다른 값을 가지고 있음.		
		
		System.out.println(str1.hashCode());
		System.out.println(str2.hashCode());		
		
//======================toString()  -  객체의 문자 정보를 리턴. 객체의 문자 정보란 객체를 문자열로 표현한 값.
//													      클래스명@16진수 해시코드로 구성된 문자 정보 리턴.
//														  별 값어치가 없는 정보이므로 오버라이딩 하여 리턴하여 사용.
		Object_Class o = new Object_Class();
		System.out.println(o.toString());			//오버라이딩 하여 사용.
		str1.toString();
		
//======================StringBuffer() - 
		
	}
	
	public String toString(){			// 오버라이드 하여 사용.
		return "hi";
		
	}
}

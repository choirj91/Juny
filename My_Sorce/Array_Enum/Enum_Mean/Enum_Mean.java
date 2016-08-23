package Enum_Mean;							//한정된 값만을 갖는 데이터 타입을 열거 타입(enumeration type)이라고 함.

import java.util.Calendar;

public class Enum_Mean {
	public static void main(String[] args) {
		Calendar now = Calendar.getInstance();		//시간과 날짜를 얻는 메소드.
		Enum_Ex today = Enum_Ex.THURSDAY;		//THURSDAY 는 열거 객체.	열거 객체는 열거 상수의 문자열을 내부 데이터로 가짐.
		Enum_Ex today1 = Enum_Ex.FRIDAY;			//java.lang.Enum 클래스에 선언된 메소드들을 열거 객체에서 사용 가능.
		System.out.println(today == Enum_Ex.THURSDAY);	//서로 같은 Enum_Ex 객체를 참조.
		
		int year = now.get(Calendar.YEAR);				//Calendar 메소드에 년도를 리턴받음.
		int year1 = now.getWeekYear();					//Calendar 메소드에 년도를 리턴받음.
		System.out.println(year +" " + year1);
		
		String to = today.name(); 							// name()은 열거 객체가 가지고 있는 문자열을 리턴. 
		String too = today1.name();
		int to1 = today.ordinal();							// ordinal()은 전체 열거 객체 중 몇 번째 열거 객체인지 알려줌.
		int compare = today.compareTo(today1); 		//전후로 볓 번 째 위치하는 지 비교. today1의 기준으로 위치 리턴.
		Enum_Ex today2 = Enum_Ex.valueOf("FRIDAY");//열거 객체를 참조.
		Enum_Ex[] today3 = Enum_Ex.values();			//배열로 만들어 리턴
		System.out.println("ordinal 기능 = " + to1 + "compare = " + compare + " valueOf 기능 = " + today2 );
		for (Enum_Ex d : today3) {
			System.out.println(d);
		}
		
		
		
		
		
	}
}

package ReferenceType;

public class Reference_Oper {					//primitive 변수의 ==, != 는 변수의 값이 같은지 아닌지
	public static void main(String[] args) {	// reference 변수의 ==, != 는 동일한 주소 값을 갖고 있는지(동일한 객체를 참조하는지)
		String x = null;						// reference 변수의 힙 영역의 객체를 참조하지 않는 다는 뜻으로 null 값을 가질 수 있음.
												//  null로 초기화된 참조 변수는 스택 영역에 생성됨.
		int[] arr = null;
		//arr[0] = 10;							//배열이 참조하는 객체가 없기 때문에 NullPointerException 발생.
		
		String name1 = "최낙준";
		String name2 = "최낙준";					//문자열 리터럴이 동일하다면 String 객체를 공유하도록 되어 있음.
		String name3 = new String("최낙준");		//new는 힙 영역에 새로운 객체를 만들 때 사용.[객체 생성 연산자]
		System.out.println(name2 == name3);		//새로운 객체를 생성했기 때문에, 참조하는 주소가 달라, 결과는 false가 나옴.
		System.out.println(name3.equals(name2));//equals()메소드는 문자열이 동일한지 비교. 따라서 결과는 true
		
		String su = "최낙준";
		su = null;								//su는 참조하는 객체가 사라지고, "최낙준"은 쓰레기 객체로 취급하여 메모리에서 자동 제거.
	}
}

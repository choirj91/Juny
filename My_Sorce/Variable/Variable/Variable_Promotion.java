package Variable;

public class Variable_Promotion {						//변환(Promotion)
	public static void main(String[] args) {           // 자동(묵시적) 타입 변환, 강제(명시적) 타입 변환.

								//	byte(1) < short(2) < int(4) < long(8) < float(4) < double(8)
								//  float이 int, long 보다 표현 할 수 있는 값의 범위가 더 크기 때문.
		
		int x = 4;
		float y ;
		y = x;  				// 자동 타입 변환, 묵시적 타입 변환
		x = (int)y;       		// int가 float 보다 작기 때문에 (int)로 형변환을 시켜줘야 함. - 강제 타입 변환, 명시적 타입 변환
								//(캐스팅 : Casting) 연산자 ()를 사용.
		
		byte b = 60;
		char ch = (char)b;      // char은 음수가 없기 때문에, byte 가 작아도 형변환이 자동으로 되지 않는다.
		
		int ex = 1028323;		// 큰 데이터 타입을 작은 데이터 타입으로 쪼개어서 저장.
		byte ex1 = (byte)ex;
		System.out.println(ex1); // 범위 외의 수만큼 회전하여 출력.
		
		int num1;					// num2 = num1 을 할 경우 데이터 손실이 일어남. float 이 int보다 표현이 더 크지만,
		float num2;                 // float 은 부호(1비트) + 지수(8비트) + 가수(23비트) 로 이루져있기 때문에,
									// 32비트인 int의 값을 23비트로 표현할 수 없기 때문에 손실이 발생. 따라서 Double을 사용해야함.
		
	 int test = 10;  double test1 = 3.23;
	 double result;
	 result = test1 + test; 		// 연산의 경우 자동으로 큰 타입으로 변환.
	 System.out.println(result);
		
	 String a = "100"; String numt = "200";    // 문자형을 숫자로
	 int pro = Integer.parseInt(a); int pro1 = Integer.parseInt(numt);  //숫자로 형변환
	 System.out.println(pro*pro1);            	   // 결과 100*200=200000
	}
}

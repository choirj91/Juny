package Variable;

public class Variable_Type {
	public static void main(String[] args) {

												// 1byte = 8bit
												// 1KByte = 1024Byte
												// 1MByte = 1024KByte
												// 1GByte = 1024MByte
												// 1TByte = 1024GByte
		
												
		
//================================ 정수
		byte x=125;								// 1byte  -128~127 (-2^7 ~ 2^7-1)
			for (int i = 0; i < 5; i++) {			// byte x값이 127을 넘어가면 -로 바뀐다.(원으로)
			System.out.println(x); x+=2;}
		char x1;								// 2byte  0~65535 (0 ~ 2^16-1) (단일문자 - 유니코드:\u0000~\uffff)
			char ch = 'A';						// char 단일 문자.
			System.out.println("A의 유니코드값 " + (int)ch); // 형변환으로 유니코드 값을 알 수 있음.
		short x2;								// 2byte -32.768~32.767 (-2^15 ~ 2^15-1)
		int x3 ; 								// 4byte -2,147,483,648 ~ 2,147,483,647 (-2^31 ~ 2^31-1)
												// int는 자바에서의 기본 타입.
		long x4 ; 								// 8byte -2^63 ~ 2^63-1
		long x5 = 1000000000000L;				// int값이 넘어가는 숫자를 입력 할때는 L을 꼭 붙여줘야 함. (자바의 기본타입이 int)
									
												// -2^n-1 ~ (2^n-1)-1  => 여기서 n은 비트
		
//================================ 실수
		float x6;								// 4byte => int 와 크기는 같지만, 정수 타입과는 다른 저장 방식 때문에
												// 정수 타입보다 훨씬 더 큰 범위의 값을 저장할 수 있음. (부동 소수점 방식)
												// + m * 10^n  [+ = 부호 , m = 가수, n = 지수]
		float te = 5.6f;						// 기본 타입이 double 이기 때문에 뒤에 f를 붙여 줘야함.
												// 소수점 9자리까지 정밀하게
		
		double x7;								// 8byte  자바의 기본 타입.
												// 소수점 15자리까지 정밀하게
		
//================================ 논리		
		boolean x8;								// 1byte true , false 주로 조건문과 제어문의 실행 흐름을 변경하는데 주로 사용

//================================ 문자열
		String name = "";						// 클래스 타입, 참조 변수 String 은 변수에 대입하면 문자열이 변수에 직접
		String name1 = null;					// 저장되는 것이 아니라, String 객체가 생성되고, String 변수는 
												// String 객체의 번지를 참조하게 된다.

		
		int var1 = 3000000;						// 3000000
		double var2 = 3e6;						// 3000000
		float var3 = 3e6f;						// 3000000
		double var4 = 2e-3;						// 0.002
		 
				
	}
}

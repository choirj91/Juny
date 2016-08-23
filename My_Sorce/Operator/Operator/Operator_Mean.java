package Operator;

public class Operator_Mean {						//데이터를 처리하여 결과를 산출하는 것을 연산(operations)
	public static void main(String[] args) {		//연산에 사용되는 표시나 기호를 연산자(operator), 
													//연산되는 데이터는 피연산자(operand), 연산의 과정을 기술한 것을 연산식(expressions)
		
		
		int x = 5 , t = 7;
		x %= 2;							// x = x%2 와 같은 값. x += 3;< x=x+3;
		System.out.println((x>t)?5:2);	// x>t 가 찹이면 5, false 면 2 출력//////////////////////////
		x=7;
		x = x>>1; System.out.println(x);//비트 연산자,	오른쪽으로 1칸 이동
		x = x<<1; System.out.println(x);//비트 연산자, 왼쪽으로 1칸, 끝쪽은 0
		
		int y= 0; x = 0;
		y = x++; System.out.println(y);	//후위 연산자, y = 0 
		y = ++x; System.out.println(y); //전위 연산자, y = 1
		
		y =+3;	System.out.println(y);	//+3을 y에 대입.
		
		y +=3;	System.out.println(y);	//y에 3을 +;
		
		
		++x; x = x+1;  // ++i 가 i+1 보다 속도가 빠르다고 알고 있지만, 사실은 동일함.		
		
		boolean ye = true;
		ye = !ye; System.out.println(ye);	// 논리 부정 연산자인 !는 조건식의 값을 부정으로 만들어줌.
		ye = !ye; System.out.println(ye);	// 토글(toggle) 기능 구현에 사용.
		
		byte i = 20;			//비트 반전 연산자는 정수 타입(byte, short, int, long)에만 사용됨. 2진수 비트값을 반전 시킴.
		int i2= ~i; System.out.println(i2);	//결과는  int 형이기 때문에, 
		
		String sc = Integer.toBinaryString(i2); //Integer.toBinaryString<= 2진 문자열로 출력. 
		System.out.println(sc);
		
		int num1 = 10, num2 = 4;
		double result = num1 / (double)num2;  		// 둘중 하나의 수가 double 형이어야, 소수점까지 결과값 산출
		System.out.println(result);
		
		byte bt1 = 1, bt2 = 2;
		int bt3 = bt1 + bt2;				//기본적으로 결과는  int 형이기때문에 byte bt3 일 경우 에러.
		
		int u1 = 1000000 ,u2 = 1000000;
		long u3 = (long)u1*u2;	System.out.println(u3);	//u2*u1 값을 그대로  계산하면 기본적으로 int 값으로 오버플로우 발생.
		
		//System.out.println(5/0);     //0을 나눌수 없기 때문에 에러.
		System.out.println(5/0.0);  // 결과는 Infinity(무한대)가 나옴.
		System.out.println(5%0.0); // 결과는 NaN(Not a number) 이 나옴.
		
		String st1 = "JDK" + 3 + 3.0, st2 = 3 + 3.0 + "JDK"; //33.0의 결과
		System.out.println(st1 + "\n" + st2);	//6.0의 결과.
		
		
	}

}

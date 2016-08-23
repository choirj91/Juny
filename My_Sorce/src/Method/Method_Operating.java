package Method;

import java.util.Scanner;
/*패키지 새로 만들어서 사칙연산 함수(x,-,*,/) 만들기
+,/ 는 리턴타입 없이 생성
*,- 는 리턴타입 있는 함수 생성
메인에서 값을 입력 받아서 함수 호출*/

public class Method_Operating {
	public static void main(String[] args) {
		try {
			Scanner sc = new Scanner(System.in);
			System.out.println("x값을 입력하세요");
			int x = sc.nextInt();
			System.out.println("y값을 입력하세요");
			int y = sc.nextInt();

			plus(x, y);
			div(x, y);
			// 1. 이쁘게 담아서 찍는법
			int num = mul(x, y);
			System.out.println("mul : " + num);
			// 2. 그냥 찍는 법
			System.out.println("sub : " + sub(x, y));

		} catch (Exception e) {
			// TODO: handle exception
		} // try end

	}

	public static int sub(int x, int y) {
		// TODO Auto-generated method stub
		if (x > y) {
			return x - y;

		} else
			return y - x;
	}

	public static int mul(int x, int y) {
		// TODO Auto-generated method stub

		return x * y;
	}

	public static void div(int x, int y) {
		// TODO Auto-generated method stub
		if (y != 0)
			System.out.println("div = " + (x / y));
		else {
			System.out.println("0으로 나눌 수 없습니다.");
			System.exit(0);
		}
	}

	public static void plus(int x, int y) {
		// TODO Auto-generated method stub
		System.out.println("plus : " + (x + y));

	}
}

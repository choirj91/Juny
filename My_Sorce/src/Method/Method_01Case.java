package Method;

import java.util.Scanner;
																	//1. 매개변수(parameter) 없고, 리턴타입 없는 경우
public class Method_01Case {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("x = ");
		int x = sc.nextInt();

		System.out.println("y = ");
		int y = sc.nextInt();

		plus(); // 함수호출

		System.out.println("main method" + x + "," + y);
		System.out.println("main end");

	} // main

	
	public static void plus() { // 리턴타입 없다는 것은 void 를 가지고 있다            //함수정의
		int hap = 10 + 30;
		System.out.println("plus method,  hap = " + hap);

	}

}

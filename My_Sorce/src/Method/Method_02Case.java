package Method;

import java.util.Scanner;
															//2. 리턴타입이 없고 매개 변수가 있는 경우
public class Method_02Case {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("이름을 입력해 주세요."); String x = sc.next();
		System.out.println("나이를 입력해 주세요."); int y = sc.nextInt();
		System.out.println("폰번호를 입력해 주세요."); int z = sc.nextInt();
		
		System.out.println("main Strart");
		
		display(x, y, z);
		
		System.out.println("main End");
		
	}

	
	
	public static void display(String name, int x, int y){    // 매개변수 계속 나열 가능
		System.out.println(name + "이군요");
		System.out.println(x + "입니다.");
		System.out.println(y + "입니다.");
		
	}
}

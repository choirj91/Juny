package Random;

import java.util.Scanner;

public class Random_Game {
public static void main(String[] args) {
	
	Scanner sc = new Scanner(System.in);
	int answer = (int)(Math.random()*99+1);
	int user;
	
	System.out.println("======UP , Down 게임========");
	System.out.println("기본 룰 = 1~100까지 입력 할 수 있어요. ");
	System.out.println("기회는 총 5번 드리겠습니다. ");
	try {
		for (int i = 0; i <5; i++) {
			System.out.println("아무 숫자나 입력 하시오. 기회는 " + (5-i) + "번 남았습니다.");	user = sc.nextInt();
			if (user > answer) {
				System.out.println("높은 값을 입력 하셨습니당.");
				
			}else if (user < answer) {
				System.out.println("낮은 값을 입력 하셨습니당");
				
			} else if (user == answer) {
				System.out.println("헐... 맞췄네요... 숫자는 " + answer + " 이었습니다...");
				System.exit(0);
			}
			if (i == 4) {
				System.out.println("당신은 졌어요.");
				System.out.println("숫자는 " + answer + " 이었어요. 메롱. ");
				System.exit(0);
				
			}
			
		}
		
	} catch (Exception e) {
		e.printStackTrace();
		// TODO: handle exception
	} 
	finally {
		System.out.println("숫자만 앵간하면 입력하시길.");
		
	}
	
}
}

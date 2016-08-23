package Do_While_Statement;

import java.util.Scanner;

public class DoWhile_Mean {
	public static void main(String[] args) {
		String x = null ; int y = 0;
		do {											//처음 시작시 무조건 실행.
			y++;
			System.out.println(y);
			System.out.println("종료 하실 경우 q입력"); 
			x = new Scanner(System.in).next();
			
		} while ( ! x.equals("q"));						//실행 이후 조건 검사.
	}
}

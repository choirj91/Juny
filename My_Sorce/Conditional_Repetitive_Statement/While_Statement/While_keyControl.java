package While_Statement;

import java.io.IOException;

public class While_keyControl {							//조건식이 true 일 경우 계속 반복.false일 경우 종료.
	public static void main(String[] args) {
		boolean run = true;
		int speed = 0;
		int keyCode = 0;
		
		while(run) {
			if (keyCode != 13 && keyCode != 10 ) {
				System.out.println("============");
				System.out.println("1. 증속 | 2. 감속 | 3. 중지");
				System.out.println("-----------------");
				System.out.println("선택 :");
			}
			try {
				keyCode = System.in.read();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			if (keyCode == 49) {
				speed++;
			}else if (keyCode == 50) {
				speed--;
				System.out.println("현재속도 = " + speed);
			}else if (keyCode == 51) {
				run = false;
			}
		}
		System.out.println("프로그램 종료");
	}
}

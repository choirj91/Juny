package While_Statement;

import java.io.IOException;

public class While_Mean {							//조건식이 true 일 경우 계속 반복.false일 경우 종료.
	public static void main(String[] args) {
		boolean x = true;
		int y = 0;
		while (x) {									//조건식이 true 일 경우만 반복.
			y++;
			System.out.println(y);
			if (y==10) {
				break;								//조건식이 false 일 경우 이외에 break 를 통하여 종료 가능.
			}
			
		}
	}
}

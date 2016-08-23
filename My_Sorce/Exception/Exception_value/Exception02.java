package Exception_value;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exception02 {							//두번째 위임 방식. (자바 버츄얼 머신에게 위임)
	public static void main(String[] args) throws Exception{			//시작 블록 전에 예외 던지기.
		
			System.out.println("x = ");
			int x = new Scanner(System.in).nextInt();
			System.out.println("y = ");
			int y = new Scanner(System.in).nextInt();
		
		System.out.println("\n\n" + x + " , " + y);
		
	}

}

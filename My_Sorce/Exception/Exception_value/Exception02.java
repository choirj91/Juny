package Exception_value;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exception02 {							//�ι�° ���� ���. (�ڹ� ����� �ӽſ��� ����)
	public static void main(String[] args) throws Exception{			//���� ��� ���� ���� ������.
		
			System.out.println("x = ");
			int x = new Scanner(System.in).nextInt();
			System.out.println("y = ");
			int y = new Scanner(System.in).nextInt();
		
		System.out.println("\n\n" + x + " , " + y);
		
	}

}

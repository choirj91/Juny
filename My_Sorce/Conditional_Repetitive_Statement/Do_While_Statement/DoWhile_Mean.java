package Do_While_Statement;

import java.util.Scanner;

public class DoWhile_Mean {
	public static void main(String[] args) {
		String x = null ; int y = 0;
		do {											//ó�� ���۽� ������ ����.
			y++;
			System.out.println(y);
			System.out.println("���� �Ͻ� ��� q�Է�"); 
			x = new Scanner(System.in).next();
			
		} while ( ! x.equals("q"));						//���� ���� ���� �˻�.
	}
}

package Java_Impormation;

import java.util.Scanner;													// <=== �ڹٴ� �⺻������ lang�� import ���ְ� �������� �̷������� �߰�

public class Impormation {												// <== class�� final �� ������ ��ӱ���(���� ����) [system. ��� final �� ��������.
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);					// <=== �޸��� Heap ������ ����(�ڵ�������)
																		
		
		int su ; 
		String msg = sc.next();										// <=== Buffer �� �޸𸮸� ���а� �ٷ� ���
		String msg1 = sc.nextLine();								// <=== Buffer �� �޸𸮸� ����ؼ� ���ڸ� ������� ����(���ڸ��� �Է¹����� ���)
		
		Point pt = new Point();										// <== pt�� �޸� ������ stack ������ �ö�����, �ٸ� ������������ �ǵ����Ͱ����� �޸�
																		//     ���۷���(�ּ�)�� �ö�.
		Point ex; 														//     ���� Heap������ �ö� 700������ �ּҰ� stack�� �ö�.
		ex = new Point();                             				  // <== �̷��Ե� ��������. 
		pt.x = 10;
		pt.y = 10;														//<== �̷��� �ٸ� Ŭ���� ������ ���� ����.
		
																		//���콺 ������ > properties �� ���� ������ �������� ��밡��.
	}
	
}

class Point{
	int x, y;														//��ü�� ������ 4����Ʈ ���ؿ�����; �׷��� �ּҰ��� ��.
}

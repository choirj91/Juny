package Method;

import java.util.Scanner;
															//2. ����Ÿ���� ���� �Ű� ������ �ִ� ���
public class Method_02Case {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("�̸��� �Է��� �ּ���."); String x = sc.next();
		System.out.println("���̸� �Է��� �ּ���."); int y = sc.nextInt();
		System.out.println("����ȣ�� �Է��� �ּ���."); int z = sc.nextInt();
		
		System.out.println("main Strart");
		
		display(x, y, z);
		
		System.out.println("main End");
		
	}

	
	
	public static void display(String name, int x, int y){    // �Ű����� ��� ���� ����
		System.out.println(name + "�̱���");
		System.out.println(x + "�Դϴ�.");
		System.out.println(y + "�Դϴ�.");
		
	}
}

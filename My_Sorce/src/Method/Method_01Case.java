package Method;

import java.util.Scanner;
																	//1. �Ű�����(parameter) ����, ����Ÿ�� ���� ���
public class Method_01Case {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("x = ");
		int x = sc.nextInt();

		System.out.println("y = ");
		int y = sc.nextInt();

		plus(); // �Լ�ȣ��

		System.out.println("main method" + x + "," + y);
		System.out.println("main end");

	} // main

	
	public static void plus() { // ����Ÿ�� ���ٴ� ���� void �� ������ �ִ�            //�Լ�����
		int hap = 10 + 30;
		System.out.println("plus method,  hap = " + hap);

	}

}

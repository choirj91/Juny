package Method;

import java.util.Scanner;
/*��Ű�� ���� ���� ��Ģ���� �Լ�(x,-,*,/) �����
+,/ �� ����Ÿ�� ���� ����
*,- �� ����Ÿ�� �ִ� �Լ� ����
���ο��� ���� �Է� �޾Ƽ� �Լ� ȣ��*/

public class Method_Operating {
	public static void main(String[] args) {
		try {
			Scanner sc = new Scanner(System.in);
			System.out.println("x���� �Է��ϼ���");
			int x = sc.nextInt();
			System.out.println("y���� �Է��ϼ���");
			int y = sc.nextInt();

			plus(x, y);
			div(x, y);
			// 1. �̻ڰ� ��Ƽ� ��¹�
			int num = mul(x, y);
			System.out.println("mul : " + num);
			// 2. �׳� ��� ��
			System.out.println("sub : " + sub(x, y));

		} catch (Exception e) {
			// TODO: handle exception
		} // try end

	}

	public static int sub(int x, int y) {
		// TODO Auto-generated method stub
		if (x > y) {
			return x - y;

		} else
			return y - x;
	}

	public static int mul(int x, int y) {
		// TODO Auto-generated method stub

		return x * y;
	}

	public static void div(int x, int y) {
		// TODO Auto-generated method stub
		if (y != 0)
			System.out.println("div = " + (x / y));
		else {
			System.out.println("0���� ���� �� �����ϴ�.");
			System.exit(0);
		}
	}

	public static void plus(int x, int y) {
		// TODO Auto-generated method stub
		System.out.println("plus : " + (x + y));

	}
}

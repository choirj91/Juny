package Operator;

public class Operator_Mean {						//�����͸� ó���Ͽ� ����� �����ϴ� ���� ����(operations)
	public static void main(String[] args) {		//���꿡 ���Ǵ� ǥ�ó� ��ȣ�� ������(operator), 
													//����Ǵ� �����ʹ� �ǿ�����(operand), ������ ������ ����� ���� �����(expressions)
		
		
		int x = 5 , t = 7;
		x %= 2;							// x = x%2 �� ���� ��. x += 3;< x=x+3;
		System.out.println((x>t)?5:2);	// x>t �� ���̸� 5, false �� 2 ���//////////////////////////
		x=7;
		x = x>>1; System.out.println(x);//��Ʈ ������,	���������� 1ĭ �̵�
		x = x<<1; System.out.println(x);//��Ʈ ������, �������� 1ĭ, ������ 0
		
		int y= 0; x = 0;
		y = x++; System.out.println(y);	//���� ������, y = 0 
		y = ++x; System.out.println(y); //���� ������, y = 1
		
		y =+3;	System.out.println(y);	//+3�� y�� ����.
		
		y +=3;	System.out.println(y);	//y�� 3�� +;
		
		
		++x; x = x+1;  // ++i �� i+1 ���� �ӵ��� �����ٰ� �˰� ������, ����� ������.		
		
		boolean ye = true;
		ye = !ye; System.out.println(ye);	// �� ���� �������� !�� ���ǽ��� ���� �������� �������.
		ye = !ye; System.out.println(ye);	// ���(toggle) ��� ������ ���.
		
		byte i = 20;			//��Ʈ ���� �����ڴ� ���� Ÿ��(byte, short, int, long)���� ����. 2���� ��Ʈ���� ���� ��Ŵ.
		int i2= ~i; System.out.println(i2);	//�����  int ���̱� ������, 
		
		String sc = Integer.toBinaryString(i2); //Integer.toBinaryString<= 2�� ���ڿ��� ���. 
		System.out.println(sc);
		
		int num1 = 10, num2 = 4;
		double result = num1 / (double)num2;  		// ���� �ϳ��� ���� double ���̾��, �Ҽ������� ����� ����
		System.out.println(result);
		
		byte bt1 = 1, bt2 = 2;
		int bt3 = bt1 + bt2;				//�⺻������ �����  int ���̱⶧���� byte bt3 �� ��� ����.
		
		int u1 = 1000000 ,u2 = 1000000;
		long u3 = (long)u1*u2;	System.out.println(u3);	//u2*u1 ���� �״��  ����ϸ� �⺻������ int ������ �����÷ο� �߻�.
		
		//System.out.println(5/0);     //0�� ������ ���� ������ ����.
		System.out.println(5/0.0);  // ����� Infinity(���Ѵ�)�� ����.
		System.out.println(5%0.0); // ����� NaN(Not a number) �� ����.
		
		String st1 = "JDK" + 3 + 3.0, st2 = 3 + 3.0 + "JDK"; //33.0�� ���
		System.out.println(st1 + "\n" + st2);	//6.0�� ���.
		
		
	}

}

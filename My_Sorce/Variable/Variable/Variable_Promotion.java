package Variable;

public class Variable_Promotion {						//��ȯ(Promotion)
	public static void main(String[] args) {           // �ڵ�(������) Ÿ�� ��ȯ, ����(�����) Ÿ�� ��ȯ.

								//	byte(1) < short(2) < int(4) < long(8) < float(4) < double(8)
								//  float�� int, long ���� ǥ�� �� �� �ִ� ���� ������ �� ũ�� ����.
		
		int x = 4;
		float y ;
		y = x;  				// �ڵ� Ÿ�� ��ȯ, ������ Ÿ�� ��ȯ
		x = (int)y;       		// int�� float ���� �۱� ������ (int)�� ����ȯ�� ������� ��. - ���� Ÿ�� ��ȯ, ����� Ÿ�� ��ȯ
								//(ĳ���� : Casting) ������ ()�� ���.
		
		byte b = 60;
		char ch = (char)b;      // char�� ������ ���� ������, byte �� �۾Ƶ� ����ȯ�� �ڵ����� ���� �ʴ´�.
		
		int ex = 1028323;		// ū ������ Ÿ���� ���� ������ Ÿ������ �ɰ�� ����.
		byte ex1 = (byte)ex;
		System.out.println(ex1); // ���� ���� ����ŭ ȸ���Ͽ� ���.
		
		int num1;					// num2 = num1 �� �� ��� ������ �ս��� �Ͼ. float �� int���� ǥ���� �� ũ����,
		float num2;                 // float �� ��ȣ(1��Ʈ) + ����(8��Ʈ) + ����(23��Ʈ) �� �̷����ֱ� ������,
									// 32��Ʈ�� int�� ���� 23��Ʈ�� ǥ���� �� ���� ������ �ս��� �߻�. ���� Double�� ����ؾ���.
		
	 int test = 10;  double test1 = 3.23;
	 double result;
	 result = test1 + test; 		// ������ ��� �ڵ����� ū Ÿ������ ��ȯ.
	 System.out.println(result);
		
	 String a = "100"; String numt = "200";    // �������� ���ڷ�
	 int pro = Integer.parseInt(a); int pro1 = Integer.parseInt(numt);  //���ڷ� ����ȯ
	 System.out.println(pro*pro1);            	   // ��� 100*200=200000
	}
}

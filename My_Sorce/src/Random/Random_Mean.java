package Random;

import java.util.Random;

public class Random_Mean {                           // Random�� java.lang.Math.random(); 
	public static void main(String[] args) {
		System.out.println(Math.random());				// 0.0 ~ 1.0 ������ �������� ����.
		System.out.println(Math.random() * 5);          // 0 ~ n-1 , 0~4 ���̰� ��µ�
		System.out.println((int)(Math.random()*10));      // int�� ����ȯ�ؾ� ���� ���.
		
		int[] num = new int[5];
		
		for (int i = 0; i < 5; i++) {
			num[i] = (int)(Math.random()*5+1);	
		}
		for (int i =0; i < num.length; i++) {
			System.out.print(num[i] + " ");
		}
		System.out.println();
//=================================================== Random Method�� �̿��� ���.
		
		Random r = new Random();                                         // <=== import �Ǿ�� ��.
		int iNum = r.nextInt();												  // ���� �����.
		System.out.println("iNum == " +  iNum);						
		for (int i = 1; i < 6; i++) {
			System.out.print(r.nextInt(5) + "  "  );                    // 0~ n-1 , 32bit �� �ش��ϴ� ���� �߻�.      
			
		}
	}
}

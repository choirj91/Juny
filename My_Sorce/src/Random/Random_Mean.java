package Random;

import java.util.Random;

public class Random_Mean {                           // Random은 java.lang.Math.random(); 
	public static void main(String[] args) {
		System.out.println(Math.random());				// 0.0 ~ 1.0 사이의 임의적인 숫자.
		System.out.println(Math.random() * 5);          // 0 ~ n-1 , 0~4 사이값 출력됨
		System.out.println((int)(Math.random()*10));      // int로 형변환해야 정수 출력.
		
		int[] num = new int[5];
		
		for (int i = 0; i < 5; i++) {
			num[i] = (int)(Math.random()*5+1);	
		}
		for (int i =0; i < num.length; i++) {
			System.out.print(num[i] + " ");
		}
		System.out.println();
//=================================================== Random Method를 이용한 방법.
		
		Random r = new Random();                                         // <=== import 되어야 함.
		int iNum = r.nextInt();												  // 난수 추출됨.
		System.out.println("iNum == " +  iNum);						
		for (int i = 1; i < 6; i++) {
			System.out.print(r.nextInt(5) + "  "  );                    // 0~ n-1 , 32bit 에 해당하는 난수 발생.      
			
		}
	}
}

package For_Statement;

public class For_Mean {							//반복문으로써, for문과 while문은 서로 변환이 가능.
	public static void main(String[] args) {		//for문은 반복 횟수를 알고 있을때, 
														//while은 조건에 따라 반복할때 사용.
		int sum = 0;
		for (int i = 1; i <= 100; i++) {			//1~100까지 수의 합. i 조건이 false 면 조건문 실행하지 않고 끝냄.
			sum = sum + i;							//for문 안에서 i를 선언해주었다면 밖에서는 사용 불가능.
		}
		System.out.println(sum);				
		int i =1;
		for (;  i<100; i++) {								// 생략가능. -> 초기화 식이 필요 없을 경우
			System.out.println(i);}							// 증감식이 생략 가능하지만, 무한으로 찍어냄;
		for (int j = 0, k =0; j <5 && k<5; j++,k++) { 		//식이 둘이상 사용 가눙.
		}													//for문에서 선언한 변수는 밖에서 사용 불가능.
		
		for (float j = 0.1f; j <= 1.0f; j+=0.1f) {		//부동소수점 타입은 왠만해서 사용 금지.
			System.out.println(j);						//float은 정확하게 표현이 불가능 하여 루프를 한번 적게 돔.
		}
													
		for (int j = 0; j < 5; j++) {
			for (int j2 = 0; j2 < 5; j2++) {			//2중 for 사용 가능. 그 이상도 사용 가능.
				System.out.print(j + j2);
			}
		}
	}
}

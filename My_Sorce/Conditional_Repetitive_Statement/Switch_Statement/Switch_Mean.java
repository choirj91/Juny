package Switch_Statement;

public class Switch_Mean {						//if와 같은 조건문 이지만 참,거짓이 아닌 특정 변수의 값으로
	public static void main(String[] args) {		//실행문이 결정됨. 따라서 코드가 간결해짐.
		int num =5;
		switch (num) {									//자료형에 따라 정수값 및 String타입이 사용 가능.
		case 1: 	break;									//따라서 float 및 double 타입 사용 불가능.
		case 5: System.out.println("5"); 	break;		//만약 break가 없다면 아래 조건이 모두 실행;
		case 3: 	break;

		default: System.out.println("제외");	break;		//위에 만족하는 조건이 없을 경우 default로 넘어옴.
		}														//defalut는 생략 가능.
		
		
		
		
		
		
		
		
		
		
	}
}

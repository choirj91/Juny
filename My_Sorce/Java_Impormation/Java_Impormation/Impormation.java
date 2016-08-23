package Java_Impormation;

import java.util.Scanner;													// <=== 자바는 기본적으로 lang을 import 해주고 나머지는 이런식으로 추가

public class Impormation {												// <== class에 final 이 붙으면 상속금지(변형 금지) [system. 경우 final 이 숨어있음.
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);					// <=== 메모리의 Heap 영역에 저장(자동해제됨)
																		
		
		int su ; 
		String msg = sc.next();										// <=== Buffer 의 메모리를 안읽고 바로 출력
		String msg1 = sc.nextLine();								// <=== Buffer 의 메모리를 출력해서 문자를 출력하지 않음(문자먼저 입력받으면 출력)
		
		Point pt = new Point();										// <== pt가 메모리 영역에 stack 영역에 올라가지만, 다른 변수데이터의 실데이터값과는 달리
																		//     레퍼런스(주소)가 올라감.
		Point ex; 														//     예로 Heap영역에 올라간 700번지의 주소가 stack에 올라감.
		ex = new Point();                             				  // <== 이렇게도 생성가능. 
		pt.x = 10;
		pt.y = 10;														//<== 이렇게 다른 클래스 변수값 지정 가능.
		
																		//마우스 오른쪽 > properties 를 통해 컴파일 하위버젼 사용가능.
	}
	
}

class Point{
	int x, y;														//객체는 무조건 4바이트 스텍영역에; 그러나 주소값이 들어감.
}

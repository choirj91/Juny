package OOP;

																					//생성자 함수는 클래스명과 동일하다. 자바에서 소멸자 함수는 신경X(알아서 해줌)
																					//리턴타입 없음(void 도 사용하면 안됨)
																					//overload (중복 정의)가 가능하다.
																					//default constructor 가 있다.
																					//생성자 함수가 하는 역할 - 멤버변수의 떠도는 값이 안나오도록 초기화를 담당.
																					//사용자가 재정의를 내린 생성자함수가 존자한다면, default 생성자의 기능을 상실.
class Point {
	
	int x , y;
	
	/*public Point(){                                //생성자 함수 생성. 리턴타입 X , void 사용금지.											 //매개변수가 없는 생성자 함수를 default 생성자 라고 함.
		x = y = 100;								// 값 초기화.
	}*/												// 재정의가 되었기 때문에 default 생성자를 별도로 생성.
	
	public Point(int xx){                        // 매개변수 1개 있는 생성자 함수. (중복함수 가능) overload                       
		x = xx; y = 999;
	}
}
public class Constructor_Mean {	
	public static void main(String[] args) {
		//Point p = new Point();                // 사용자가 재정의 내렸기 때문에 default 생성자의 기능을 상실하여 에러.
		Point po = new Point(55); 			//객체 생성, 생성자함수 호출, 메모리 할당
	}
}
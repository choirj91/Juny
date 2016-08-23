package Class;


public class Final_mean {	//최종적이라는 의미.  수정이 불가능.
	final int x = 9;		//처음 초기값으로 주거나, 생성자에서 줄 수 있음.
	final int y;
	static final double pi = 3.14;	//static final을 상수라고 함. 불변의 값을 뜻함.static final은
									//객체마다 저장되지 않고 클래스에만 포함됨.
	static{							//복잡한 초기화일 경우 정적 블록에서 가능.	
	double PI = 3.14;}			//상수는 모두 대분자를 사용하는 것이 관례
	public Final_mean(){
		y = 9;
	}

}

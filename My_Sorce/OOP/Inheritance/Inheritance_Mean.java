package Inheritance;

class Mom {							//상속이란, 부모가 자식에게 물려주는 행위. 부모 클래스를 상위, 자식 클래스를 하위,파생 클래스.
										// 코드의 중복을 줄이고, 개발시간을 축소, 수정을 최소화(부모를 수정하면 자손도 같이 수정되는 원리)
										//부모에서의 private 필드, 메소드는 상속받지 못함. 페이지가 다르면 default 도 상속 X
	String ex;
	public Mom(){System.out.println("부모의 생성자");	}	//생성자
	public Mom(int x){}				//매개값 1개를 가진 생성자,.
}

class Son extends Mom{			//son 은 Inheritance_Mean의 자식.
										//자바에서는 단일 상속만 가능.
	
	public Son(){}
	public Son(String x){			//매개변수 1개를 가지는 생성자.
		super(6);						// 부모의 생성자. (일치하는 매개값 매칭) 
		super.ex = null;				// <= 부모의 객체를 사용할 수 있음.
		this.ex = x;					//부모클래스의 ex를 사용.
	}
	double circle(double r){		//원의 넓이를 구하는 메소드.
		return r*r*3.14;
	}
}

class Override extends Son{		//상속된 일부 메소드는 자식 클래스에서 다시 수정해서 사용.
										//부모의 메소드와 동일한 시그너처(리턴 타입, 메소드이름, 매개변수)
										//가 일치하여야 한다. 더 강하게 오버라이딩 할 수 없다. ex)public에서 default로 불가능.
										//하지만 부모가 default면 자식이 public 이나 default로 가능.

	public Override(String x){		//컨트롤+알트+s 의 오버라이드 기능을 통하여 자동 생성가능.
		//super(x);
		}
//@Override                       // 컴파일러가 자동으로 에러가 있는지 검사해주는 토큰.(같은이름으로 클래스라 사용X인겉 같은 느낌)
 	double circle(double r){		//주석을 하고 circle 을 호출하면 부모의 리턴값이 출력하지만,
 		super.circle(r);				//부득이하게 부모의 값이 필요하다면 super. 을 사용하여 override전 값을 사용.
		return r*r*Math.PI;			//override를 통해 재정의 한 circle을 호출하면 자식의 리턴값이 출력.
	}
}

final class Sson{				//클래스, 필드, 메소드 선언 시에 사용 할 수 있음.
									//선언이 최종 상태, 절대 수정될 수 없음을 뜻.
final int x = 0;					//수정 불가능.
}
// 접근 제한자 public = 클래스,필드,생성자,메소드 적용가능 , 모든 클래스 접근 가능
// 접근 제한자 protected = 필드, 생성자, 메소드 적용가능, 상속된 클래스   super 로만 접근이 가능.(new로 불가능)
// 접근 제한자 default = 클래스, 필드, 생성자, 메소드 적용가능, 같은 페이지 내의 클래스만
// 접근 제한자 private = 필드, 생성자, 메소드 적용가능. 모든 외부 클래스 접근 불가능.

public class Inheritance_Mean{
	public static void main(String[] args) {
		Son s = new Son(null);						// 자식의 생성자를 만들면 부모의 생성자도 자동으로 생성.
		Mom m = new Mom();
		System.out.println("=========================");
		Override o = new Override(null);
		System.out.println(o.circle(4));					// override 실험 

	String str1 = null;
	int i = 0;
	if ((i != 0)&&str1.length() < 5) {
		System.out.println(str1);
	}
		
	}
}


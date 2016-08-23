package Class;
											//인스턴스(Instance)멤버란 객체(인스턴스)를 생성후 사용할 수 있는 필드와 메소드를 말함.
public class Member_this_Mean {				//객체 외부에서 인스턴스 멤버에 접근하기 위해 참조 변수를 사용하는 것 처럼, 객체 내부에서
											//인스턴스 멤버에 접근하기 위해 this.를 사용함.
		static void method(){}				//정적(Static)은 '고정된'이라는 의미를 가짐. 정적 멤버는 클래스에 고정된 멤버.
		static int x ;						//객체를 생성하지 않고 사용 할 수 있는 필드와 메소드를 말함.
		static int retu(){return 9;}		//이들은 객체에 소속된 멤버가 아니라 클래스에 소속된 멤버이기 때문에 클래스멤버라고도 함.
		static double pi = 3.14159;			//객체마다 가지고 있어야할 데이터라면 인스턴스 필드가 좋고, 공용적인 데이터라면 정적필드가 좋음.
		static {							//객체는 생성자생성을 하면 초기화게 되만 이처럼 여러개의 static 블록을 통하여 메모리에 할당 되는 순간
		x = 7;}								//바로 초기화를 할 수가 있다. 객체가 없어도 실행된다는 특징 때문에 이들 내부에 인스턴스 필드나
											//인스턴스 메소드를 사용할 수 없음. this키워드도 사용 불가능. 
										
										
	}


class main{
	public static void main(String[] args) {
		Member_this_Mean.method();			// 클래스 이름 . 메소드로 정적 메소드 사용 가능.
		System.out.println(Member_this_Mean.x);
		Singleton_mean sm = Singleton_mean.getIns();
	}
}

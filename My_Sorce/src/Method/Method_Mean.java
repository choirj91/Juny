package Method;

public class Method_Mean {
public static void main(String[] args) {                        //<== 시작점 ,  public 클래서 안에서만 main 생성가능
		show();                                                      //<==함수 호출 ,MainEntry.show(); 이렇게도 사용가능 but static 이 붙어 있기 때문에 바로 사용
																		//<===기울어져 있으면 무조건 static 메소드

		
		Method_Mean me = new Method_Mean();				//<== MainEntry me = new MainEntry(): 이런 형태  new를 인스턴스 또는 오브젝트
	me.display();															//<== 인스턴스 메소드는 꼭 이렇게 사용해야 함.
																				//이유는 굳이 메모리 영역 static 영역에 올려져있게 사용하면 낭비이므로
	
	Point.view();																//다른 클래스에서 불러오는 방법
	Point pt = new Point();
	pt.plus(6, 8);															//<== 클래스의 plus 가 static 이 없기 때문에 ..

	pt.x = 6;                      										//<== 이렇게 다른클래스에 값을 지정 가능.

	add(1,3,4,6,7,5,4);                                                   //<=== (...) 가변 테스트
	add(1,6,7);
}

	public static void show(){                                         //<===함수 정의
		System.out.println("Hello");
}
																		
	public void display(){                                             //<=== 인스턴스 메소드(객체를 생성해서 불러야 하는 것)
		System.out.println("display");								//<=== display 는 main 엔트리 소속
	}																	//<=== ex) Scanner sc = new Scanner(System.in);
																						//int x = sc.netInt(); 이런 식으로 sc를 불러서 사용
																	//따라서 static이 없으면 이런식으로 불러서 (객체를 생성해서) 사용해야함 


	public static void add(int ... x){                              //<== 몇개가 들어오던 사용, 가변 길이
		int sum = 0;
		for (int i = 0; i < x.length; i++) {                       //<== length (그 길이 만큼)
			sum += x[i];
			System.out.print(x[i]+"\t" );//+ sum);
		
	}
}


} //class

 class Point{
	
	 int x , y;
	 
	public int plus(int x, int y){												//<=== static 일지라도 다른 class에 있기 때문에 main에서 사용할려면
																							//        point.plus();
		return x+y;
	}
	public static void view(){																	// Point pt = new Point();
		System.out.println("view()call");													// pt.view();
	}
}

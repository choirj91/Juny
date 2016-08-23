package Method;
																// 리턴타입이 있고 매개변수가 없는 경우
public class Method_03Case {
	//public static returnType method(){return 값 or 수식 or 변수;}

public static int display(){
	
	return 100+50;
	
}

	
	
public static void main(String[] args) {
	
	int sum = display();						// 첫번째 방법
	System.out.println(sum);

	System.out.println(display());         // 두번째 방법
}




}

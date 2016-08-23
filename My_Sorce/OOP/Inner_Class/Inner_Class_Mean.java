package Inner_Class;



class OuterClass{
	static int no;
	String message = "hi~~~";


class InnerClass{ //내부 클래스
	
	//		static int num;		// inner class에 static 멤버를 가질 수 없다.
	int su = 999;
	public void show(){
		System.out.println("inner class " + su);
		System.out.println("outer class" + message);
	}
}
}

public class Inner_Class_Mean {
public static void main(String[] args) {
	//1번째 방법
		OuterClass oc = new OuterClass();
		OuterClass.InnerClass ic = oc.new InnerClass();
		ic.show();
		
		//2번째 방법
		OuterClass.InnerClass inn = new OuterClass().new InnerClass();
		inn.show();
}
}

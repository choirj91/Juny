package Inner_Class;



class OuterClass{
	static int no;
	String message = "hi~~~";


class InnerClass{ //���� Ŭ����
	
	//		static int num;		// inner class�� static ����� ���� �� ����.
	int su = 999;
	public void show(){
		System.out.println("inner class " + su);
		System.out.println("outer class" + message);
	}
}
}

public class Inner_Class_Mean {
public static void main(String[] args) {
	//1��° ���
		OuterClass oc = new OuterClass();
		OuterClass.InnerClass ic = oc.new InnerClass();
		ic.show();
		
		//2��° ���
		OuterClass.InnerClass inn = new OuterClass().new InnerClass();
		inn.show();
}
}

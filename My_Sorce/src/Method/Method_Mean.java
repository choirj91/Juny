package Method;

public class Method_Mean {
public static void main(String[] args) {                        //<== ������ ,  public Ŭ���� �ȿ����� main ��������
		show();                                                      //<==�Լ� ȣ�� ,MainEntry.show(); �̷��Ե� ��밡�� but static �� �پ� �ֱ� ������ �ٷ� ���
																		//<===������ ������ ������ static �޼ҵ�

		
		Method_Mean me = new Method_Mean();				//<== MainEntry me = new MainEntry(): �̷� ����  new�� �ν��Ͻ� �Ǵ� ������Ʈ
	me.display();															//<== �ν��Ͻ� �޼ҵ�� �� �̷��� ����ؾ� ��.
																				//������ ���� �޸� ���� static ������ �÷����ְ� ����ϸ� �����̹Ƿ�
	
	Point.view();																//�ٸ� Ŭ�������� �ҷ����� ���
	Point pt = new Point();
	pt.plus(6, 8);															//<== Ŭ������ plus �� static �� ���� ������ ..

	pt.x = 6;                      										//<== �̷��� �ٸ�Ŭ������ ���� ���� ����.

	add(1,3,4,6,7,5,4);                                                   //<=== (...) ���� �׽�Ʈ
	add(1,6,7);
}

	public static void show(){                                         //<===�Լ� ����
		System.out.println("Hello");
}
																		
	public void display(){                                             //<=== �ν��Ͻ� �޼ҵ�(��ü�� �����ؼ� �ҷ��� �ϴ� ��)
		System.out.println("display");								//<=== display �� main ��Ʈ�� �Ҽ�
	}																	//<=== ex) Scanner sc = new Scanner(System.in);
																						//int x = sc.netInt(); �̷� ������ sc�� �ҷ��� ���
																	//���� static�� ������ �̷������� �ҷ��� (��ü�� �����ؼ�) ����ؾ��� 


	public static void add(int ... x){                              //<== ��� ������ ���, ���� ����
		int sum = 0;
		for (int i = 0; i < x.length; i++) {                       //<== length (�� ���� ��ŭ)
			sum += x[i];
			System.out.print(x[i]+"\t" );//+ sum);
		
	}
}


} //class

 class Point{
	
	 int x , y;
	 
	public int plus(int x, int y){												//<=== static ������ �ٸ� class�� �ֱ� ������ main���� ����ҷ���
																							//        point.plus();
		return x+y;
	}
	public static void view(){																	// Point pt = new Point();
		System.out.println("view()call");													// pt.view();
	}
}

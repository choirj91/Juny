package Inheritance;

class Mom {							//����̶�, �θ� �ڽĿ��� �����ִ� ����. �θ� Ŭ������ ����, �ڽ� Ŭ������ ����,�Ļ� Ŭ����.
										// �ڵ��� �ߺ��� ���̰�, ���߽ð��� ���, ������ �ּ�ȭ(�θ� �����ϸ� �ڼյ� ���� �����Ǵ� ����)
										//�θ𿡼��� private �ʵ�, �޼ҵ�� ��ӹ��� ����. �������� �ٸ��� default �� ��� X
	String ex;
	public Mom(){System.out.println("�θ��� ������");	}	//������
	public Mom(int x){}				//�Ű��� 1���� ���� ������,.
}

class Son extends Mom{			//son �� Inheritance_Mean�� �ڽ�.
										//�ڹٿ����� ���� ��Ӹ� ����.
	
	public Son(){}
	public Son(String x){			//�Ű����� 1���� ������ ������.
		super(6);						// �θ��� ������. (��ġ�ϴ� �Ű��� ��Ī) 
		super.ex = null;				// <= �θ��� ��ü�� ����� �� ����.
		this.ex = x;					//�θ�Ŭ������ ex�� ���.
	}
	double circle(double r){		//���� ���̸� ���ϴ� �޼ҵ�.
		return r*r*3.14;
	}
}

class Override extends Son{		//��ӵ� �Ϻ� �޼ҵ�� �ڽ� Ŭ�������� �ٽ� �����ؼ� ���.
										//�θ��� �޼ҵ�� ������ �ñ׳�ó(���� Ÿ��, �޼ҵ��̸�, �Ű�����)
										//�� ��ġ�Ͽ��� �Ѵ�. �� ���ϰ� �������̵� �� �� ����. ex)public���� default�� �Ұ���.
										//������ �θ� default�� �ڽ��� public �̳� default�� ����.

	public Override(String x){		//��Ʈ��+��Ʈ+s �� �������̵� ����� ���Ͽ� �ڵ� ��������.
		//super(x);
		}
//@Override                       // �����Ϸ��� �ڵ����� ������ �ִ��� �˻����ִ� ��ū.(�����̸����� Ŭ������ ���X�ΰ� ���� ����)
 	double circle(double r){		//�ּ��� �ϰ� circle �� ȣ���ϸ� �θ��� ���ϰ��� ���������,
 		super.circle(r);				//�ε����ϰ� �θ��� ���� �ʿ��ϴٸ� super. �� ����Ͽ� override�� ���� ���.
		return r*r*Math.PI;			//override�� ���� ������ �� circle�� ȣ���ϸ� �ڽ��� ���ϰ��� ���.
	}
}

final class Sson{				//Ŭ����, �ʵ�, �޼ҵ� ���� �ÿ� ��� �� �� ����.
									//������ ���� ����, ���� ������ �� ������ ��.
final int x = 0;					//���� �Ұ���.
}
// ���� ������ public = Ŭ����,�ʵ�,������,�޼ҵ� ���밡�� , ��� Ŭ���� ���� ����
// ���� ������ protected = �ʵ�, ������, �޼ҵ� ���밡��, ��ӵ� Ŭ����   super �θ� ������ ����.(new�� �Ұ���)
// ���� ������ default = Ŭ����, �ʵ�, ������, �޼ҵ� ���밡��, ���� ������ ���� Ŭ������
// ���� ������ private = �ʵ�, ������, �޼ҵ� ���밡��. ��� �ܺ� Ŭ���� ���� �Ұ���.

public class Inheritance_Mean{
	public static void main(String[] args) {
		Son s = new Son(null);						// �ڽ��� �����ڸ� ����� �θ��� �����ڵ� �ڵ����� ����.
		Mom m = new Mom();
		System.out.println("=========================");
		Override o = new Override(null);
		System.out.println(o.circle(4));					// override ���� 

	String str1 = null;
	int i = 0;
	if ((i != 0)&&str1.length() < 5) {
		System.out.println(str1);
	}
		
	}
}


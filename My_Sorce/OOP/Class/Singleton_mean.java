package Class;

public class Singleton_mean  {	//�� �ϳ��� ��ü�� ���鵵�� �����ؾ� �ϴ� ���.
								//Ŭ���� �ܺο��� new �����ڷ� �����ڸ� ȣ���� �� ������ ���ƾ� ��.(�����ڸ� ȣ���� ��ŭ ��ü�� �����Ǳ� ����)
	private static Singleton_mean singleton = new Singleton_mean();
	private Singleton_mean(){System.out.println("�̱���");}
	static Singleton_mean getIns(){
		return singleton;
	}
	
}
class test{
	public static void main(String[] args) {
		Singleton_mean i = Singleton_mean.getIns();
		Singleton_mean i1 = Singleton_mean.getIns();
		if (i == i1) {
			System.out.println("����");
			
		}
		
	}
}

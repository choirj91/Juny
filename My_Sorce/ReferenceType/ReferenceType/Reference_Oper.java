package ReferenceType;

public class Reference_Oper {					//primitive ������ ==, != �� ������ ���� ������ �ƴ���
	public static void main(String[] args) {	// reference ������ ==, != �� ������ �ּ� ���� ���� �ִ���(������ ��ü�� �����ϴ���)
		String x = null;						// reference ������ �� ������ ��ü�� �������� �ʴ� �ٴ� ������ null ���� ���� �� ����.
												//  null�� �ʱ�ȭ�� ���� ������ ���� ������ ������.
		int[] arr = null;
		//arr[0] = 10;							//�迭�� �����ϴ� ��ü�� ���� ������ NullPointerException �߻�.
		
		String name1 = "�ֳ���";
		String name2 = "�ֳ���";					//���ڿ� ���ͷ��� �����ϴٸ� String ��ü�� �����ϵ��� �Ǿ� ����.
		String name3 = new String("�ֳ���");		//new�� �� ������ ���ο� ��ü�� ���� �� ���.[��ü ���� ������]
		System.out.println(name2 == name3);		//���ο� ��ü�� �����߱� ������, �����ϴ� �ּҰ� �޶�, ����� false�� ����.
		System.out.println(name3.equals(name2));//equals()�޼ҵ�� ���ڿ��� �������� ��. ���� ����� true
		
		String su = "�ֳ���";
		su = null;								//su�� �����ϴ� ��ü�� �������, "�ֳ���"�� ������ ��ü�� ����Ͽ� �޸𸮿��� �ڵ� ����.
	}
}

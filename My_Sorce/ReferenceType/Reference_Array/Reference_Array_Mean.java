package Reference_Array;

public class Reference_Array_Mean {					//���� Ÿ���� �����͸� ���ӵ� ������ ������Ű��, �� �����Ϳ� �ε���(index)�� �ο��� ���� �ڷᱸ��.
	public static void main(String[] args) {	//�迭�� �� �ε����� �� �׸��� �����͸� �аų�, �����ϴµ� ���.
												//����� ���ÿ� ������ �� �ִ� ������ Ÿ���� ������. �ѹ� ������ �迭�� ���̸� �ø��ų� ���� �� ����.
		int[] arr;								// �̹� ���� ���� {}����� ��� �Ұ�.
		arr = new int[]{1,2,5,4,6};				// �̷��� �߰�ȣ ��� ����.
		int[] arr1 = {1,2,5,4,6};
		int[] test = new int[5];				//�ʱⰪ�� �ڵ����� 0.String Ÿ���� null, boolean Ÿ���� false �� �ʱⰪ
												//���� ����� �� �ִ� ������ Ȯ���ϰ�, �迭�� ���� ������ ����.
												//���ϵ� ������ test������ ����. intŸ��(���� 4byte)
		
		int result = add(new int[] {94,90,90});	//�޼ҵ� �Ű����� �迭 ��밡��.
		System.out.println(result);
		
		String[] ex = new String[3];
		ex[0] = "java";
		ex[1] = "java";
		ex[2] = new String("java"); 			//
		System.out.println(ex[0] == ex[1]);		//�����ϴ� �ּҰ� ���� ������ true �� ����� ����.
		System.out.println(ex[1] == ex[2]);		//���ο� ��ü�� ������� ������ false ���.
		System.out.println(ex[0].equals(ex[2]));//���ڿ��� ���� true ���
	}

private static int add(int[] is) {
	int sum = 0;
	for (int i = 0; i < is.length; i++) {
		sum += is[i];
	}
	// TODO Auto-generated method stub
	
	return sum;
}
}

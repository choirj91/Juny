package For_Statement;

public class For_Mean {							//�ݺ������ν�, for���� while���� ���� ��ȯ�� ����.
	public static void main(String[] args) {		//for���� �ݺ� Ƚ���� �˰� ������, 
														//while�� ���ǿ� ���� �ݺ��Ҷ� ���.
		int sum = 0;
		for (int i = 1; i <= 100; i++) {			//1~100���� ���� ��. i ������ false �� ���ǹ� �������� �ʰ� ����.
			sum = sum + i;							//for�� �ȿ��� i�� �������־��ٸ� �ۿ����� ��� �Ұ���.
		}
		System.out.println(sum);				
		int i =1;
		for (;  i<100; i++) {								// ��������. -> �ʱ�ȭ ���� �ʿ� ���� ���
			System.out.println(i);}							// �������� ���� ����������, �������� ��;
		for (int j = 0, k =0; j <5 && k<5; j++,k++) { 		//���� ���̻� ��� ����.
		}													//for������ ������ ������ �ۿ��� ��� �Ұ���.
		
		for (float j = 0.1f; j <= 1.0f; j+=0.1f) {		//�ε��Ҽ��� Ÿ���� �ظ��ؼ� ��� ����.
			System.out.println(j);						//float�� ��Ȯ�ϰ� ǥ���� �Ұ��� �Ͽ� ������ �ѹ� ���� ��.
		}
													
		for (int j = 0; j < 5; j++) {
			for (int j2 = 0; j2 < 5; j2++) {			//2�� for ��� ����. �� �̻� ��� ����.
				System.out.print(j + j2);
			}
		}
	}
}

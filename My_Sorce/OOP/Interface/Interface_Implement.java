package Interface;

public class Interface_Implement implements Interface_Mean {
	public static void main(String[] args) {
		
		Interface_Mean m = Interface_Implement();
		m.test();
	}

	private static Interface_Mean Interface_Implement() {
		
		return null;
	}

	@Override							//�߻�޼ҵ忡 ���� ��ü �޼ҵ���� �ʿ���.
	public void test1() {				//���� �⺻ ���� ������ public �̱� ������ �̺��� �� ���� ������ ����� �� ����.
		
	}
	@Override							//�������̽��� �߻� �޼ҵ忡 ���� ��Ȯ�� ��ü �޼ҵ����� üũ�ϵ��� �����ϴ� ������̼�
	public void test2() {
		
	}
}
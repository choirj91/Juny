package If_Statement;

public class If_Mean {								//���ǽ��� ����� ���� ��� ���� ���ΰ� ����.
	public static void main(String[] args) {		//��,������ �ü� �ִ� ������̳� boolean ������ �ü� ����.
		int x = 0, y = 1;
		if (x==y) System.out.println("��");			//���̸� ����. ���� �����̸� {}��� ���� ����. ������ ���� {}��� ����� ����.
		else if (x!=y) {								//if ���� ������ false �� else ���� ������ ��.
			System.out.println("����");
		}// else if( ){ }								//��� �̾ else if ���� ��� ����.
		
		if (x!=y) {
			if (x==1) {								//��ø if�� ��� ����.
				System.out.println("��ø��");
			}
		}
		
		
	}

}

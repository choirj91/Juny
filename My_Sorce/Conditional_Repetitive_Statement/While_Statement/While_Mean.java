package While_Statement;

import java.io.IOException;

public class While_Mean {							//���ǽ��� true �� ��� ��� �ݺ�.false�� ��� ����.
	public static void main(String[] args) {
		boolean x = true;
		int y = 0;
		while (x) {									//���ǽ��� true �� ��츸 �ݺ�.
			y++;
			System.out.println(y);
			if (y==10) {
				break;								//���ǽ��� false �� ��� �̿ܿ� break �� ���Ͽ� ���� ����.
			}
			
		}
	}
}

package While_Statement;

import java.io.IOException;

public class While_keyControl {							//���ǽ��� true �� ��� ��� �ݺ�.false�� ��� ����.
	public static void main(String[] args) {
		boolean run = true;
		int speed = 0;
		int keyCode = 0;
		
		while(run) {
			if (keyCode != 13 && keyCode != 10 ) {
				System.out.println("============");
				System.out.println("1. ���� | 2. ���� | 3. ����");
				System.out.println("-----------------");
				System.out.println("���� :");
			}
			try {
				keyCode = System.in.read();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			if (keyCode == 49) {
				speed++;
			}else if (keyCode == 50) {
				speed--;
				System.out.println("����ӵ� = " + speed);
			}else if (keyCode == 51) {
				run = false;
			}
		}
		System.out.println("���α׷� ����");
	}
}

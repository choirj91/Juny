package Oder;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class Manager extends Customer{

	
	
	
	public Manager() throws FileNotFoundException, IOException, ClassNotFoundException {
		
		// TODO Auto-generated constructor stub
	}

	public void Manager() throws Exception {
		Order_UI ui = new Order_UI();
	
		System.out.println("������ Mode �� �����ϼ̽��ϴ�.");
		System.out.println("������ ��й�ȣ�� �Է��� �ּ���. (��й�ȣ = 152)"); int x = ui.scan(0	);
		if (x == 152) {
			System.out.println("������ ��� ���ٿ� �����ϼ̽��ϴ�.");
			System.out.println("<1> ȸ�� ���� Ȯ�� <2> ȸ�� ���� �� �Է� <3> ȸ�� ���� ����");int y = ui.scan(0);
			if (y == 1) {
			super.customer_Intput();
				
			
			}else if (y == 2) {
				while (true) {
					super.customer_Join();
					System.out.println("��� �Է��Ͻ÷���  <1> , �׸� �Է� �Ͻ÷���<9>");
					int z = ui.scan(0);
					if (z==9) {
						System.out.println("�Է��� ���������� ó���Ǿ����ϴ�.");
						System.out.println("���α׷��� ���� �մϴ�.");
						System.exit(0);
					}
				}
				
				
				
			}else if (y == 3) {
				restore();
			} 
			
			
		}else {
			System.out.println("��й�ȣ�� ��ġ���� �ʾ�, ������ ���� ���α׷��� �����մϴ�.");
		}
		
	}
	
	private void restore() {
		try {

			InputStream input = new FileInputStream("restore.txt");
			OutputStream output = new FileOutputStream("join.txt");
			
			byte[] buffer = new byte[1024 * 8];  
			long start = System.currentTimeMillis(); 
			
			while (true) {
				int inputData = input.read(buffer);
				if (inputData == -1) break;
				output.write(buffer, 0, inputData);
			} 
			long end = System.currentTimeMillis(); 
			System.out.println(end - start); 
			
			input.close();	output.close();
		System.out.println("������ �Ϸ� �Ǿ����ϴ�!");
		
		
		} catch (Exception e) {
			System.out.println("����� ���� ������ �����ϴ�.");
		}
}
}
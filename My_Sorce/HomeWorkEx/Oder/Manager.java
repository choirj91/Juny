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
	
		System.out.println("관리자 Mode 에 접근하셨습니다.");
		System.out.println("관리자 비밀번호를 입력해 주세요. (비밀번호 = 152)"); int x = ui.scan(0	);
		if (x == 152) {
			System.out.println("관리자 모드 접근에 성공하셨습니다.");
			System.out.println("<1> 회원 정보 확인 <2> 회원 정보 새 입력 <3> 회원 정보 복구");int y = ui.scan(0);
			if (y == 1) {
			super.customer_Intput();
				
			
			}else if (y == 2) {
				while (true) {
					super.customer_Join();
					System.out.println("계속 입력하시려면  <1> , 그만 입력 하시려면<9>");
					int z = ui.scan(0);
					if (z==9) {
						System.out.println("입력이 정상적으로 처리되었습니다.");
						System.out.println("프로그램을 종료 합니다.");
						System.exit(0);
					}
				}
				
				
				
			}else if (y == 3) {
				restore();
			} 
			
			
		}else {
			System.out.println("비밀번호가 일치하지 않아, 보안을 위해 프로그램을 종료합니다.");
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
		System.out.println("복구가 완료 되었습니다!");
		
		
		} catch (Exception e) {
			System.out.println("백업해 놓은 파일이 없습니다.");
		}
}
}
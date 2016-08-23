package File_;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.util.Scanner;

public class FileInputEx {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		try {
			//OutputStream os = new FileOutputStream("memo.txt");	//상대경로
			//OutputStream os = new FileOutputStream("E:\\Jun\\test.txt"); //절대경로
			OutputStream os = new FileOutputStream("E:/Jun/test.txt");
			
			while (true) {
				System.out.println("문자열 입력 요망 : ");
				String str = sc.nextLine() + "\r\n";
				if (str.equals("EXIT\r\n")) break;
				
				os.write(str.getBytes());
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
}

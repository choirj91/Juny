package File_;

import java.io.*;
import java.util.*;

public class FileCopy {
	public static void main(String[] args) throws IOException {
		InputStream input = new FileInputStream("C:/SMYSoft/SMemo/SMemo.exe");
		OutputStream output = new FileOutputStream("memocopy.exe");
		
		byte[] buffer = new byte[1024 * 8];  // ���� �������� ���.
		long start = System.currentTimeMillis(); // ���� �ð� ���� ����
		
		while (true) {
			int inputData = input.read(buffer);
			if (inputData == -1) break;
	//		output.write(inputData);	
			output.write(buffer, 0, inputData);//���� ũ���� ���� 0���� �� ���� ũ�⸸ŭ.
		} // end while
		long end = System.currentTimeMillis(); //���� �ð� ����
		System.out.println(end - start); //���� �ɸ��ð�.
		
		input.close();	output.close();
	System.out.println("copy success!!!");
	
	
	}
}

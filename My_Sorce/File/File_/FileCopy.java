package File_;

import java.io.*;
import java.util.*;

public class FileCopy {
	public static void main(String[] args) throws IOException {
		InputStream input = new FileInputStream("C:/SMYSoft/SMemo/SMemo.exe");
		OutputStream output = new FileOutputStream("memocopy.exe");
		
		byte[] buffer = new byte[1024 * 8];  // 보통 이정도로 사용.
		long start = System.currentTimeMillis(); // 시작 시간 저장 변수
		
		while (true) {
			int inputData = input.read(buffer);
			if (inputData == -1) break;
	//		output.write(inputData);	
			output.write(buffer, 0, inputData);//버퍼 크기인 곳에 0부터 그 파일 크기만큼.
		} // end while
		long end = System.currentTimeMillis(); //끝난 시간 변수
		System.out.println(end - start); //복사 걸린시간.
		
		input.close();	output.close();
	System.out.println("copy success!!!");
	
	
	}
}

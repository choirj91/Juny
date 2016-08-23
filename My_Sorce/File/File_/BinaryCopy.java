package File_;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
public class BinaryCopy {
	public static void main(String[] args) throws IOException {
		File src = new File("C:/SMYSoft/SMemo/SUninstall.exe"); //원본파일
		File dist = new File("E:/Jun/SUninstall.exe"); //대상파일
		
		FileInputStream fis = null;
		FileOutputStream fos = null;
		BufferedInputStream bis = null;
		BufferedOutputStream bos = null;
		int c;
		
		fis = new FileInputStream(src);	//파일 입력 바이트 스트림 연결
		fos = new FileOutputStream(dist);	//파일 출력 바이트 스트림 연결
		bis = new BufferedInputStream(fis);	//출력할 객체를 버퍼 입력 스트림 연결
		bos = new BufferedOutputStream(fos);	//버퍼 출력 스트림 연결
		
		while ((c = bis.read()) != -1) {
			bos.write((char)c);
		}
		
		System.out.println("파일 복사 성공!");
		bis.close();
		fis.close();
		fos.close();
		
	}
}

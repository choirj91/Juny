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
		File src = new File("C:/SMYSoft/SMemo/SUninstall.exe"); //��������
		File dist = new File("E:/Jun/SUninstall.exe"); //�������
		
		FileInputStream fis = null;
		FileOutputStream fos = null;
		BufferedInputStream bis = null;
		BufferedOutputStream bos = null;
		int c;
		
		fis = new FileInputStream(src);	//���� �Է� ����Ʈ ��Ʈ�� ����
		fos = new FileOutputStream(dist);	//���� ��� ����Ʈ ��Ʈ�� ����
		bis = new BufferedInputStream(fis);	//����� ��ü�� ���� �Է� ��Ʈ�� ����
		bos = new BufferedOutputStream(fos);	//���� ��� ��Ʈ�� ����
		
		while ((c = bis.read()) != -1) {
			bos.write((char)c);
		}
		
		System.out.println("���� ���� ����!");
		bis.close();
		fis.close();
		fos.close();
		
	}
}

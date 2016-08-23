package File_;

import java.io.File;
import java.io.IOException;
import java.util.Date;

public class FileInformation {
	public static void main(String[] args) throws IOException {
		File file = null;
		byte[] fileName = new byte[100];
		String strName;
		System.out.println("file name = " );	// ����� : test.txt
													// ������ : �ּҸ��
		
		System.in.read(fileName);
		strName = new String(fileName).trim();
		file = new File(strName);
		
		System.out.println(file.getName());
		
		System.out.println("������ : " + file.getAbsolutePath());
		System.out.println("ǥ�ذ�� : " + file.getCanonicalPath());
		System.out.println("���� ������ : " + new Date(file.lastModified())); //��¥ Ÿ��
		System.out.println("����ũ�� : " + file.length()	+ "kb");
		System.out.println("�б�Ӽ� : " + file.canRead());
		System.out.println("����Ӽ� : " + file.canWrite());
		System.out.println("���ϰ�� : " + file.getParent());
		System.out.println("����˻� : " + file.isHidden());
	}
}

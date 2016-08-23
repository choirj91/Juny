package File_Object;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;

public class ObjectOutputEx {
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		
		Grade vo = new Grade();
		vo.setSubject("����");
		vo.setScore(100);
		
		System.out.println("before : " + vo);
		
		OutputStream os = new FileOutputStream("grade1.txt"); // ���� ��� ��ü ����
		ObjectOutputStream oos = new ObjectOutputStream(os);
		oos.writeObject(vo);
		
		InputStream stream = new FileInputStream("grade.dat");
		ObjectInputStream ois = new ObjectInputStream(stream);
		
		Grade vo2 = (Grade)ois.readObject();
		System.out.println("after : " + vo2);
		oos.close(); ois.close();
		
		
	}
}

package File_Object;

import java.io.File;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.ArrayList;

public class FileObjectRead  {
	public static void main(String[] args) throws Exception {
		
		String name = null;
		String id = null;
		String pwd = null;
		boolean gender = true;
		int age = 0;
		String phone = null;
		String temp = null;
		
		File f = new File("members.txt");
		
		FileInputStream fis = new FileInputStream(f);
		ObjectInputStream ois = new ObjectInputStream(fis);
		
		name = (String)ois.readObject();
		id = (String)ois.readObject();
		pwd = (String)ois.readObject();
		gender = (boolean)ois.readObject();
		age = (Integer)ois.readObject();
		phone = (String)ois.readObject();
		ois.close();
		
		System.out.println("\t\t = t >> ȸ������ << \t");
		System.out.println("�̸� \t ���̵� \t\t ��й�ȣ \t ���� \t ���� \t ��ȭ��ȣ");
		System.out.print(name+ "\t" + id + "\t" + pwd + "\t");
		if (gender == true) System.out.print("M");
		else System.out.print("F");
		
		System.out.println("\t" + age + "\t" + phone);
		
		
		
		
		
		
		
}
}
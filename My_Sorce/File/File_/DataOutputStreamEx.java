package File_;
import java.io.*;



public class DataOutputStreamEx {
	public static void main(String[] args) throws FileNotFoundException, IOException {
		File file = new File("memo.txt");
		FileOutputStream fos = new FileOutputStream(file);
		DataOutputStream dos = new DataOutputStream(fos);
		
		dos.writeBoolean(true);
		dos.writeChar(56);
		dos.writeShort(111);
		dos.writeInt(20000);
		dos.writeLong(73289489);
		dos.writeFloat(2.33F);
		dos.writeDouble(234.22);
		dos.flush();		//buffer가 공간이 차지 않아도 비워주는 역할.
		
		System.out.println("memo파일에" +  dos.size() + "byte save");
		dos.close();
	}
}

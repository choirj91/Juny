package File_Buffer;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

public class RandomAccessFileEx {
	public static void main(String[] args) throws FileNotFoundException, IOException {
		
		RandomAccessFile raf = new RandomAccessFile("sample.txt", "rw");  //����ó��....
		
		for( int i =0; i<= 10; i++) {
			raf.seek( i * 100 ); //����ó��...
			raf.writeInt(i);
		}
		
		System.out.println("����!!!!!");
		raf.close();
	}
}







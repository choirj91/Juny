package Net_Tcp;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Scanner;

public class ClientTest {
	public static void main(String[] args) {
		Socket socket = null;
		String str;
		Scanner sc = new Scanner(System.in);
		try {
			socket = new Socket("221.141.152.85", 9000);
			InputStream is = socket.getInputStream(); // read
			OutputStream os = socket.getOutputStream();
			
			while (true) {
				str = sc.nextLine();
				os.write(str.getBytes());
				

				byte[] buffer = new byte[100];
				is.read(buffer);
				System.out.println(new String(buffer));
			}
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
			
		}finally {
			try {
				socket.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
	}
}

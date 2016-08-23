package Net_Tcp;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class ServerTest {
	public static void main(String[] args) {
		ServerSocket socket = null;
		Socket clientSocket = null;
		System.out.println("Server Start");
		String msg;
		Scanner sc = new Scanner(System.in);
		try {
			socket = new ServerSocket(9000); // 0~1024 포트 넘버는 약속된것
			clientSocket = socket.accept();
			InputStream input = clientSocket.getInputStream();// read
			OutputStream output = clientSocket.getOutputStream(); //  write
			
			while(true){
			byte[] arr = new byte[100];
			input.read(arr);
			System.out.println(new String(arr));
			msg =sc.nextLine();
			
			output.write(msg.getBytes());
			}
		} catch (Exception e) {
			// TODO: handle exception
		}finally {
			try {
				clientSocket.close(); socket.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
	}
}

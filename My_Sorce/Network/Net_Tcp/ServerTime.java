package Net_Tcp;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Date;


public class ServerTime {
	public static void main(String[] args) {
		int port = 7000;
		
		try {
			System.out.println("Server Start");
			ServerSocket ss = new ServerSocket(port);
			
			while (true) {
				Socket client = ss.accept();	//socket 2
				OutputStream os = client.getOutputStream();
				ObjectOutputStream oos = new ObjectOutputStream(os);
				oos.writeObject(new Date());
				oos.flush();
				client.close();
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}

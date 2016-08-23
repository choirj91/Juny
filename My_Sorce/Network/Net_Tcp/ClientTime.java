package Net_Tcp;

import java.io.InputStream;
import java.io.ObjectInputStream;
import java.net.Socket;
import java.util.Date;

public class ClientTime {
	public static void main(String[] args) {
		String serverIP = "221.141.152.85";
		int port = 7000;
		Date date = null;
		
		try {
			Socket client = new Socket(serverIP, port);
			InputStream is = client.getInputStream();
			ObjectInputStream ois = new ObjectInputStream(is);
			System.out.println("Servert �� ��¥/�ð� Ȯ��... ����� Ŭ���̾��.\n\n");
			date = (Date)ois.readObject();
			System.out.println("����ð� : " + date + " �Դϴ�.");
			ois.close();
			client.close();
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}

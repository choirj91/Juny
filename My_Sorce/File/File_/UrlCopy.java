package File_;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.MalformedURLException;
import java.net.URL;

public class UrlCopy {
	public static void main(String[] args) throws MalformedURLException, IOException {
		URL url = new URL("http://img.naver.net/static/www/u/2016/0630/nmms_115930786.png");
		
		InputStream input = url.openStream();
		OutputStream output = new FileOutputStream("naverSide.jpg");
		byte[] buffer = new byte[1024];
		
		while (true) {
			int data = input.read(buffer);
			if (data == -1) break;
				output.write(buffer, 0, data);
				
							
			
		}
		input.close(); output.close();
		
	}
}

package AwtEx;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Frame;

public class MainEntry {
	public static void main(String[] args) {
		Frame f = new Frame("awt frame");
		f.setLayout(new BorderLayout());
		f.add(new Button("North"), BorderLayout.NORTH);
		f.add(new Button("South"), BorderLayout.SOUTH);
		f.add(new Button("East"), BorderLayout.EAST);
		f.add(new Button("West"), BorderLayout.WEST);
		f.add(new Button("Center"), BorderLayout.CENTER);
		
		f.setSize(500, 400);  // 화면크기
		f.setVisible(true);   // 화면 보여주기
		f.setLocation(350, 200);
	}
}

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
		
		f.setSize(500, 400);  // ȭ��ũ��
		f.setVisible(true);   // ȭ�� �����ֱ�
		f.setLocation(350, 200);
	}
}

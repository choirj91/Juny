package AwtEx;

import java.awt.Button;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/*class EventHandler implements  ActionListener {
	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println("ActionEvent �߻��߽��ϴ�.");
	}
}*/


public class InnerMain {
	public static void main(String[] args) {
		Frame  f = new Frame("�̺�Ʈ ó�� - �̳�Ŭ����");
		Button  btn = new Button("Start");
		
		btn.addActionListener(new ActionListener() {		//����(�͸�) Ŭ����
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("ActionEvent �߻��߽��ϴ�.");		
				System.out.println(e.getActionCommand());
			}
		});
		
		/*EventHandler handler = new EventHandler();
		btn.addActionListener(handler);*/
		
		f.add(btn);	
		f.setSize(300, 200);  // ȭ��ũ��
		f.setVisible(true);   // ȭ�� �����ֱ�
		f.setLocation(1300, 750);
	}
}

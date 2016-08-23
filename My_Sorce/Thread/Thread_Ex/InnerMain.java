package Thread_Ex;

import java.awt.Button;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/*class EventHandler implements ActionListener{

	
	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println("ActionEvent 발생했씁니다.");
		
		
	}
	
}*/

public class InnerMain {
	public static void main(String[] args) {
		Frame f = new Frame("이벤트 처리 - 이너클래스");
		Button btn = new Button("start");
		
		btn.addActionListener(new ActionListener() { //무명 익명 클래스
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("ActionEvent 발생했씁니다.");
				System.out.println(e.getActionCommand());
			}
		});
		
	/*	EventHandler handler = new EventHandler();
		btn.addActionListener(handler);*/
		
		f.add(btn);
		f.setSize(300, 200); // 화면 크기
		f.setVisible(true);		//화면 보여주기
		f.setLocation(350, 200);
		
	}
}

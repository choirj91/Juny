package My_Ex;

import java.awt.Button;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.Panel;
import java.awt.TextArea;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class Gugu extends Frame implements ActionListener{
	Button btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9, exit;
	Label lb;
	TextArea ta;
	
	
	 public Gugu(String str) {
		 super(str);
		 ta = new TextArea("버튼클릭", 20, 40, TextArea.SCROLLBARS_VERTICAL_ONLY);
		 ta.setBackground(Color.BLACK);
		 ta.setForeground(Color.green);
		 setBackground(Color.lightGray);
		 lb=new Label();
		 btn2 = new Button("2단");
		 btn3 = new Button("3단");
		 btn4 = new Button("4단");
		 btn5 = new Button("5단");
		 btn6 = new Button("6단");
		 btn7 = new Button("7단");
		 btn8 = new Button("8단");
		 btn9 = new Button("9단");	 
		 exit = new Button("종료");
		 btn2.addActionListener(this);
		 btn3.addActionListener(this);
		 btn4.addActionListener(this);
		 btn5.addActionListener(this);
		 btn6.addActionListener(this);
		 btn7.addActionListener(this);
		 btn8.addActionListener(this);
		 btn9.addActionListener(this);
		 exit.addActionListener(this);
		 Panel p = new Panel();
		 p.add(btn2);
		 p.add(btn3);
		 p.add(btn4);
		 p.add(btn5);
		 p.add(btn6);
		 p.add(btn7);
		 p.add(btn8);
		 p.add(btn9);
		 p.add(ta);
		 p.add( exit);
		 add("Center", p);
		 add("South", lb);
		 setSize(320, 440);
		 setVisible(true);
		 setLocation(350, 150);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		Object obj = e.getSource();
		System.out.println(e.getActionCommand());
		if((Button)obj==btn2){
			app(2);
			
		}else if ((Button)obj==btn3) {
			app(3);
		}else if ((Button)obj==btn4) {
			app(4);
		}else if ((Button)obj==btn5) {
			app(5);
		}else if ((Button)obj==btn6) {
			app(6);
		}else if ((Button)obj==btn7) {
			app(7);
		}else if ((Button)obj==btn8) {
			app(8);
		}else if ((Button)obj==btn9) {
			app(9);
		}else System.exit(0);
		
	}
	
	public void app(int num){
		gg(num);
		ta.append("\n"+"========="+num+"단======="+this.gg(num));
	}
	
	public String gg(int num){
		ArrayList<String> gugu = new ArrayList<String>();
			for (int j = 2; j < 10; j++) {
				 gugu.add("\n" +num + " * " + j + " = " + num*j );
			}
			for (int i = 0; i < gugu.size(); i++) {
				gugu.get(i);
			}
			return gugu.get(0) + gugu.get(1) + gugu.get(2) + gugu.get(3)
			 + gugu.get(4) + gugu.get(5) + gugu.get(6) + gugu.get(7)  ;
	}
	
	
	
	public static void main(String[] args) {
		new Gugu("구구");
	}
	

}

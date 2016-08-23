package Thread_Ex;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;
import java.util.Random;

import javax.swing.JFrame;

public class GraphicThread extends JFrame implements Runnable {

	
	int x, y , num;
	Color color;
	Random random;
	
	public GraphicThread(int num){
		this.num = num;
		color = Color.DARK_GRAY;
		random = new Random();
		
		setSize(500, 400); // 화면크기. (너비, 높이)
		setVisible(true);   // 화면 표시
		setLocation(400, 100);	// x, y 좌표 위치에 프레임 위치
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 	//닫기
}
	
	@Override
	public void update(Graphics g) {
		g.clipRect(x, y, 10, 10);
		paint(g);
	}

	@Override
	public void paint(Graphics g) {
		g.setColor(color);
		g.fillOval(x, y, 10, 10);
	}

	@Override
	public void run() { // 스레드 구현부(실행부)
		Rectangle rect = getBounds();
		for (int i = 0; i < num; i++) {
			x = random.nextInt(rect.width);
			y = random.nextInt(rect.height);
			
			repaint();
			try {
				Thread.sleep(1);
			} catch (Exception e) {
				// TODO: handle exception
			}
		}

	}
public static void main(String[] args) {
//	GraphicThread gt = new GraphicThread(2000);
	//t.start();
	new Thread(new GraphicThread(2000)).start();
	
}
}

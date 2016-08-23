package OOP;

class A {
	 private int x, y;   //멤버변수    //접근지정자를 안 쓰면 default 이다
	 	
	 public void setData(int xx, int yy ) { x = xx; 		 y = yy; }
	 public void setX(int xx) {	 x = xx;	 }   //멤버함수
	 public int getX() {		 return x;	 }
	 public void setY(int yy) {	 y = yy;	 }
	 public int getY() {		 return y;	 }
	 public void disp() {
		 //System.out.println("x = " + getX() + ", y = " + getY());
		 System.out.println("x = " + x + ", y = " + y);
	 } 
} // A end
public class Class_Structure {
	public static void main(String[] args) {
		A a = new A();  //객체생성, 메모리에 할당, 생성자함수 자동호출됨 
		
		//a.x = 9;       a.y = 99;
		a.setX(9); 		a.setY(99);
		System.out.println("1. x = " + a.getX() + ", y = " + a.getY());
		
		a.setData(5, 20);  //a.setX(10);		a.setY(5);
		//System.out.println("x = " + a.getX() + ", y = " + a.getY());
		a.disp();
		a.setData(5, 100);  //a.setX(100);		a.setY(155);
		a.disp();
		//System.out.println("x = " + a.getX() + ", y = " + a.getY());
		a.setY(155);
		System.out.println("x = " + a.getX() + ", y = " + a.getY());
		a.setY(30);
		System.out.println("x = " + a.getX() + ", y = " + a.getY());
	}
} // MainEntry end

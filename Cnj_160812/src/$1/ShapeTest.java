package $1;

abstract class Shape{
	abstract double area();
	abstract double circumference();

}

class Rectangle extends Shape{
	
	private int width, height;
	
	public Rectangle(int i, int j) {
		this.width = i;
		this.height = j;
	}

	

	@Override
	double area() {
		
		return (this.width)*(this.height);
	}

	@Override
	double circumference() {
		
		return 2*(height+width);
	}
}

class Circle extends Shape{
	private int r;

	Circle (int r) {
		this.r = r;
	}
	
	@Override
	double area() {
		
		return Math.PI*r*r;
	}

	@Override
	double circumference() {
		
		return Math.PI*r*2;
	}
	
	
}

public class ShapeTest {
	public static void main(String[] args) {
		Shape s1 = new Rectangle(4,5);
		Shape s2 = new Circle(5);
		System.out.println("�簢���� �ʺ� = "       + s1.area());
		System.out.println("�簢���� �ѷ� = " + s1.circumference());
		System.out.println("���� �ʺ� = "  +  s2.area());
		System.out.println("���� �ѷ� = "  +  s2.circumference());
		
	}
}

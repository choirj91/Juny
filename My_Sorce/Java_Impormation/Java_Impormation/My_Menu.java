package Java_Impormation;

import java.util.Scanner;

public class My_Menu {
	public static void main(String[] args) {
		My_Menu use = new My_Menu();
		
		
		int x = 3 ; String y = null ;
				y = use.scan(y);use.t();
		use.print(x);use.t();
		
		use.print(y); use.t();
		int z = use.plus(12,3);
		use.print(z);
		int i = use.sub(12,3); use.t();
		use.print(i);
		int u = use.mul(12,3); use.t();
		use.print(u);
		double j = use.div(12,3); use.t();
		use.print(j);
	} //main end






	public int scan(int x){                                // Scanner �Լ�
		Scanner sc = new Scanner(System.in);
		x = sc.nextInt();
		return x;
	}

	public String scan(String x){                           // Scanner �Լ�
		Scanner sc = new Scanner(System.in);
		x = sc.nextLine();
		return x;
	}

	public void t(){
		System.out.println();                               //print �ٹٲٴ� �Լ�
	}
	
	public void print(double x){                           // print�Լ�
		System.out.print(x);
	}
	
	public void print(int x){                           // print�Լ�
		System.out.print(x);
	}

	public void print(String x){                           // print�Լ�
		System.out.print(x);
	}
	
	public int plus(int ... x){                                // + �Լ�
		int sum = 0;
		
		for (int i = 0; i < x.length; i++) {
			sum = sum + x[i];
		}
		return sum;
	}
	
	public int sub(int ... x){                                // - �Լ�
		int sub = x[0];
		
		for (int i = 1; i < x.length; i++) {
			sub = sub - x[i];
		}
		return sub;
	}
	
	public int mul(int ... x){                                // * �Լ�
		int mul = 1;
		
		for (int i = 0; i < x.length; i++) {
			mul = mul * x[i];
		}
		return mul;
	}
	
	public double div(double ... x){                                // / �Լ�
		double div = x[0];
		
		for (int i = 1; i < x.length; i++) {
			div = div / x[i];
			if (x[i] == 0) {
				System.out.println();
				String z = "0���� ������ ���� ������ ���α׷��� ���� �մϴ�.";
				print(z);
				System.exit(0);
			}
		}
		return div;
	}
}

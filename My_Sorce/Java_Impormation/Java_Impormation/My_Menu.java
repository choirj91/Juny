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






	public int scan(int x){                                // Scanner 함수
		Scanner sc = new Scanner(System.in);
		x = sc.nextInt();
		return x;
	}

	public String scan(String x){                           // Scanner 함수
		Scanner sc = new Scanner(System.in);
		x = sc.nextLine();
		return x;
	}

	public void t(){
		System.out.println();                               //print 줄바꾸는 함수
	}
	
	public void print(double x){                           // print함수
		System.out.print(x);
	}
	
	public void print(int x){                           // print함수
		System.out.print(x);
	}

	public void print(String x){                           // print함수
		System.out.print(x);
	}
	
	public int plus(int ... x){                                // + 함수
		int sum = 0;
		
		for (int i = 0; i < x.length; i++) {
			sum = sum + x[i];
		}
		return sum;
	}
	
	public int sub(int ... x){                                // - 함수
		int sub = x[0];
		
		for (int i = 1; i < x.length; i++) {
			sub = sub - x[i];
		}
		return sub;
	}
	
	public int mul(int ... x){                                // * 함수
		int mul = 1;
		
		for (int i = 0; i < x.length; i++) {
			mul = mul * x[i];
		}
		return mul;
	}
	
	public double div(double ... x){                                // / 함수
		double div = x[0];
		
		for (int i = 1; i < x.length; i++) {
			div = div / x[i];
			if (x[i] == 0) {
				System.out.println();
				String z = "0으로 나눌수 없기 때문에 프로그램을 종료 합니다.";
				print(z);
				System.exit(0);
			}
		}
		return div;
	}
}

package Method;

import java.util.Scanner;

public class Method_Overload {				//�Լ����� ����, �Ű������� ������ �ٸ��ų�, �Ű������� ������ ���ٸ� �ڷ����� �ٸ� �Լ�
		
	public static int add(int x, int y){
		return x + y;
	}
	
	public static double add(double x, double y){
		return x + y;
	}

	public static double add(int x, double y){
		return x + y;
	}
	
	public static String add(String x, String y){
		return x + y;
	}
	
	public static void add(int ... x){                              //<== ��� ������ ���, ���� ����[���� ó�� ���� �ߺ��� �������� �̷��� ��]
		int sum = 0;
		for (int i = 0; i < x.length; i++) {                       //<== length (�� ���� ��ŭ)
			sum += x[i];
			System.out.print(x[i]+"\t" );//+ sum);
		
	}
	}
	public static void main(String[] args) {
		System.out.println("add = " + add("kbs" , "kbs"));
		System.out.println(add(3, 3));
	}
}

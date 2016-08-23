package Method;

import java.util.Scanner;

public class Method_Overload {				//함수명은 같고, 매개변수의 개수가 다르거나, 매개변수의 개수가 같다면 자료형이 다른 함수
		
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
	
	public static void add(int ... x){                              //<== 몇개가 들어오던 사용, 가변 길이[위에 처럼 갯수 중복을 막기위해 이렇게 씀]
		int sum = 0;
		for (int i = 0; i < x.length; i++) {                       //<== length (그 길이 만큼)
			sum += x[i];
			System.out.print(x[i]+"\t" );//+ sum);
		
	}
	}
	public static void main(String[] args) {
		System.out.println("add = " + add("kbs" , "kbs"));
		System.out.println(add(3, 3));
	}
}

package Array_Ex;

import java.util.Random;
import java.util.Scanner;
										//특정 달의 평균 강수량 구하기
public class Array_Ex_Rain {
public static void main(String[] args) {
	Array_Ex_Rain use = new Array_Ex_Rain();
	String str1, str2, str3; 
	str1 = "평균 강수량을 보고 싶은 달을 입력해주세요.";
	str2 = "월의 평균 강수량은";
	str3 = "mm 입니다.";
	use.print(str1);
	int day = use.scan(0);
	use.rain(day);
	use.print(day);
	use.print(str2);
	use.print(use.arr30());
	use.print(str3);
	
	

} // main end


	public int scan(int x){
		Scanner sc = new Scanner(System.in);
		x = sc.nextInt();
		return x;
	}

	public String scan(String x){
		Scanner sc = new Scanner(System.in);
		x = sc.nextLine();
		return x;
	}

	public void print(int x){
		System.out.print(x);
	}

	public void print(String x){
		System.out.print(x);
	}
	
	public int arr30(){
		
		int[] arr = new int[30];
		int sum = 0 ;
		int avg;
		for (int i = 0; i < arr.length; i++) {
			
			arr[i] = (int)(Math.random()*100+1);
			sum = sum + arr[i];
		}
		avg = sum/30;
		return avg;
		}
	
	public int rain(int x){
		if (x == 1 || x == 3 || x == 4 || x == 6 || x == 8 || x == 10 || x == 11 || x == 12) {
			String y = "비가 좀 온 달이네요";
;			print(y);
			System.out.println();
		}else{
			String y = "비가 안온 달 입니다.";
			print(y);
			System.exit(0);
			
		}
		return x;
		 
	}
	
	} //class
	


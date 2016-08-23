package Array_Ex;

import java.util.Scanner;

public class Array_Ex_Scanner {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	int[] arr = new int[5];
	
	for (int i = 0; i < arr.length; i++) {
		System.out.println("정수 숫자 입력 : ");
		arr[i] = sc.nextInt();
		
	}
	for (int i = 0; i < arr.length; i++) {
		System.out.println( arr[i]);
		}
	System.out.println();
	for (int item : arr) {                                   //<==== 확장 for문
		System.out.print(item);
		
	}
		
}
}

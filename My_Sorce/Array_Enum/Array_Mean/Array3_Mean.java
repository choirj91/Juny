package Array_Mean;

import java.util.Scanner;

public class Array3_Mean {
public static void main(String[] args) {
	
	//  �ڷ���[][][] �迭�� = new �ڷ���[��][��][��];				3���� �迭 ����
	int[][][] arr = new int[2][2][3];
	int x = 0;
	
	for (int i = 0; i < arr.length; i++) {
		for (int j = 0; j < arr[0].length; j++) {
			for (int j2 = 0; j2 < arr[0][0].length; j2++) {
				x = new Scanner(System.in).nextInt();
				arr[i][j][j2] = x;
			}
		}
	}
	
	for (int i = 0; i < arr.length; i++) {
		for (int j = 0; j < arr[0].length; j++) {
			for (int j2 = 0; j2 < arr[0][0].length; j2++) {
				System.out.print("arr[" + i + "][" + j +"][" +j2 + "] = " +  arr[i][j][j2] + "\t");
			}
			System.out.println();
			
		}
		System.out.println();
	}
	
	
}
}

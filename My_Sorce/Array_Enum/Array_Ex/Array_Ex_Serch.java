package Array_Ex;

import java.util.Arrays;

public class Array_Ex_Serch {
public static void main(String[] args) {
	int[] x = {7,3,2,7,9,12,7};
	int seek = 7, count = 0;
	
	for (int i = 0; i < x.length; i++) {
		if (x[i] == seek) {
			count ++;
		}
		}
	System.out.println("7�� ������ " + count + "�� �Դϴ�.");

	Arrays.sort(x);                         //<=== �������� ����
	for(int item : x)
	System.out.print(item + " ");

	System.out.println();
	for (int i = x.length-1; i >= 0; i--) {
		System.out.print(x[i] + " ");                  //<====��������
		
	}

}


}

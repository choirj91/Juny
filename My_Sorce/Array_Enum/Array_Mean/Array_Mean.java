package Array_Mean;

import java.util.Arrays;

import javax.swing.text.StyledEditorKit.ForegroundAction;

public class Array_Mean {													//<== �迭 - �ϰ�ó���� ����, ������ ����Ÿ ����, ÷�ڴ� 0���� ����, for���̶� ģ��
	public static void main(String[] args) {
		
		
		int[] arr = new int[10];                                           //<=== arr - ������ 3�� ���� ����
		int[] arr1 = {10 , 20, 30 ,40};                                   //<== �ٷ� �ʱⰪ ����
		int[] arr2 = new int[10];										//�迭���� '_' , '$' �� ��밡��
		
	for (int i = 0; i < arr1.length; i++) {                          //<== �迭 ������ ���
		System.out.println(arr1[i]);
	}
	
	int p = 5;
	for (int j = 0; j < arr2.length; j++) {
		arr2[j] = p; 
		p += 5;
	}
		
	 System.out.println(arr1.length);                            //<== ����
	System.out.println(arr2.length);
	for (int n = 0; n < arr2.length; n++) {					
		System.out.print(arr2[n] + " ");
	
	}
	System.out.println();
	for ( int item : arr2){
		System.out.print(item + " ");                          // Ȯ�� for�� item �ȿ� arr2[0] ~~ �̷������� ��
	}

	int[] x = {4,3,6,3,2,8};
	
	Arrays.sort(x);                                           //<=== �������� ����
	for(int item : x)
	System.out.print(item + " ");

	System.out.println();
	for (int i = x.length-1; i >= 0; i--) {
		System.out.print(x[i] + " ");                         //<====��������
		
	}
	
	}
	


	
	
}

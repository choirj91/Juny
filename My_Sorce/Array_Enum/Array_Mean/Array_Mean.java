package Array_Mean;

import java.util.Arrays;

import javax.swing.text.StyledEditorKit.ForegroundAction;

public class Array_Mean {													//<== 배열 - 일괄처리가 목적, 동일한 데이타 모임, 첨자는 0부터 시작, for문이랑 친함
	public static void main(String[] args) {
		
		
		int[] arr = new int[10];                                           //<=== arr - 변수명 3은 공간 갯수
		int[] arr1 = {10 , 20, 30 ,40};                                   //<== 바로 초기값 설정
		int[] arr2 = new int[10];										//배열명은 '_' , '$' 는 사용가능
		
	for (int i = 0; i < arr1.length; i++) {                          //<== 배열 데이터 찍기
		System.out.println(arr1[i]);
	}
	
	int p = 5;
	for (int j = 0; j < arr2.length; j++) {
		arr2[j] = p; 
		p += 5;
	}
		
	 System.out.println(arr1.length);                            //<== 길이
	System.out.println(arr2.length);
	for (int n = 0; n < arr2.length; n++) {					
		System.out.print(arr2[n] + " ");
	
	}
	System.out.println();
	for ( int item : arr2){
		System.out.print(item + " ");                          // 확장 for문 item 안에 arr2[0] ~~ 이런식으로 들어감
	}

	int[] x = {4,3,6,3,2,8};
	
	Arrays.sort(x);                                           //<=== 오름차순 정렬
	for(int item : x)
	System.out.print(item + " ");

	System.out.println();
	for (int i = x.length-1; i >= 0; i--) {
		System.out.print(x[i] + " ");                         //<====내림차순
		
	}
	
	}
	


	
	
}

package Array_Mean;

public class Array2_Mean {
	public static void main(String[] args) {
		
	
		int[][] arr = new int[2][3];                      // 2차원 배열 선언(데이터값 X)
		int arr1[][] = {{1,2,3} , {4,5,6}};					// 2차원 배열 선언(데이터값도 미리 선언) 2행3열
		            // {{0, } , {0, }}                       //0으로 다 초기화한단느 뜻
	
		System.out.println(arr.length);  				// 행의 길이
		System.out.println(arr[0].length);				//열의 길이
	
			for (int i = 0; i < arr.length; i++) {			//2차원 배열 출력
					for (int j = 0; j < arr[0].length; j++) {
						System.out.print("\t" + arr[i][j]);
			}
			System.out.println();
		}
	}
}
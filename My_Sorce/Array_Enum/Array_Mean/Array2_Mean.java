package Array_Mean;

public class Array2_Mean {
	public static void main(String[] args) {
		
	
		int[][] arr = new int[2][3];                      // 2���� �迭 ����(�����Ͱ� X)
		int arr1[][] = {{1,2,3} , {4,5,6}};					// 2���� �迭 ����(�����Ͱ��� �̸� ����) 2��3��
		            // {{0, } , {0, }}                       //0���� �� �ʱ�ȭ�Ѵܴ� ��
	
		System.out.println(arr.length);  				// ���� ����
		System.out.println(arr[0].length);				//���� ����
	
			for (int i = 0; i < arr.length; i++) {			//2���� �迭 ���
					for (int j = 0; j < arr[0].length; j++) {
						System.out.print("\t" + arr[i][j]);
			}
			System.out.println();
		}
	}
}
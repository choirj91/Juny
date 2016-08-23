package Sort;

public class Sort_Select {
	public static void main(String[] args) {
		
		
		  int arr[] = { 16, 4, 5, 7, 3}; // 정렬되지 않은 데이터
		  
		  int  index, tmp;
		  
		  for (int i = 0; i <= 4; i++)  //0~5회전 루프
		  {
		   System.out.print(i+"번째 정렬 : "); 
		   
		   for (int j = 0; j < 5; j++)   // 배열에 나열되어 있는 데이터를 찍는 루프
		    
		   System.out.print(arr[j] + " ");
		   
		   System.out.println();
		   
		   index = i;
		   
		   for (int k = i + 1; k < 5; k++) //교환 이후부터 비교
		   {
		    if (arr[index] > arr[k])  //비교
		    {
		     index = k;  // index 에 최소값 저장
		    }
		   }
		   
		   tmp = arr[index];       // 빈 그릇을 이용한 위치 교환
		   arr[index] = arr[i];    // 빈 그릇을 이용한 위치 교환
		   arr[i] = tmp;           // 빈 그릇을 이용한 위치 교환
		  }
		  
		  System.out.print("최종결과   : ");
		  
		  for (int m = 0; m < 5; m++)  //마지막 결과 루프
		  {
		  System.out.print(arr[m]+ " "); //화면 출력
		  } 
		  System.exit(0);

		 }

}

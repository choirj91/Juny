package Sort;

public class Sort_Select {
	public static void main(String[] args) {
		
		
		  int arr[] = { 16, 4, 5, 7, 3}; // ���ĵ��� ���� ������
		  
		  int  index, tmp;
		  
		  for (int i = 0; i <= 4; i++)  //0~5ȸ�� ����
		  {
		   System.out.print(i+"��° ���� : "); 
		   
		   for (int j = 0; j < 5; j++)   // �迭�� �����Ǿ� �ִ� �����͸� ��� ����
		    
		   System.out.print(arr[j] + " ");
		   
		   System.out.println();
		   
		   index = i;
		   
		   for (int k = i + 1; k < 5; k++) //��ȯ ���ĺ��� ��
		   {
		    if (arr[index] > arr[k])  //��
		    {
		     index = k;  // index �� �ּҰ� ����
		    }
		   }
		   
		   tmp = arr[index];       // �� �׸��� �̿��� ��ġ ��ȯ
		   arr[index] = arr[i];    // �� �׸��� �̿��� ��ġ ��ȯ
		   arr[i] = tmp;           // �� �׸��� �̿��� ��ġ ��ȯ
		  }
		  
		  System.out.print("�������   : ");
		  
		  for (int m = 0; m < 5; m++)  //������ ��� ����
		  {
		  System.out.print(arr[m]+ " "); //ȭ�� ���
		  } 
		  System.exit(0);

		 }

}

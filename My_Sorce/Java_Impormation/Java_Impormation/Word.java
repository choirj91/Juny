package Java_Impormation;

import java.util.Arrays;
import java.util.Scanner;



public class Word {																	 // <=== Ŭ���� ���� ������ �빮�ڷ� ����[������] main ������ �� 1��
	public static void main(String[] args) {                                       // <===  main �޼ҵ�(�޼ҵ�� ()�� ����)
																						// <== �޼ҵ�� �ݺ������� ����ϴ� ���� �̾� ȣ���� �� �ֵ���.
		//                                                              // <=== �ּ��� ��Ʈ�� + / Ű�� ������ ����(������ ���� Ű)
	     
		/*�ּ�
		�ּ�
		�ּ�*/                                             			// <=== ��� ������ ��Ʈ��+/ Ű�� ���� �ڵ� �ּ�(������ ��Ʈ��+\)
				
		System.out.println();															 // <=== print() ,   println(),    printf()
																						    //�ٷ� �Է�   �������Է�  �ڷ�������
		
		Scanner sc = new Scanner(System.in);                                 // <== ��(Scanner)��� ���� sc��� �׸��� ����� ������ �Լ�(�޼ҵ�) (Ư���� �Լ�)
		int ex = new Scanner(System.in).nextInt();                           // <==== �ѹ��� ��밡��.
		
		String strx = args[0];                                                  // <=== Scanner �� ��� ���� �ʰ� �Է� ����.
		int x = Integer.parseInt(strx);                                      //<======     Integer.parseInt(*) - ��Ʈ���� �ڵ����� Int ������ �ٲ�
		
		int y = Integer.parseInt(args[1]);                                 // <======    �ٷ� ��밡��.
		System.out.println(x + y);                                           // <======== Run configurations �� ���� Arguments �� ���� ���� �Է�
		System.out.println(x - y);                                                
		
//		UP :                                         								     // <=== UP �̶�� �ĺ��ڸ� ���� break; �� ����� ����������;;
//   break up ;                                                                     // <==== ����
			
		int[] arr = new int[10];                                           //<=== arr - ������ 3�� ���� ����
		int[] arr1 = {10 , 20, 30 ,40};                                   //<== �ٷ� �ʱⰪ ����
		for(int item : arr) { 															//<====  // Ȯ��for�� for( �ڷ��� ������ : �迭�� �Ǵ� �ݷ��Ǹ�){ �ݺ���;}
	 System.out.println(item + "\t");
 }
	Arrays.sort(arr1);                                                       //<===�������� ����
	for(int item : arr)
	System.out.print(item + " ");
	
	int ran = (int)(Math.random()*100+1);                        //<== ���� �Լ�  *(�ִ밪) + (�ּҰ�)  
	
	Day d = Day.valueOf(args[0]);								//������ Ÿ�� ���. 
	System.out.println(d.FRI);
	
	System.out.println(Integer.parseInt("15db9742", 16)); //10���� ���� 16������ ��ȯ
	} //main end
	enum Day{
		MON, TUES, WEDNES, THURS, FRI;					// ������ Ÿ��.
	}
	
	public static void add(int ... x){                              //<== ��� ������ ���, ���� ����
		int sum = 0;
		for (int i = 0; i < x.length; i++) {                       //<== length (�� ���� ��ŭ)
			sum += x[i];
			System.out.print(x[i]+"\t" );//+ sum);
		
	}
		
		try {                                                        // <=== ���� �߰�
			
		} catch (Exception e) {
			System.out.println(e.getMessage());                //  �޼��������
			e.printStackTrace();                                  //   ������ �߻��� ���� �ܰ������� ã�Ƽ� ���

		}finally {                                                 // <== �����̴� �������̴� ����
			
		}
		
}
	

//	this                                      //�ڱ� �ڽ�

	
	
}

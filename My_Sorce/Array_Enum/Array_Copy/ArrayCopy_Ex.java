package Array_Copy;

public class ArrayCopy_Ex {
	public static void main(String[] args) {
		String[] arr1 = new String[]{"ù��° ����", "�ι�°", "����°"};
		String[] arr2 = new String[]{"ó���̴���", "�ι�°����"};
		String[] arr3 = new String[5];
		
		//System.arraycopy(src, srcPos, dest, destPos, length); //src�� ���� �迭 srcpos �� ���� ����, dest�� �� �迭, despos�� ���迭 ���۹�ȣ, ������ ����
		System.arraycopy(arr1, 0, arr3, 0, arr1.length);		//arr1 �� arr3���ٰ� ����.
		for (int i = 0; i < arr3.length; i++) {					//���� �Ǵ� ���� ��ü�� �����̹Ƿ� �����ϴ� ��ü�� ����(���� ����(shallow copy)��� ��.
			System.out.print(arr3[i]);							//�ݸ鿡 ���� ����(deep copy)�� ��ü�� ���� ����.
		}System.out.println();
		System.arraycopy(arr2, 0, arr3, 3, arr2.length);	//arr3�� 3���� ���� arr2�� ����.
		for ( String item : arr3){							//Ȯ�� for������ ���
			System.out.println(item);
		}
		
	}
}

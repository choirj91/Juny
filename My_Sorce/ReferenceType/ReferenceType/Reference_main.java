package ReferenceType;

public class Reference_main {
	public static void main(String[] args) {
		String[] args1 = { };					//String[] args �� �̷� ����.
		String str1 = args[0];					/// Run configuration ���� �� �Է�.
		String str2 = args[1];			
		
		int num1 = Integer.parseInt(str1); // ���ڸ� ������ ��ȯ
		int num2 = Integer.parseInt(str2);
		
		System.out.println(num1 + num2);	//arguments �Է¶��� 10 20�� �Է��ϸ�, ��� ������Ʈ���� 
											//java MainStringArrayArgument 10 20 �� ����.
		
		int[] arr = new int[10];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = Integer.parseInt(args[i]);	//�����Ͽ�, �ٷ� �Է� �޾� ����.
		}
	}
}

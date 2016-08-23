package ReferenceType;

public class Reference_main {
	public static void main(String[] args) {
		String[] args1 = { };					//String[] args 는 이런 상태.
		String str1 = args[0];					/// Run configuration 에서 값 입력.
		String str2 = args[1];			
		
		int num1 = Integer.parseInt(str1); // 문자를 정수로 변환
		int num2 = Integer.parseInt(str2);
		
		System.out.println(num1 + num2);	//arguments 입력란에 10 20을 입력하면, 명령 프롬프트에서 
											//java MainStringArrayArgument 10 20 과 같음.
		
		int[] arr = new int[10];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = Integer.parseInt(args[i]);	//응용하여, 바로 입력 받아 저장.
		}
	}
}

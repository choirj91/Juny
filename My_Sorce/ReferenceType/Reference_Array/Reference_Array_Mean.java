package Reference_Array;

public class Reference_Array_Mean {					//같은 타입의 데이터를 연속된 공간에 나열시키고, 각 데이터에 인덱스(index)를 부여해 놓은 자료구조.
	public static void main(String[] args) {	//배열의 각 인덱스는 각 항목의 데이터를 읽거나, 저장하는데 사용.
												//선언과 동시에 저장할 수 있는 데이터 타입이 결정됨. 한번 생성된 배열은 길이를 늘리거나 줄일 수 없다.
		int[] arr;								// 이미 선언 이후 {}블록은 사용 불가.
		arr = new int[]{1,2,5,4,6};				// 이렇게 중괄호 사용 가능.
		int[] arr1 = {1,2,5,4,6};
		int[] test = new int[5];				//초기값이 자동으로 0.String 타입은 null, boolean 타입은 false 로 초기값
												//값이 저장될 수 있는 공간을 확보하고, 배열의 생성 번지를 리턴.
												//리턴된 번지는 test변수에 저장. int타입(각각 4byte)
		
		int result = add(new int[] {94,90,90});	//메소드 매개값에 배열 사용가능.
		System.out.println(result);
		
		String[] ex = new String[3];
		ex[0] = "java";
		ex[1] = "java";
		ex[2] = new String("java"); 			//
		System.out.println(ex[0] == ex[1]);		//참조하는 주소가 같기 때문에 true 의 결과를 얻음.
		System.out.println(ex[1] == ex[2]);		//새로운 객체를 만들었기 때문에 false 출력.
		System.out.println(ex[0].equals(ex[2]));//문자열이 같아 true 출력
	}

private static int add(int[] is) {
	int sum = 0;
	for (int i = 0; i < is.length; i++) {
		sum += is[i];
	}
	// TODO Auto-generated method stub
	
	return sum;
}
}

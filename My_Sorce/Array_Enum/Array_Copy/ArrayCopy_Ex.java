package Array_Copy;

public class ArrayCopy_Ex {
	public static void main(String[] args) {
		String[] arr1 = new String[]{"첫번째 구욘", "두번째", "세번째"};
		String[] arr2 = new String[]{"처음이다잉", "두번째다잉"};
		String[] arr3 = new String[5];
		
		//System.arraycopy(src, srcPos, dest, destPos, length); //src는 원본 배열 srcpos 는 시작 번지, dest는 새 배열, despos는 새배열 시작번호, 복사할 개수
		System.arraycopy(arr1, 0, arr3, 0, arr1.length);		//arr1 을 arr3에다가 복사.
		for (int i = 0; i < arr3.length; i++) {					//복사 되는 값이 객체의 번지이므로 참조하는 객체가 동일(얕은 복사(shallow copy)라고 함.
			System.out.print(arr3[i]);							//반면에 깊은 복사(deep copy)는 객체도 새로 생성.
		}System.out.println();
		System.arraycopy(arr2, 0, arr3, 3, arr2.length);	//arr3의 3번지 부터 arr2를 복사.
		for ( String item : arr3){							//확장 for문으로 출력
			System.out.println(item);
		}
		
	}
}

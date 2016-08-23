package Java_Impormation;

import java.util.Arrays;
import java.util.Scanner;



public class Word {																	 // <=== 클래스 명은 무조건 대문자로 시작[시작점] main 무조건 딱 1개
	public static void main(String[] args) {                                       // <===  main 메소드(메소드는 ()를 가짐)
																						// <== 메소드란 반복적으로 사용하는 것을 뽑아 호출할 수 있도록.
		//                                                              // <=== 주석은 컨트롤 + / 키로 간단히 가능(해제도 같은 키)
	     
		/*주석
		주석
		주석*/                                             			// <=== 블록 지정후 컨트롤+/ 키로 복수 자동 주석(해제는 컨트롤+\)
				
		System.out.println();															 // <=== print() ,   println(),    printf()
																						    //바로 입력   다음줄입력  자료형포맷
		
		Scanner sc = new Scanner(System.in);                                 // <== 나(Scanner)라는 것을 sc라는 그릇을 만드는 생성자 함수(메소드) (특수한 함수)
		int ex = new Scanner(System.in).nextInt();                           // <==== 한번에 사용가능.
		
		String strx = args[0];                                                  // <=== Scanner 를 사용 하지 않고 입력 받음.
		int x = Integer.parseInt(strx);                                      //<======     Integer.parseInt(*) - 스트링을 자동으로 Int 형으로 바꿈
		
		int y = Integer.parseInt(args[1]);                                 // <======    바로 사용가능.
		System.out.println(x + y);                                           // <======== Run configurations 에 들어가서 Arguments 에 값을 직접 입력
		System.out.println(x - y);                                                
		
//		UP :                                         								     // <=== UP 이라는 식별자를 만들어서 break; 를 저기로 바져나가게;;
//   break up ;                                                                     // <==== 사용법
			
		int[] arr = new int[10];                                           //<=== arr - 변수명 3은 공간 갯수
		int[] arr1 = {10 , 20, 30 ,40};                                   //<== 바로 초기값 설정
		for(int item : arr) { 															//<====  // 확장for문 for( 자료형 변수명 : 배열명 또는 콜렉션명){ 반복문;}
	 System.out.println(item + "\t");
 }
	Arrays.sort(arr1);                                                       //<===오름차순 정렬
	for(int item : arr)
	System.out.print(item + " ");
	
	int ran = (int)(Math.random()*100+1);                        //<== 랜덤 함수  *(최대값) + (최소값)  
	
	Day d = Day.valueOf(args[0]);								//열거형 타입 사용. 
	System.out.println(d.FRI);
	
	System.out.println(Integer.parseInt("15db9742", 16)); //10진수 값을 16진수로 변환
	} //main end
	enum Day{
		MON, TUES, WEDNES, THURS, FRI;					// 열거형 타입.
	}
	
	public static void add(int ... x){                              //<== 몇개가 들어오던 사용, 가변 길이
		int sum = 0;
		for (int i = 0; i < x.length; i++) {                       //<== length (그 길이 만큼)
			sum += x[i];
			System.out.print(x[i]+"\t" );//+ sum);
		
	}
		
		try {                                                        // <=== 문제 발견
			
		} catch (Exception e) {
			System.out.println(e.getMessage());                //  메세지끌어옴
			e.printStackTrace();                                  //   문제가 발생한 곳에 단계적으로 찾아서 출력

		}finally {                                                 // <== 정상이던 비정상이던 실행
			
		}
		
}
	

//	this                                      //자기 자신

	
	
}

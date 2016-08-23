package Class;
								//설계도의 개념.
								//클래스로부터 만들어진 객체를 해당 클래스의 인스턴스(instance)라고 함.
								//개발의 첫 단계 - 클래스를 설계 , 두 번째 - 클래스를 가지고 사용할 객체 생성. 세번째 - 생성된 객체 이용.
public class Class_Mean {		//클래스명은 하나 이상의 문자로, 첫 번째 글자는 숫자 금지.
								//특수문자는 $, _ 만 사용가능. 자바 키워드는 사용 불가능. 대소문자 구분.
								//한페이지 내 두개의 클래스가 있더라도 컴파일 하면 두개의 class파일이 각각 생성됨.
								//파일이름과 동일한 클래스명만 public 을 붙일 수 있다.
	//클래스 변수 = new 클래스      	//new 연산자로 객체 생성. 리턴된 객체의 주소를 변수에 저장 .
	 							// new연산자를 사용한 만큼 객체가 메모리에 생성. 이러한 객체들은 클래스의 인스턴스.
	Class_Mean c = new Class_Mean(); // - Class_Mean 클래스 타입의 변수 c를 생성하여, c에 new 연산자가 리턴한 객체의 주소를 저장.
								//단 하나의 main()메소드가 있는 클래스가 실행 클래스.
	
		int f;					// >>>>필드 - 객체의 데이터가 저장되는 곳., 변수와 비슷하지만, 변수는 생성자와 메소드 내에서만
								//			사용되고 생성자와 메소드가 실행 종료되면 자동 소멸되지만, 필드는 생성자와 메소드
								//			전체에서 사용되며 객체가 소멸되지 않는 한 객체와 함께 존재.
								//			생성자 및 메소드 내부에는 선언이 불가능함. 내부에 선언되는 것은 자동으로 로컬 변수가 됨.
								//			필드를 멤버 변수라고 부르기도 하며, 로컬 변수를 지역 변수로 부르기도함.
								// 			객체 생성시 자동으로 기본 초기값(0, 0.0, false, null)로 설정됨.
								//			변수와는 달리 생성자와 모든 메소드에서 사용이 가능.
		
		
		Class_Mean(){ }			// >>>>생성자 - 객체 생성 시 초기화 역할 담당 메소드와 비슷흐게 생격지만, 클래스 이름으로 되어 있고 리턴 타입이 없음.
								//			  new 연산자와 같이 사용되어 클래스로부터 객체를 생성할 때 호출되어 객체의 초기화를 담당.(필드 초기화,
								//			  메소드 호출로 인한 객체를 사용할 준비) 힙(heap)영역에 객체 생성후 객체의 주소가 리턴.
								//   		  주소는 클래스 타입의 변수에 저장되어 객체에 접근할 때 이용.
								//			  모든 클래스는 생성자가 반드시 존재하며, 하나 이상을 가짐. 생성자 선언을 생략했다면 컴파일러는
								//			  기본 생성자(Default Constructor)를 바이트 코드에 자동 추가.
		Class_Mean(String x){ }	//>생성자오버로딩 - 매개변수를 달리하는 생성자를 여러 개 선언하는 것.
		Class_Mean(String x, int y){ }//
		
		
		void methodname(){}		//>>>>메소드 - 객체의 동작에 해당하는 실행 블록 , 메소드는 객체 간의 데이터 전달의 수단으로 사용됨.
								//			  다양한 기능을 함. 메소드 선언부를 메소드 시그너처(signature)라고 함.
		void sum1(int[] values){}	// 매개변수의 값을 모를 경우 배열로 처리.
		void sum2(int ... values){}	// 위와 같은 결과. 가변
								//void 형태의 메소드 안에 return; 을 사용할 경우 메소드가 종료;
								//클래스 외부에서 호출할 경우에는 객체를 생성하여 호출.
								//메소드오버로딩 - 매개 변수의 타입, 개수, 순서 중 하나가 달라야 함. 매개값을 다양하게 받아 처리 할 수 있도록 하기 위함.			    
		
		
		//this.~                // 객체 자신의 참조.
		//this(매개변수, ..,)		// 자신의 다른 생성자를 호출하는 코드로 반드시 생성자의 첫줄에서만 허용. 생성자의 실행이 끝나면 원래 생성자로 돌아와서 다음 
								// 진행. 
		public static void main(String[] args) {
			Class_Mean c = new Class_Mean();
			c.sum1(new int[] {1,2,3});	// 배열 선언한 메소드 사용 방법.
			c.sum2(1,2,3);				// 가변 사용한 메소드 사용 방법.
		}
}


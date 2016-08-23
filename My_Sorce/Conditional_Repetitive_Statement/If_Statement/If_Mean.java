package If_Statement;

public class If_Mean {								//조건식의 결과에 따라 블록 실행 여부가 결정.
	public static void main(String[] args) {		//참,거짓이 올수 있는 연산식이나 boolean 변수가 올수 있음.
		int x = 0, y = 1;
		if (x==y) System.out.println("참");			//참이면 실행. 단일 문장이면 {}블록 생략 가능. 구분을 위해 {}블록 사용을 권장.
		else if (x!=y) {								//if 문의 조건이 false 면 else 문이 실행이 됨.
			System.out.println("거짓");
		}// else if( ){ }								//계속 이어서 else if 문을 사용 가능.
		
		if (x!=y) {
			if (x==1) {								//중첩 if문 사용 가능.
				System.out.println("중첩문");
			}
		}
		
		
	}

}

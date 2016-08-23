package Access_Modifier;

public class Access_Modifier_Mean {		// 클래스는  public, default 접근 제한자만 사용 가능.
	
													//public - 공개 ; 모든 클래스가 접근 가능. 클래스, 필드, 생성자, 메소드 모두 사용 가능
													//default - 기본 ; 같은 패키지에 소속된 클래스에서만 사용. 클래스, 필드, 생성자, 메소드 사용 가능
													//protected - 보호 ; 같은 패키지 또는 자식 클래스에서만 사용할 수 있는 접근 제한자. 필드, 생성자, 메소듬나 사용가능.
													//private - 비밀 ; 외부에 노출되지 않은, 모든 외부 클래스에서 접근 불가능. 필드, 생성자, 메소드만 사용 가능.
	
int x;			//defalut 필드
private void test(){} // private 매소드
protected Access_Modifier_Mean(){}  //protected 생성자.

}

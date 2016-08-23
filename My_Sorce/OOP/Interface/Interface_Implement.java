package Interface;

public class Interface_Implement implements Interface_Mean {
	public static void main(String[] args) {
		
		Interface_Mean m = Interface_Implement();
		m.test();
	}

	private static Interface_Mean Interface_Implement() {
		
		return null;
	}

	@Override							//추상메소드에 대한 실체 메소드들이 필요함.
	public void test1() {				//보통 기본 접근 제한이 public 이기 때문에 이보다 더 낮은 제한을 사용할 수 없음.
		
	}
	@Override							//인터페이스의 추상 메소드에 대한 정확한 실체 메소드인지 체크하도록 지시하는 어노테이션
	public void test2() {
		
	}
}
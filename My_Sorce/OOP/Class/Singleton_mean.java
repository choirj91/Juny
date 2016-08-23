package Class;

public class Singleton_mean  {	//단 하나의 객체만 만들도록 보장해야 하는 경우.
								//클래스 외부에서 new 연산자로 생성자를 호출할 수 없도록 막아야 함.(생성자를 호출한 만큼 객체가 생성되기 때문)
	private static Singleton_mean singleton = new Singleton_mean();
	private Singleton_mean(){System.out.println("싱글톤");}
	static Singleton_mean getIns(){
		return singleton;
	}
	
}
class test{
	public static void main(String[] args) {
		Singleton_mean i = Singleton_mean.getIns();
		Singleton_mean i1 = Singleton_mean.getIns();
		if (i == i1) {
			System.out.println("같음");
			
		}
		
	}
}

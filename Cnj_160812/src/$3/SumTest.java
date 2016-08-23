package $3;

public class SumTest {
	public static void main(String[] args) {
		int i = 10;
		int j = 20;
		
		MySum ms1 = new MySum(i, j);
		MySum ms2 = new MySum(i, j);
		
		System.out.println(ms1);
		
		if (ms1.equals(ms2)) {
			
			System.out.println("ms1 과 ms2의 합계는 동일합니다.");
		}	//if end
	} //main end
} //sumTest end



class MySum  {
	int first;
	int second;
	
	MySum (int first, int second){
		this.first = first;
		this.second = second;
	}
	

	
	@Override/* 2번 문제 */
	public String toString() {
		String result = String.valueOf(this.first + this.second);
		return result;
	}



	@Override
	public boolean equals(Object obj) {
		if (obj instanceof MySum) {
			
			return true;
		}else{
			return false;
		}
		
	}



	
	
	
}	//class MySum end



package Debug;

public class Debug_Mean {										//Debug 
																			//f8 키 = 다음 한단계 
	
	public static void main(String[] args) { // 시작점(진입점)

		int x = 5, y = 0;
		
		for (int i = 0; i < 6; i++) {
			y += x*i;
			
			System.out.print(x + "," + y + "," + i + "\t");                // 중단점 
			
		}
		
		
		
	}
}

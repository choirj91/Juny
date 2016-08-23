package Break_Continue;

public class Break_Continue_Mean {						// for , while, do-while 문과 같은 반복문에서 실행을 중지할 떄 사용. 또는 swich 문에서 사용.
	public static void main(String[] args) {
		boolean x = true;
		
		first : {
			System.out.println("1");
			second : {
				System.out.println("2");
					thr : {
					System.out.println("3");
					if(x)break second;			// 반복문 이외에 label 설정후 사용 가능. 하지만 반드시 if조건문을 통해서 break 사용;
				}System.out.println("4");		//break 는 가장 가까운 반복문만 종료되기 때문.
			}System.out.println("5");
		}System.out.println("6");
		
		
		test : for (int i = 0; i < args.length; i++) {   // label 은 {} 블록 없이 하나의 반복문에 걸어줄 수 있음.
			while (x) { break test;}
		} 
		
		for (int i = 0; i < 10; i++) {
			System.out.print("'" + i + "'");
			if (i % 2 ==0) {
				continue;							//continue 아래로 실행을 무시하고 바로 조건문으로 건너띔.		
			}
			System.out.print(i);
		}
		
	}

}

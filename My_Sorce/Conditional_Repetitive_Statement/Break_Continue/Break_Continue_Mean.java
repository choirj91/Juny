package Break_Continue;

public class Break_Continue_Mean {						// for , while, do-while ���� ���� �ݺ������� ������ ������ �� ���. �Ǵ� swich ������ ���.
	public static void main(String[] args) {
		boolean x = true;
		
		first : {
			System.out.println("1");
			second : {
				System.out.println("2");
					thr : {
					System.out.println("3");
					if(x)break second;			// �ݺ��� �̿ܿ� label ������ ��� ����. ������ �ݵ�� if���ǹ��� ���ؼ� break ���;
				}System.out.println("4");		//break �� ���� ����� �ݺ����� ����Ǳ� ����.
			}System.out.println("5");
		}System.out.println("6");
		
		
		test : for (int i = 0; i < args.length; i++) {   // label �� {} ��� ���� �ϳ��� �ݺ����� �ɾ��� �� ����.
			while (x) { break test;}
		} 
		
		for (int i = 0; i < 10; i++) {
			System.out.print("'" + i + "'");
			if (i % 2 ==0) {
				continue;							//continue �Ʒ��� ������ �����ϰ� �ٷ� ���ǹ����� �ǳʶ�.		
			}
			System.out.print(i);
		}
		
	}

}

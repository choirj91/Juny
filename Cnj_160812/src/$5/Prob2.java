package $5;

public class Prob2 {
	public static void main(String[] args) {
		int num = generateRandom();
		System.out.println("������ ���� : " + num);
		if (primeNumber(num)) {
			System.out.println("---> �Ҽ��Դϴ�.");
		} else {
			System.out.println("---> �Ҽ��� �ƴմϴ�.");
		}
	}

	private static int generateRandom() {
		int ran = (int)(Math.random()*100) +1;
		return ran;
	}

	private static boolean primeNumber(int num) {
		int count = 0;
		boolean tt ;
		for (int i = 1; i <= num; i++) {
			if ((num % i) == 0 || (num / i ) == num) {
				count ++;
			}else;
		}
		if (count == 2) {
			 tt = true;
		}else tt = false;
		return tt;
	}
}
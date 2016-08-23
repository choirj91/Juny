package Random;
/*
public class Random_Lottery {
	public static void main(String[] args) {
		int num[] = new int[6];
		
		for (int i = 0; i < 6; i++) {

			num[i] = (int) (Math.random() * 45) + 1; // 0 ~ 44 + 1

			for ( int j = 0; j < i; j++ ) { // 비교 - 중복 숫자
				if (num[j] == num[i]) {
					i--;
				}
			}
		}

		System.out.println("Luck Number : ");
		for (int lotto : num)
			System.out.print(lotto + "\t");
	}
}
//*/

/*

import java.util.Random;

public class Random_Lottery {
	public static void main(String[] args) {
		
		System.out.println("---------------------당첨 번호---------------------");
		int [] num = new int[6];
		
		for(int i =0; i<6 ; i++){
			num[i] = (int)(Math.random() *45 ) +1 ; // 0안나오게 하려고.....
			
			for(int j=0; j< i ;j++){
				
				while(num[i]==num[j]){
					num[i] = (int)(Math.random() *45 ) +1 ; 
					j=0;
				}	
			}
			System.out.print("\t"+"("+num[i]+")");	
		}
	} // main end
}
//*/

//*
public class Random_Lottery {
	
	static int[] lotto = new int[6];

	public static void main(String[] args) {

		for (int i = 1; i < 6; i++) {  
			System.out.print("lotto" + i + "번째 : " + "\t");
			for (int lo : makeLotto()) {
				System.out.print(lo + "\t");
				lo = 0;
			}
			System.out.println();
		}
	}// main

	public static int[] makeLotto() {

		for (int i = 0; i < lotto.length; i++) {
			lotto[i] = (int) (Math.random() * 45) + 1;
			for (int j = 0; j < i; j++) {
				if (lotto[i] == lotto[j]) {
					lotto[i] = (int) (Math.random() * 45) + 1;
					j = -1;
				} // end if
			}// j end
		} // i end
		return lotto;
	}
}// class
//*/

/*
public class Random_Lottery {

	public static void main(String[] args) {
		int[] res = new int[6];
		int temp = 0;
		
		for(int i = 0 ; i < 6 ; i ++){
			res[i] = (int)(Math.random()*45)+1;
			for(int j = 0; j < i; j++){
				if(res[i] == res[j]){
					i--;
					break;
				}
			}//j for
		}// i for
		
		for ( int i = 0 ; i < res.length ; i++){
			for(int j = i + 1; j < res.length ; j++){
				if(res[i] > res[j]){
					temp = res[i];
					res[i] = res[j];
					res[j] = temp;
				}
			}//j for
		}//i for
		
		for(int i = 0 ; i < 6 ; i++)
			System.out.println((i+1) + "번 숫자 : " + res[i]);

	} // end main
}
//*/

/*
import java.util.Random;

public class Random_Lottery {
	public static void main(String[] args) {
		int num = 45;
		Random r = new Random();
		int lotto[] = new int[6];

		for (int i = 0; i < lotto.length; i++)
			lotto[i] = r.nextInt(num);   

		again :  for (int i = 0; i < lotto.length; i++)
			for (int j = 0; j < lotto.length; j++) {
				if (i == j)
					continue again;
				while (lotto[i] == lotto[j])
					lotto[i] = r.nextInt(num);
		}

		for (int i = 0; i < lotto.length - 1; i++)
			for (int j = i + 1; j < lotto.length; j++)
				if (lotto[i] > lotto[j]) {
					int temp;
					temp = lotto[i];
					lotto[i] = lotto[j];
					lotto[j] = temp;
				}

		System.out.print("금주의 당첨 번호는 : " + "\t");

		for (int i = 0; i < lotto.length; i++)
			System.out.print(lotto[i] + 1 + "\t");
	} // main end
}
//*/

//*
/*import java.util.Random;

public class Random_Lottery {
	public static void main(String[] args) {
		int[] arr = new int[6];
		Random ran = new Random();

		for (int i = 0; i < arr.length; i++) {
			arr[i] = ran.nextInt(45) + 1; // 1 ~ 45

			for (int j = 0; j < arr.length; j++) {
				if (i == j)
					continue;
				if (i == 0)
					break;
				if (arr[i] == arr[j])
					i--;

			} // for j end
		} // for i end

		for (int j = 0; j < arr.length; j++) {
			System.out.print(arr[j] + "\t");
		} // for end

	} // main end
} // class end
*/
//*/

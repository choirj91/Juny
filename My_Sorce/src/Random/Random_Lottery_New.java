package Random;

public class Random_Lottery_New {
public static void main(String[] args) {
	int[] loto = new int[6];
	int index = 0 , temp;
	
	second : {
	for (int i = 0; i < 999; i++) {
		loto[index] = (int)(Math.random()*44)+1;
		first : {
		for (int j = 0; j < index; j++) {
			if (loto[index] != loto[j]) {
				continue ;
			} else break first;
			
			} //for end
		index ++;
		} // first
		if (index == 6) {
			break second ;
			}
		}//for end
	}//second
	for ( int i = 0 ; i < loto.length ; i++){
		for(int j = i + 1; j < loto.length ; j++){
			if( loto[i] >  loto[j]){
				temp =  loto[i];
				 loto[i] =  loto[j];
				 loto[j] =  temp;;
			}
		}//j for
	}//i for
	for (int i = 0; i < loto.length; i++) {
		System.out.print(loto[i] + " ");
		}
	}
}

package Sort;

public class Sort_Bubble {
public static void main(String[] args) {
	
	int bu[] = {10, 4, 8, 20, 1, 19 , 5};
	for (int i = 0; i < bu.length; i++) {
		for (int j = 0; j < bu.length-1; j++) {
			if (bu[j] > bu[j+1]) {
				int tmp = bu[j];
				bu[j] = bu[j+1];
				bu[j+1] = tmp;	
			}
		}
	}
	for (int i = 0; i < bu.length; i++) {
		System.out.print(bu[i] + "  ");
		}
	}
}

package Generic;

import java.util.Comparator;
import java.util.TreeSet;

public class ComparatorTest {  
	public static void main(String[] args) {
		TreeSet  set1 = new TreeSet();	//오름차순 정렬
		TreeSet  set2 = new TreeSet(new Desending());	
		
		int[] scores = { 91, 100, 95, 88, 70, 52, 60, 70 };
		for (int i = 0; i < scores.length; i++) {
			set1.add(new Integer(scores[i])); // 오름차순
			set2.add(new Integer(scores[i])); //내림차순
		}
		
		System.out.println("set1 : " + set1 );
		System.out.println("set2 : " + set2 );
	}
}

class Desending implements Comparator { //컴패러터

	@Override
	public int compare(Object o1, Object o2) {
		if( o1 instanceof Comparable && o2 instanceof Comparable) {
			Comparable c1 = (Comparable)o1;
			Comparable c2 = (Comparable)o2;
			
			return c1.compareTo(c2) * -1;    // -1을 곱해서 기본정렬방식으로 역으로 출력
		}													// c2.compareTo(c1) 와 같은 순서를 바꿔도 됨.
		return -1;
	}
	
}








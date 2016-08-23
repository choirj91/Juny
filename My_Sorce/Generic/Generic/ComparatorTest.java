package Generic;

import java.util.Comparator;
import java.util.TreeSet;

public class ComparatorTest {  
	public static void main(String[] args) {
		TreeSet  set1 = new TreeSet();	//�������� ����
		TreeSet  set2 = new TreeSet(new Desending());	
		
		int[] scores = { 91, 100, 95, 88, 70, 52, 60, 70 };
		for (int i = 0; i < scores.length; i++) {
			set1.add(new Integer(scores[i])); // ��������
			set2.add(new Integer(scores[i])); //��������
		}
		
		System.out.println("set1 : " + set1 );
		System.out.println("set2 : " + set2 );
	}
}

class Desending implements Comparator { //���з���

	@Override
	public int compare(Object o1, Object o2) {
		if( o1 instanceof Comparable && o2 instanceof Comparable) {
			Comparable c1 = (Comparable)o1;
			Comparable c2 = (Comparable)o2;
			
			return c1.compareTo(c2) * -1;    // -1�� ���ؼ� �⺻���Ĺ������ ������ ���
		}													// c2.compareTo(c1) �� ���� ������ �ٲ㵵 ��.
		return -1;
	}
	
}








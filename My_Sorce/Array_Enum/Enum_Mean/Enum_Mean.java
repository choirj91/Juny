package Enum_Mean;							//������ ������ ���� ������ Ÿ���� ���� Ÿ��(enumeration type)�̶�� ��.

import java.util.Calendar;

public class Enum_Mean {
	public static void main(String[] args) {
		Calendar now = Calendar.getInstance();		//�ð��� ��¥�� ��� �޼ҵ�.
		Enum_Ex today = Enum_Ex.THURSDAY;		//THURSDAY �� ���� ��ü.	���� ��ü�� ���� ����� ���ڿ��� ���� �����ͷ� ����.
		Enum_Ex today1 = Enum_Ex.FRIDAY;			//java.lang.Enum Ŭ������ ����� �޼ҵ���� ���� ��ü���� ��� ����.
		System.out.println(today == Enum_Ex.THURSDAY);	//���� ���� Enum_Ex ��ü�� ����.
		
		int year = now.get(Calendar.YEAR);				//Calendar �޼ҵ忡 �⵵�� ���Ϲ���.
		int year1 = now.getWeekYear();					//Calendar �޼ҵ忡 �⵵�� ���Ϲ���.
		System.out.println(year +" " + year1);
		
		String to = today.name(); 							// name()�� ���� ��ü�� ������ �ִ� ���ڿ��� ����. 
		String too = today1.name();
		int to1 = today.ordinal();							// ordinal()�� ��ü ���� ��ü �� �� ��° ���� ��ü���� �˷���.
		int compare = today.compareTo(today1); 		//���ķ� �� �� ° ��ġ�ϴ� �� ��. today1�� �������� ��ġ ����.
		Enum_Ex today2 = Enum_Ex.valueOf("FRIDAY");//���� ��ü�� ����.
		Enum_Ex[] today3 = Enum_Ex.values();			//�迭�� ����� ����
		System.out.println("ordinal ��� = " + to1 + "compare = " + compare + " valueOf ��� = " + today2 );
		for (Enum_Ex d : today3) {
			System.out.println(d);
		}
		
		
		
		
		
	}
}

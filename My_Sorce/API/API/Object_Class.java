package API;

public class Object_Class {		//Object �� ������� �ʾƵ� �⺻������ �ڵ����� ��ӵǱ� ������, ��� �޼ҵ� ��밡��.
	public static void main(String[] args) {
		
//=====================equals()	-	���ڿ��� �������� �����ϴ� �޼ҵ�.
		
		String str1 = new String("hh");
		String str2 = new String("hH");
		
		System.out.println(str1.equals(str2));						//��ҹ��� ����.
		System.out.println(str1.equalsIgnoreCase(str2));		//��ҹ��� ���� ����.

//=====================hashCode()	- ��ü �ؽ��ڵ�� ��ü�� �ĺ��� �ϳ��� �������� ����.
//														- hashCode() �޼ҵ�� ��ü�� �޸� ������ �̿��ؼ� �ؽ��ڵ带 ����� 
//														- �����ϱ� ������ ��ü���� �ٸ� ���� ������ ����.		
		
		System.out.println(str1.hashCode());
		System.out.println(str2.hashCode());		
		
//======================toString()  -  ��ü�� ���� ������ ����. ��ü�� ���� ������ ��ü�� ���ڿ��� ǥ���� ��.
//													      Ŭ������@16���� �ؽ��ڵ�� ������ ���� ���� ����.
//														  �� ����ġ�� ���� �����̹Ƿ� �������̵� �Ͽ� �����Ͽ� ���.
		Object_Class o = new Object_Class();
		System.out.println(o.toString());			//�������̵� �Ͽ� ���.
		str1.toString();
		
//======================StringBuffer() - 
		
	}
	
	public String toString(){			// �������̵� �Ͽ� ���.
		return "hi";
		
	}
}

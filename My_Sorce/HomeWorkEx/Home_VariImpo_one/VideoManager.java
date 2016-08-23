package Home_VariImpo_one;

import java.util.Date;
import java.util.HashMap;
import java.util.Set;

public class VideoManager extends Video{
	static HashMap<String, Video> map = new HashMap<String, Video>();
	static int top = 1;
	public static void main(String[] args) {
	
		while(true){
			System.out.print("<1>�������� �߰� <2>�뿩���� ��� <3>�뿩���� ���� <4>���� ���� <5>EXIT : ");
			switch(scan.nextInt()){
			case 1:
				insert();
				break;
			case 2:
				print();
				break;
			case 3:
				modify();
				break;
			case 4:
				delete();
				break;
			case 5:
				System.out.println("SEE YOU!!");
				System.exit(0);
				break;
			}//switch
			}//while
	}//main
	private static void modify() {
		System.out.print("�����Ͻ� ���� ������ �Է��� �ּ��� : ");
		String title = scan.next();
		String category = map.get(title).category;
		if(map.containsKey(title)){
			map.put(title, new Video(title, category));
			System.out.println("����Ǿ����ϴ�.");
		}else{
			System.out.println("���� ������ �߸��Է��ϼ̽��ϴ�. �ش� ������ �����ϴ�.");
		}
	}
	private static void delete() {
		System.out.print("�����Ͻ� ���� ������ �Է��� �ּ��� : ");
		String title = scan.next();
		if(map.containsKey(title)){
			map.remove(title);
			System.out.println("�����Ǿ����ϴ�.");
		}else{
			System.out.println("���� ������ �߸��Է��ϼ̽��ϴ�. �ش� ������ �����ϴ�.");
		}
		
	}
	private static void print() {
		System.out.println("�����ϰ� �ִ� ���� ���� : " + top);
		System.out.println("���� ����---�帣---�뿩����---�뿩��---�뿩��¥");
		Set<String> set = map.keySet();
		for( String video  :  set ){
			String title = map.get(video).title;
			String category = map.get(video).category;
			String lend = map.get(video).lend;
			if(lend.equalsIgnoreCase("y")){
				lend = "�뿩";
			}else{
				lend = "�뿩����";
			}
			String lendName = map.get(video).lendName;
			if(lendName==null){
				lendName = "���� ����";
			}
			String lendDate = map.get(video).lendDate;
			if(lendDate == null){
				lendDate = "���� ����";
			}
			System.out.println(title + "\t" + category + "\t" + lend +
					"\t" + lendName + "\t" + lendDate);
		}
		
	}
	private static void insert() {
		System.out.print("���� ������ �Է��ϼ��� : ");
		Date day = new Date();
		System.out.println(day.toString());
		String title = scan.next();
		System.out.print("�帣�� �Է��ϼ��� : ");
		String category = scan.next();
		map.put(title, new Video(title, category));
		top++;
	}
}//class

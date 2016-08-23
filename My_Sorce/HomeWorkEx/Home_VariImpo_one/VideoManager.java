package Home_VariImpo_one;

import java.util.Date;
import java.util.HashMap;
import java.util.Set;

public class VideoManager extends Video{
	static HashMap<String, Video> map = new HashMap<String, Video>();
	static int top = 1;
	public static void main(String[] args) {
	
		while(true){
			System.out.print("<1>비디오정보 추가 <2>대여정보 출력 <3>대여정보 수정 <4>비디오 삭제 <5>EXIT : ");
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
		System.out.print("변경하실 비디오 제목을 입력해 주세요 : ");
		String title = scan.next();
		String category = map.get(title).category;
		if(map.containsKey(title)){
			map.put(title, new Video(title, category));
			System.out.println("변경되었습니다.");
		}else{
			System.out.println("비디오 제목을 잘못입력하셨습니다. 해당 정보가 없습니다.");
		}
	}
	private static void delete() {
		System.out.print("삭제하실 비디오 제목을 입력해 주세요 : ");
		String title = scan.next();
		if(map.containsKey(title)){
			map.remove(title);
			System.out.println("삭제되었습니다.");
		}else{
			System.out.println("비디오 제목을 잘못입력하셨습니다. 해당 정보가 없습니다.");
		}
		
	}
	private static void print() {
		System.out.println("보유하고 있는 비디오 개수 : " + top);
		System.out.println("비디오 제목---장르---대여정보---대여자---대여날짜");
		Set<String> set = map.keySet();
		for( String video  :  set ){
			String title = map.get(video).title;
			String category = map.get(video).category;
			String lend = map.get(video).lend;
			if(lend.equalsIgnoreCase("y")){
				lend = "대여";
			}else{
				lend = "대여안함";
			}
			String lendName = map.get(video).lendName;
			if(lendName==null){
				lendName = "정보 없음";
			}
			String lendDate = map.get(video).lendDate;
			if(lendDate == null){
				lendDate = "정보 없음";
			}
			System.out.println(title + "\t" + category + "\t" + lend +
					"\t" + lendName + "\t" + lendDate);
		}
		
	}
	private static void insert() {
		System.out.print("비디오 제목을 입력하세요 : ");
		Date day = new Date();
		System.out.println(day.toString());
		String title = scan.next();
		System.out.print("장르를 입력하세요 : ");
		String category = scan.next();
		map.put(title, new Video(title, category));
		top++;
	}
}//class

package File_;

import java.io.File;
import java.io.IOException;
import java.util.Date;

public class FileInformation {
	public static void main(String[] args) throws IOException {
		File file = null;
		byte[] fileName = new byte[100];
		String strName;
		System.out.println("file name = " );	// 상대경로 : test.txt
													// 절대경로 : 주소모두
		
		System.in.read(fileName);
		strName = new String(fileName).trim();
		file = new File(strName);
		
		System.out.println(file.getName());
		
		System.out.println("절대경로 : " + file.getAbsolutePath());
		System.out.println("표준경로 : " + file.getCanonicalPath());
		System.out.println("최종 수정일 : " + new Date(file.lastModified())); //날짜 타입
		System.out.println("파일크기 : " + file.length()	+ "kb");
		System.out.println("읽기속성 : " + file.canRead());
		System.out.println("쓰기속성 : " + file.canWrite());
		System.out.println("파일경로 : " + file.getParent());
		System.out.println("숨김검사 : " + file.isHidden());
	}
}

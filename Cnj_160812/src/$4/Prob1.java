package $4;
 
public class Prob1 {
	public static void main(String[] args) {
		int seconds = 47567;
		System.out.println("<< " + seconds + " 초 변환 시간 >>");
		System.out.println(printTime(seconds));
		
		seconds = 11578;
		System.out.println("<< " + seconds + " 초 변환 시간 >>");
		System.out.println(printTime(seconds));
	}

	private static String printTime(int seconds) {
		String result;
		int si, bu, cho;
		si = seconds / 3600;
		bu = (seconds-(si*3600))/60;
		cho = (seconds - (si*3600) - (bu*60));
		result = si + "시  " + bu + "분  " + cho + " 초";
		return result;
	}
}
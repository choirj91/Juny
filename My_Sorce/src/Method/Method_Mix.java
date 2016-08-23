package Method;

import java.util.Scanner;

public class Method_Mix {
	public static void input() {
		Scanner sc = new Scanner(System.in);
		System.out.print("kor, eng, name : ");
		int kor = sc.nextInt();
		int eng = sc.nextInt();
		String name = sc.next();
		
		process(kor, eng, name);
	}
	
	public static void process(int kor, int eng, String name) {
		int sum = kor + eng;
		double avg = sum / 2.0;
		System.out.println(name + "님의 성적표!!!");
		output(avg);
	}
		
	/*public static void process(int kor, int eng, String name) {
		int sum = kor + eng;
		double avg = sum / 2.0;
		System.out.println(name + "님의 성적표!!!");
		output(avg);
	}*/
	
	public static void output(double avg) {
		switch((int) avg / 10 ){
			case 10 :
			case 9 : System.out.println("A 학점");  break;
			case 8 : System.out.println("B 학점");  break;
			case 7 : System.out.println("C 학점");  break;
			case 6 : System.out.println("D 학점");  break;
			default : System.out.println("F 학점");
		}
	}

	public static void main(String[] args) {
		input();
	}
}

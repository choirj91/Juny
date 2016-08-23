//*
package Generic;

import java.text.ChoiceFormat;

public class ChoiceFormatEx {
	public static void main(String[] args) {
		String pattern ="50#F|60#D|70#C|80#B|90#A";
		
		int[] scores = { 91, 100, 95, 88, 70, 52, 60, 70 };
		
		ChoiceFormat  form = new ChoiceFormat(pattern);
		for (int i = 0; i < scores.length; i++) {
			System.out.println(scores[i] + " : " + form.format(scores[i]));
		}
	}
}
//*/

/*
package ex03.text;

import java.text.ChoiceFormat;

public class ChoiceFormatEx {
	public static void main(String[] args) {
		double[] limits = { 60, 70, 80, 90 }; //낮은 값부터 큰 값의 순서로 적어줌
		String[] grades = { "D", "C", "B", "A" };
		
		int[] scores = { 100, 95, 88, 70, 52, 60, 70 };
		
		ChoiceFormat  form = new ChoiceFormat(limits, grades);
		for (int i = 0; i < scores.length; i++) {
			System.out.println(scores[i] + " : " + form.format(scores[i]));
		}
	}
}
//*/





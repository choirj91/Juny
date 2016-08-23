package Exception_value;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exception01 {
	public static void main(String[] args) {
		try {
			System.out.println("x = ");
			int x = new Scanner(System.in).nextInt();
			System.out.println("y = ");
			int y = new Scanner(System.in).nextInt();
		} catch (NullPointerException e) {

		} catch (InputMismatchException e) {

		} catch (Exception e) {
			// System.out.println("정수만 입력하렴..");
			// TODO: handle exception
			e.printStackTrace();
		}

	}

}

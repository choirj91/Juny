package Random;

import java.util.Scanner;

public class Random_Game {
public static void main(String[] args) {
	
	Scanner sc = new Scanner(System.in);
	int answer = (int)(Math.random()*99+1);
	int user;
	
	System.out.println("======UP , Down ����========");
	System.out.println("�⺻ �� = 1~100���� �Է� �� �� �־��. ");
	System.out.println("��ȸ�� �� 5�� �帮�ڽ��ϴ�. ");
	try {
		for (int i = 0; i <5; i++) {
			System.out.println("�ƹ� ���ڳ� �Է� �Ͻÿ�. ��ȸ�� " + (5-i) + "�� ���ҽ��ϴ�.");	user = sc.nextInt();
			if (user > answer) {
				System.out.println("���� ���� �Է� �ϼ̽��ϴ�.");
				
			}else if (user < answer) {
				System.out.println("���� ���� �Է� �ϼ̽��ϴ�");
				
			} else if (user == answer) {
				System.out.println("��... ����׿�... ���ڴ� " + answer + " �̾����ϴ�...");
				System.exit(0);
			}
			if (i == 4) {
				System.out.println("����� �����.");
				System.out.println("���ڴ� " + answer + " �̾����. �޷�. ");
				System.exit(0);
				
			}
			
		}
		
	} catch (Exception e) {
		e.printStackTrace();
		// TODO: handle exception
	} 
	finally {
		System.out.println("���ڸ� �ް��ϸ� �Է��Ͻñ�.");
		
	}
	
}
}

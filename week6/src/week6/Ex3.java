package week6;

import java.util.Scanner;

public class Ex3 {

	public static void main(String[] args) {
		do {
			String s;
			Scanner sc = new Scanner(System.in);
			System.out.print(">>");
			s = sc.nextLine();
			if (s.equals("�׸�")) {
				System.out.println("�����մϴ�...");
				sc.close();
				System.exit(0);
			}
			String[] words = s.split(" ");
			System.out.println("���� ������ " + words.length);
		} while (true);
	}

}

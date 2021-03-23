package ex3;

import java.util.*;

public class Ex_4 {

	public static void main(String[] args) {
		DicApp dicapp = new DicApp();
		dicapp.run();
	}

}

class Dictionary {
	private static String[] kor = { "���", "�Ʊ�", "��", "�̷�", "���" };
	private static String[] eng = { "love", "baby", "money", "future", "hope" };

	public static String kor2Eng(String word) {
		for (int i = 0; i < kor.length; i++) {
			if (word.equals(kor[i])) {
				return eng[i];
			}
		}
		return null;
	}
}

class DicApp {

	public void run() {
		Scanner sc = new Scanner(System.in);
//		System.out.println("�ѿ� �ܾ� �˻� ���α׷��Դϴ�.");
		while (true) {
			System.out.print("�ѱ� �ܾ�?");
			String word = sc.next();
			if (word.equals("�׸�")) {
				sc.close();
				System.exit(0);
			} else if (Dictionary.kor2Eng(word) == null)
				System.out.println(word + "�� ���� ������ �����ϴ�.");
			else {
				System.out.println(getPostPosition(word, "��", "��")+" " + Dictionary.kor2Eng(word));
			}
		}

	}

	public static final String getPostPosition(String name, String firstValue, String secondValue) {
		char lastName = name.charAt(name.length() - 1);

		
		if (lastName < 0xAC00 || lastName > 0xD7A3) {
			return name;
		}

		String seletedValue = (lastName - 0xAC00) % 28 > 0 ? firstValue : secondValue;

		return name + seletedValue;
	}
}
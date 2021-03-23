package ex3;

import java.util.*;

public class Ex_4 {

	public static void main(String[] args) {
		DicApp dicapp = new DicApp();
		dicapp.run();
	}

}

class Dictionary {
	private static String[] kor = { "사랑", "아기", "돈", "미래", "희망" };
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
//		System.out.println("한영 단어 검색 프로그램입니다.");
		while (true) {
			System.out.print("한글 단어?");
			String word = sc.next();
			if (word.equals("그만")) {
				sc.close();
				System.exit(0);
			} else if (Dictionary.kor2Eng(word) == null)
				System.out.println(word + "는 저의 사전에 없습니다.");
			else {
				System.out.println(getPostPosition(word, "은", "는")+" " + Dictionary.kor2Eng(word));
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
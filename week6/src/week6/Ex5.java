package week6;

import java.util.*;

public class Ex5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print(">>");
		String main = sc.nextLine();
		StringBuffer mainSb = new StringBuffer(main);
		while (true) {
			System.out.print("���: ");
			String excute = sc.nextLine();
			if (excute.equals("�׸�")) {
				System.out.println("�����մϴ�.");
				break;
			}
			
			String[] excute_split = excute.split("!");
			if(excute_split.length != 2) {
				System.out.println("�߸��� ����Դϴ�!");
				continue;
			}
			if (excute_split[0].equals("")||excute_split[1].equals(null)) {
				System.out.println("�߸��� ����Դϴ�!");
				continue;
			}
			int index = mainSb.indexOf(excute_split[0]);
			if (index == -1) {
				System.out.println("ã�� �� �����ϴ�!");
				continue;
			}
			mainSb.replace(index, index + excute_split[0].length(), excute_split[1]);
			System.out.println(mainSb.toString());

		}
		sc.close();
	}

}

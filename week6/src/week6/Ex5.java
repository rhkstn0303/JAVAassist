package week6;

import java.util.*;

public class Ex5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print(">>");
		String main = sc.nextLine();
		StringBuffer mainSb = new StringBuffer(main);
		while (true) {
			System.out.print("명령: ");
			String excute = sc.nextLine();
			if (excute.equals("그만")) {
				System.out.println("종료합니다.");
				break;
			}
			
			String[] excute_split = excute.split("!");
			if(excute_split.length != 2) {
				System.out.println("잘못된 명령입니다!");
				continue;
			}
			if (excute_split[0].equals("")||excute_split[1].equals(null)) {
				System.out.println("잘못된 명령입니다!");
				continue;
			}
			int index = mainSb.indexOf(excute_split[0]);
			if (index == -1) {
				System.out.println("찾을 수 없습니다!");
				continue;
			}
			mainSb.replace(index, index + excute_split[0].length(), excute_split[1]);
			System.out.println(mainSb.toString());

		}
		sc.close();
	}

}

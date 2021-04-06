package week6;
import java.util.*;

public class Ex2 {

	public static void main(String[] args) {
		while (true) {
			String s;
			Scanner sc = new Scanner(System.in);
			sc.nextLine();
			System.out.print(">>");
			s = sc.nextLine();
			if (s.equals("그만")) {
				System.out.println("종료합니다...");
				sc.close();
				System.exit(0);
			}
			StringTokenizer st = new StringTokenizer(s, " ");

			System.out.println("어절 개수는 " + st.countTokens());
		}
	}

}

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
			if (s.equals("�׸�")) {
				System.out.println("�����մϴ�...");
				sc.close();
				System.exit(0);
			}
			StringTokenizer st = new StringTokenizer(s, " ");

			System.out.println("���� ������ " + st.countTokens());
		}
	}

}

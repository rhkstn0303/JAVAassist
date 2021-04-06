package week6;
import java.util.*;
public class Ex4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("문자열을 입력하세요. 빈 칸이나 있어도 되고 영어 한글 모두 됩니다.");
		String s = sc.nextLine();
		StringBuffer sb = new StringBuffer(s);
		int n = s.length();
		for(int i=0; i<n;i++) {
			sb.append(sb.charAt(0));
			sb.delete(0, 1);
			System.out.println(sb);
		}

	}

}

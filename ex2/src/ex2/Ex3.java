package ex2;
import java.util.*;
public class Ex3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("소문자 알파벳 하나를 입력하시오>>");
		String x = sc.next();
		char alp = x.charAt(0);
		while(true) {
			if(alp >= 'a' && alp <= 'z') {
				break;
			}
			else {
				System.out.print("잘못 입력했습니다. 다시 입력하시오>>");
				x = sc.next();
				alp = x.charAt(0);
			}
		}
		char ct = alp;
		for(char a1 ='a'; a1 <= alp; a1++, ct--) {
			for(char a2 = 'a'; a2 <= ct; a2++ ) {
				System.out.print(a2);
			}
			System.out.print("\n");
		}
	}

}

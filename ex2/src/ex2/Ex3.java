package ex2;
import java.util.*;
public class Ex3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("�ҹ��� ���ĺ� �ϳ��� �Է��Ͻÿ�>>");
		String x = sc.next();
		char alp = x.charAt(0);
		while(true) {
			if(alp >= 'a' && alp <= 'z') {
				break;
			}
			else {
				System.out.print("�߸� �Է��߽��ϴ�. �ٽ� �Է��Ͻÿ�>>");
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

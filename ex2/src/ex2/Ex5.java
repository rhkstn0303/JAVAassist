package ex2;
import java.util.*;

public class Ex5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String course[] = {"Java", "C++", "HTML5", "��ǻ�ͱ���", "�ȵ���̵�"};
		int score[] = {95, 88, 76, 62, 55};
		Scanner sc = new Scanner(System.in);
		String a;
		while(true) {
			System.out.print("���� �̸�>>");
			a = sc.next();
			if(a.equals("�׸�")) {
				break;
			}
			for(int i=0; i < course.length;i++) {
				if(course[i].equals(a)) {
					System.out.println(course[i]+"�� ������ "+score[i]);
					break;
				}
				else if(i==course.length-1) {
					System.out.println("���� �����Դϴ�.");
				}
			}
		}
	}

}

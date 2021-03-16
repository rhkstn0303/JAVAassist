package ex2;
import java.util.*;

public class Ex5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String course[] = {"Java", "C++", "HTML5", "컴퓨터구조", "안드로이드"};
		int score[] = {95, 88, 76, 62, 55};
		Scanner sc = new Scanner(System.in);
		String a;
		while(true) {
			System.out.print("과목 이름>>");
			a = sc.next();
			if(a.equals("그만")) {
				break;
			}
			for(int i=0; i < course.length;i++) {
				if(course[i].equals(a)) {
					System.out.println(course[i]+"의 점수는 "+score[i]);
					break;
				}
				else if(i==course.length-1) {
					System.out.println("없는 과목입니다.");
				}
			}
		}
	}

}

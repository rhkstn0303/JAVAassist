package ex2;
import java.util.*;
public class Ex6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a=0,b=0;
		while(true) {
		System.out.print("���ϰ��� �ϴ� �� �� �Է�>>");
		try {
			a=sc.nextInt();
			b=sc.nextInt();
		}catch(InputMismatchException e) {
			System.out.println("�Ǽ��� �Է��ϸ� �ȵ˴ϴ�.");
			sc.nextLine();
			continue;
		}
		int result = a * b;
		System.out.println(a+"x"+b+"="+result);
		break;
		}
	}

}

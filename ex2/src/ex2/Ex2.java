package ex2;
import java.util.*;
public class Ex2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int x;
		
		while(true) {
		System.out.print("정수를 입력하시오>>");
		x = sc.nextInt();
		if(x>0) {
			break;
		}
		else {
			System.out.print("잘못 입력했습니다. ");
		}
		}
		
		for(int i = 0 ; i< x; i++) {
			for(int j=x; j > i;j--) {
				System.out.print("*");
			}
			System.out.print("\n");
		}
	}

}

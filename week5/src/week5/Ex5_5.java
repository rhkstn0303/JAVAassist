package week5;
import java.util.*;
public class Ex5_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("두 정수와 연산자를 입력하시오>>");
		int a = sc.nextInt();
		int b = sc.nextInt();
		String c = sc.next();
		switch (c.charAt(0)) {
		case '+':
			Add ad = new Add(a,b);
			
			System.out.println(ad.calculate());
			break;
		case '-':
			Sub sb = new Sub(a,b);
			
			System.out.println(sb.calculate());
			break;

		case '*':
			Mul ml = new Mul(a,b);
			
			System.out.println(ml.calculate());
			break;
		case '/':
			if(a==0 || b==0) {
				System.out.println("계산할 수 없습니다.");
				System.exit(0);
			}
			
			Div dv = new Div(a,b);
			System.out.println(dv.calculate());
			break;
		default:
			System.out.println("잘못된 연산자입니다.");
			break;
		}
		sc.close();
	}

}
abstract class Calc { // 추상 클래스
	 	int a, b;
	 	void setValue(int a, int b) {
	 		this.a = a;
			this.b = b;
	 	}
	 	abstract int calculate();
	}
	class Add extends Calc {
		public Add(int a, int b) {
			setValue(a,b);
		}
		int calculate() {
			return a+b;
		}
	}
	class Mul extends Calc {
		public Mul(int a, int b) {
			setValue(a,b);
		}
		int calculate() {
			return a*b;
		}
	}
	class Sub extends Calc {
		public Sub(int a, int b) {
			setValue(a,b);
		}
		int calculate() {
			return a-b;
		}
	}
	class Div extends Calc {
		public Div(int a, int b) {
			setValue(a,b);
		}
		int calculate() {
			return a/b;
		}
	}

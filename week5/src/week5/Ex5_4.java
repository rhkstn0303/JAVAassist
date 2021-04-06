package week5;
import java.util.Scanner;

public class Ex5_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StackApp.run();
	}

}

interface Stack {
	int length(); // 현재 스택에 저장된 개수 리턴

	int capacity(); // 스택의 전체 저장 가능한 개수 리턴

	String pop(); // 스택의 톱(top)에 실수 저장

	boolean push(String val); // 스택의 톱(top)에 저장된 실수 리턴
}

class StringStack implements Stack {
	private int capacity;
	private int top=-1;
	private String stack[];
	public StringStack(int c) {
		capacity = c;
		stack = new String[c];
	}
	public int length() {
		return top;
	}

	public int capacity() {
		return capacity; 
	}

	public String pop() {
		return stack[top--];
		
	}

	public boolean push(String val) {
		if(top == capacity-1) {
			return false;}
		else {
			top++;
			stack[top] = val;
			return true;
		}
	}
}

class StackApp {
	public static void run() {
		Scanner sc = new Scanner(System.in);
		System.out.print("총 스택 저장 공간의 크기 입력 >> ");
		String push;
		int cap = sc.nextInt();
		StringStack Stack = new StringStack(cap);
		while(true) {
			System.out.print("문자열 입력 >> ");
			push = sc.next();
			if(push.equals("그만")) {
				System.out.print("스택에 저장된 모든 문자열 팝 : ");
				for(int i=0; i<cap;i++) {
					System.out.print(Stack.pop()+" ");
					
				}
				System.exit(0);
			}
			if (!Stack.push(push)) {
				System.out.println("스택이 꽉 차서 푸시 불가!");
				
			}
		}
	}
}

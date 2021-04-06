package week5;
import java.util.Scanner;

public class Ex5_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StackApp.run();
	}

}

interface Stack {
	int length(); // ���� ���ÿ� ����� ���� ����

	int capacity(); // ������ ��ü ���� ������ ���� ����

	String pop(); // ������ ��(top)�� �Ǽ� ����

	boolean push(String val); // ������ ��(top)�� ����� �Ǽ� ����
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
		System.out.print("�� ���� ���� ������ ũ�� �Է� >> ");
		String push;
		int cap = sc.nextInt();
		StringStack Stack = new StringStack(cap);
		while(true) {
			System.out.print("���ڿ� �Է� >> ");
			push = sc.next();
			if(push.equals("�׸�")) {
				System.out.print("���ÿ� ����� ��� ���ڿ� �� : ");
				for(int i=0; i<cap;i++) {
					System.out.print(Stack.pop()+" ");
					
				}
				System.exit(0);
			}
			if (!Stack.push(push)) {
				System.out.println("������ �� ���� Ǫ�� �Ұ�!");
				
			}
		}
	}
}

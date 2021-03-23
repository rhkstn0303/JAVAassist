package ex3;

import java.util.Scanner;

public class Ex_3_test{
  public static void main(String [] arg) {
    PhoneBook phonebook = new PhoneBook();
    phonebook.run();
  }
}
class Phone {
	private String name;
	private String tel;
	
	public Phone(String name, String tel) {
		this.name = name; 
		this.tel = tel;
	}
	public String getName() {
		return name;
		
	}
	public String getTel() {
		return tel;
	}
}

class PhoneBook{
	private Scanner sc = new Scanner(System.in);;
	private Phone [] pArray;
	public PhoneBook() {
		int m;
		String name;
		String tel;
		while(true) {
		System.out.print("�ο���>>");
		m = sc.nextInt();
		if (m>0) break;
		}
		pArray = new Phone[m];
		for(int i=0; i<m; i++) {
			System.out.print("�̸��� ��ȭ��ȣ(�̸��� ��ȣ�� �� ĭ���� �Է�)>>");
			name = sc.next();
			tel = sc.next();
			pArray[i] = new Phone(name, tel);
		}
		
		System.out.println("����Ǿ����ϴ�...");
		
	}
	public void run() {
		String s_name;
		while (true) {
			System.out.print("�˻��� �̸�>>");
			s_name = sc.next();
			String result_name = search(s_name);
			if (result_name == null) {
				System.out.println(s_name + " �� �����ϴ�.");
			} else if (result_name.equals("0")) {
				System.exit(0);
			} else {
				System.out.println(s_name + "�� ��ȣ�� " + result_name + " �Դϴ�.");
			}
		}
	}

	public String search(String name) {

		for (int i = 0; i < pArray.length; i++) {
			if (pArray[i].getName().equals(name))
				return pArray[i].getTel();
			else if(name.equals("�׸�")) {
				return "0";
			}
		}
		return null;
	}

}
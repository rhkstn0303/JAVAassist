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
		System.out.print("인원수>>");
		m = sc.nextInt();
		if (m>0) break;
		}
		pArray = new Phone[m];
		for(int i=0; i<m; i++) {
			System.out.print("이름과 전화번호(이름과 번호는 빈 칸없이 입력)>>");
			name = sc.next();
			tel = sc.next();
			pArray[i] = new Phone(name, tel);
		}
		
		System.out.println("저장되었습니다...");
		
	}
	public void run() {
		String s_name;
		while (true) {
			System.out.print("검색할 이름>>");
			s_name = sc.next();
			String result_name = search(s_name);
			if (result_name == null) {
				System.out.println(s_name + " 이 없습니다.");
			} else if (result_name.equals("0")) {
				System.exit(0);
			} else {
				System.out.println(s_name + "의 번호는 " + result_name + " 입니다.");
			}
		}
	}

	public String search(String name) {

		for (int i = 0; i < pArray.length; i++) {
			if (pArray[i].getName().equals(name))
				return pArray[i].getTel();
			else if(name.equals("그만")) {
				return "0";
			}
		}
		return null;
	}

}
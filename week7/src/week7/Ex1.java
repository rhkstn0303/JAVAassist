package week7;

import java.util.*;

public class Ex1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("����(-1�� �Էµ� ������)>> ");
		Vector<Integer> v = new Vector<Integer>();
		int n = 0;
		while (true) {
			n = sc.nextInt();
			if (n == -1) {
				break;
			}
			v.add(n);
		}
		printBig(v);
		sc.close();
	}
	public static void printBig(Vector<Integer> v) {
		
		
		if (v.size()!=0) {
			int big = v.get(0);
			for (int i=0 ; i<v.size();i++) {
				if (big < v.get(i)) {
					big = v.get(i);
				}
			}
			System.out.println("���� ū ���� " + big); // ���� ū ���� ���� big�� ����Ǿ� �ִٰ� ������ ���
		} else {
			System.out.println("���� �ϳ��� ����");
		}
	}
//	public static void printBig(Vector<Integer> v) {
//		int big = 0;
//		Iterator<Integer> it = v.iterator();
//		if (it.hasNext()) {
//			while (it.hasNext()) {
//				if (big < it.next()) {
//					big = it.next();
//				}
//			}
//			System.out.println("���� ū ���� " + big); // ���� ū ���� ���� big�� ����Ǿ� �ִٰ� ������ ���
//		} else {
//			System.out.println("���� �ϳ��� ����");
//		}
//	}

}

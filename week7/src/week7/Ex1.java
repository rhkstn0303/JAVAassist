package week7;

import java.util.*;

public class Ex1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수(-1이 입력될 때까지)>> ");
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
			System.out.println("가장 큰 수는 " + big); // 가장 큰 수가 변수 big에 저장되어 있다고 가정한 경우
		} else {
			System.out.println("수가 하나도 없음");
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
//			System.out.println("가장 큰 수는 " + big); // 가장 큰 수가 변수 big에 저장되어 있다고 가정한 경우
//		} else {
//			System.out.println("수가 하나도 없음");
//		}
//	}

}

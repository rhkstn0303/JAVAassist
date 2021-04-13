package week7;
import java.util.*;
public class Ex2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Vector<Integer> v = new Vector<Integer>();
		while (true) {
			System.out.print("강수량 입력 (0 입력시 종료)>> ");
			int n = sc.nextInt();
			if(n==0) {
				break;
			}
			v.add(n);
			print(v);
			
		}
		sc.close();
	}
	public static void print(Vector<Integer> v){
		int sum=0;
        for(int i=0;i<v.size();i++) {
        	System.out.print(v.get(i)+" ");
        	sum += v.get(i);
        }
        System.out.println("\n현재 평균 "+sum/v.size());
    }

}

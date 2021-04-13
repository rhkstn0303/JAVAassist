package week7;
import java.util.*;

public class Ex3 {

	public static void main(String[] args) {
		System.out.println("** 포인트 관리 프로그램입니다 **");
		Scanner sc = new Scanner(System.in);
		HashMap<String,Integer> map = new HashMap<String, Integer>();
		while(true) {
			String name;
			int point;
			System.out.print("이름과 포인트 입력>> ");
			name = sc.next();
			if(name.equals("그만"))break;
			point = sc.nextInt();
			if(map.containsKey(name)) {
				point+=map.get(name);
			}
			map.put(name, point);

			Set<String> keys = map.keySet();
			Iterator<String> it = keys.iterator();
			
			while(it.hasNext()) {
				String key = it.next();
				System.out.print("("+key+", "+map.get(key)+")");
			}
			System.out.println("");
			
		}
		sc.close();

	}

}

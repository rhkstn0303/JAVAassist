package week7;
import java.util.*;

public class Ex3 {

	public static void main(String[] args) {
		System.out.println("** ����Ʈ ���� ���α׷��Դϴ� **");
		Scanner sc = new Scanner(System.in);
		HashMap<String,Integer> map = new HashMap<String, Integer>();
		while(true) {
			String name;
			int point;
			System.out.print("�̸��� ����Ʈ �Է�>> ");
			name = sc.next();
			if(name.equals("�׸�"))break;
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

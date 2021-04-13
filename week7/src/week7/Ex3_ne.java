package week7;
import java.util.*;
public class Ex3_ne{
	public static void main(String[] args) {
		CustomerManager man = new CustomerManager();
		man.run();
	}
}
class CustomerManager{
  	private HashMap<String, Integer> map = new HashMap<String, Integer>();
	private Scanner sc = new Scanner(System.in);
  
  	public void run() {
  		System.out.println("** ����Ʈ ���� ���α׷��Դϴ� **");
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
			printAll();
		}
      
    }
  	void printAll() {  
  		Set<String> keys = map.keySet();
		Iterator<String> it = keys.iterator();
		
		while(it.hasNext()) {
			String key = it.next();
			System.out.print("("+key+", "+map.get(key)+")");
		}
		System.out.println("");
    }
}
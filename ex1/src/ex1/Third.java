package ex1;
import java.util.*;


public class Third {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Input the firest coordination(x1, y1)>> ");
		int x1= sc.nextInt(), y1 = sc.nextInt();
		System.out.print("Input the second coordination(x1, y1)>> ");
		int x2= sc.nextInt(), y2 = sc.nextInt();
		
		if((x1 < 100 && x2 < 100) || (x1 > 100 && y1 < 100 && y2 < 100) || (x1 >= 200 && x2 >= 200) || (y1 >= 200 && y2 >= 200) ) {
			System.out.println("NO");
			
		}else {
			System.out.println("yes");
		}
		
		sc.close();
	}

}

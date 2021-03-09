package ex1;
import java.util.*;

public class Exchanger {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Input money>> ");
		int principal = sc.nextInt();
		int x = 0;
		
		x = principal / 50000;
		principal %= 50000;
		if(x !=0 ) {
		System.out.println(x + " 50,000won bill(s)\n");
		}
		
		x = principal / 10000;
		principal %= 10000;
		if(x !=0 ) {
		System.out.println(x + " 10,000won bill(s)\n");
		}
		x = principal / 1000;
		principal %= 1000;
		if(x !=0 ) {
		System.out.println(x + " 1,000won bill(s)\n");}
		
		x = principal / 500;
		principal %= 500;
		if(x !=0 ) {
		System.out.println(x + " 500won coin(s)\n");}
		
		x = principal / 100;
		principal %= 100;
		if(x !=0 ) {
		System.out.println(x + " 100won coin(s)\n");}
		
		x = principal / 50;
		principal %= 50;if(x !=0 ) {
		System.out.println(x + " 50won coin(s)\n");}
		
		x = principal / 10;
		principal %= 10;
		if(x !=0 ) {
		System.out.println(x + " 10won coin(s)\n");}
		if(principal !=0 ) {
		System.out.println(principal + " 1won coin(s)\n");}
		
		sc.close();
	}
	
}

package ex1;
import java.util.*;


public class Calculator {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Input a equation >> ");
		float a = sc.nextFloat();
		String x = sc.next();
		float b = sc.nextFloat();
		float result = 0;
		
		switch(x) {
		case "+":
			result = a+b;
			break;
			
		case "-":
			result = a-b;
			break;
			
		case "*":
			result = a*b;
			break;
			
		case "/":
			if(a==0||b==0) {
				System.out.println("Cannot divide by 0");
				System.exit(0);
			}
			else {
				result = a / b;
				break;
			}
		}
		
		System.out.println(a+" "+x+" "+b+" = "+result);

		sc.close();
	}

}

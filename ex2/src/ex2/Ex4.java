package ex2;

public class Ex4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=1;i<100;i++) {
			int n = i / 10, n2 = i %10;
			if((n == 3 && (n2 == 3 || n2 == 6 || n2 == 9))||(n == 6 && (n2 == 3 || n2 == 6 || n2 == 9))||(n == 9 && (n2 == 3 || n2 == 6 || n2 == 9))) {
				System.out.println(i+" ¹Ú¼ö Â¦Â¦");
			}
			else if(n == 3 || n == 6 || n == 9 ||n2 == 3 || n2 == 6 || n2 == 9) {
				System.out.println(i+" ¹Ú¼ö Â¦");
				
			}
		}
	}

}

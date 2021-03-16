package ex2;

public class Ex1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int intn[][] = {{1}, {1,2,3}, {1}, {1,2,3,4}, {1,2}};
		
		for(int i = 0; i< intn.length; i++) {
			for(int j = 0; j< intn[i].length; j++) {
				System.out.print(intn[i][j]+" ");
			}
			System.out.print("\n");
		}
	}

}

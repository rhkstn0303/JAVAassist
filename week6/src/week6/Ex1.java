package week6;

public class Ex1 {

	public static void main(String[] args) {
		Circle a = new Circle(2, 3, 5);
	    Circle b = new Circle(2, 3, 20);
	    System.out.println("원 a : " + a);
	    System.out.println("원 b : " + b);
	    if(a.equals(b)) System.out.println("같은 원");
	    else System.out.println("서로 다른 원");
	}

}

class Circle{
	private int x,y,r;
	public Circle(int a, int b, int c) {
		x = a;
		y = b; 
		r = c;
	}
	public boolean equals(Circle se) {
		if(se.x==this.x && se.y==this.y) {
			return true;
		}
		else
			return false;
	}
	public String toString() {
		return getClass().getName() + "("+x+","+y+")"+"반지름"+r;
	}
}
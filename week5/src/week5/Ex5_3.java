package week5;

public class Ex5_3 {

	public static void main(String[] args) {
		ColorPoint zeroPoint = new ColorPoint(); // BLACK 색에 (0,0) 위치의 점
	    System.out.println(zeroPoint.toString() + "입니다.");
	    ColorPoint cp = new ColorPoint(10, 10);
	    cp.setXY(5, 5);
	    cp.setColor("RED");
	    System.out.println(cp.toString() + "입니다.");

	}

}

class Point {
  private int x, y;
  public Point(int x, int y) { this.x = x; this.y = y; }
  public int getX() { return x; }
  public int getY() { return y; }
  protected void move(int x, int y) { this.x = x; this.y = y; }
}

class ColorPoint extends Point{
	private String Color;
	public ColorPoint() {
		super(0,0);
		Color = "BLACK";
	}
	public ColorPoint(int a, int b) {
		super(a,b);
	}
	public void setXY(int a, int b) {
		super.move(a, b);
	}
	public void setColor(String a) {
		this.Color = a;
	}
	public String toString() {
		return Color+"색의 ("+getX()+","+getY()+")의 점";
	}
}
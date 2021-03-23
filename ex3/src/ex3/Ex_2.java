package ex3;

import java.util.*;

public class Ex_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x, y, w, h;
		Scanner scanner = new Scanner(System.in);
		Rectangle t = new Rectangle(1, 1, 10, 10);
		x = scanner.nextInt();
		y = scanner.nextInt();
		w = scanner.nextInt();
		h = scanner.nextInt();
		Rectangle r = new Rectangle(x, y, w, h);
		x = scanner.nextInt();
		y = scanner.nextInt();
		w = scanner.nextInt();
		h = scanner.nextInt();
		Rectangle s = new Rectangle(x, y, w, h);
		r.show();
		System.out.println("s�� ������ " + s.square());
		if (t.contains(r))
			System.out.println("t�� r�� �����մϴ�.");
		if (t.contains(s))
			System.out.println("t�� s�� �����մϴ�.");
	}

}

class Rectangle {
	public int x, y, width, height;

	public Rectangle(int x, int y, int w, int h) {
		this.x = x;
		this.y = y;
		this.width = w;
		this.height = h;
	}

	public int square() {
		return width * height;
	}

	public void show() {
		System.out.println("(" + x + "," + y + ")" + "���� ũ�Ⱑ " + width + "x" + height + "�� �簢��");
	}

	public Boolean contains(Rectangle r) {
		if (this.x < r.x && this.y < r.y && this.x + this.width > r.x + r.width
				&& this.y + this.height > r.y + r.height)
			return true;
		else
			return false;
	}
}

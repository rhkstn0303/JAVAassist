package week7;
import java.util.*;
public class Ex4 {

	public static void main(String[] args) {
		GraphicEditor ge = new GraphicEditor("beauty");
	    ge.run();
	}

}
class GraphicEditor {
	private String editorName;
	private Scanner scanner = new Scanner(System.in);
	private Vector<Shape> v = new Vector<Shape>();
	
	public GraphicEditor(String editorName) {
		this.editorName = editorName;
	}
	
	public void run() {
		System.out.println("�׷��� ������ "+editorName+"�� �����մϴ�.");
		while (true) {
			System.out.print("����(1), ����(2), ��� ����(3), ����(4)>>");
			int command = scanner.nextInt();
			switch (command) {
			case 1:
				System.out.print("Line(1), Rect(2), Circle(3)>>");
				int ch = scanner.nextInt();
				if(ch>3) {
					System.out.println("�߸� �����ϼ̽��ϴ�.");
					break;
				}
				insert(ch);
				break;

			case 2:
				System.out.print("������ ������ ��ġ>>");
				int index = scanner.nextInt();
				if(!delete(index)) {
					System.out.println("������ �� �����ϴ�.");
				}
				break;

			case 3:
				view();
				break;

			case 4:
				System.out.println(editorName+"�� �����մϴ�.");
				scanner.close();
				return;
				
			default:
				System.out.println("�߸� �����ϼ̽��ϴ�.");
				break;
			}
		}
	}

	private void view() {
		for(int i=0; i<v.size(); i++) v.get(i).draw();
	}
	
	private boolean delete(int index) {
		if (v.size() == 0 || index >= v.size()) // ����Ʈ�� ��ų�, �ε����� ������ ���� ���
			return false;
		v.remove(index);
		return true;
	}

	private void insert(int choice) {
		Shape shape=null;
		switch (choice) {
			case 1: // Line
				shape = new Line();
				 break;
			case 2: // Rect
				shape = new Rect();
				break;
			case 3: // Circle
				shape = new Circle();
				break;

		}
		v.add(shape);
	}
}

abstract class Shape {
	private Shape next;
	public Shape() { next = null;}
	public void setNext(Shape obj) {next = obj;} // ��ũ ����
	public Shape getNext() {return next;}
	public abstract void draw();
}

class Circle extends Shape {
	public void draw() {
		 System.out.println("Circle");
	}
}
class Line extends Shape {
	public void draw() {
		 System.out.println("Line");
	}
}
class Rect extends Shape {
	public void draw() {
		 System.out.println("Rect");
	}
}


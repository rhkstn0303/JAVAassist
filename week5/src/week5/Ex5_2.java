//package week5;
//import java.util.*;
//
//public class Ex5_2 {
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		Km2Mile toMile = new Km2Mile(1.6);
//	    toMile.run();
//	}
//
//}
//
//abstract class Converter {
//	abstract protected double convert(double src);
//
//	abstract protected String getSrcString();
//
//	abstract protected String getDestString();
//
//	protected double ratio;
//
//	public void run() {
//		Scanner scanner = new Scanner(System.in);
//		System.out.println(getSrcString() + "�� " + getDestString() + "�� �ٲߴϴ�.");
//		System.out.print(getSrcString() + "�� �Է��ϼ���>>");
//		double val = scanner.nextDouble();
//		double res = convert(val);
//		System.out.println("��ȯ ���: " + res + getDestString() + "�Դϴ�.");
//		scanner.close();
//	}
//}
//
//class Km2Mile extends Converter{
//	public Km2Mile(double ratio) {
//		super.ratio = ratio;
//	}
//	protected double convert(double src) {
//		return src/ratio;
//	}
//	protected String getSrcString() {
//		return "Km";
//	}
//	protected String getDestString() {
//		return "Mile";
//	}
//}
//package week5;
//import java.util.Scanner;
//
//public class Test5 {
//    public static void main(String[] args) {
//        Scanner sin = new Scanner(System.in);
//        System.out.print("�� ������ �����ڸ� �Է��Ͻÿ�>>");
//        int a = sin.nextInt();
//        int b = sin.nextInt();
//        String operator = sin.next();
//
//        Calc cal = getCalc(operator);
//        if (cal == null) {
//            System.out.println("�߸��� �������Դϴ�.");
//            return;
//        }
//        cal.setValue(a, b);
//        try {
//            System.out.println(cal.calculate());
//        } catch (ArithmeticException e) {
//            System.out.println("����� �� �����ϴ�.");
//        }
//    }
//
//    private static Calc getCalc(String operator) {
//        switch(operator) {
//            case "+":
//                return new Add();
//            case "-":
//                return new Sub();
//            case "*":
//                return new Mul();
//            case "/":
//                return new Div();
//            default:
//                return null;
//        }
//    }
//}
//
//abstract class Calc {
//    protected int a, b;
//
//    public final void setValue(int a, int b) {
//        this.a = a;
//        this.b = b;
//    }
//
//    protected abstract int calculate();
//}
//
//class Add extends Calc {
//
//    @Override
//    public int calculate() {
//        return a + b;
//    }
//}
//
//class Sub extends Calc {
//
//    @Override
//    public int calculate() {
//        return a - b;
//    }
//}
//
//class Mul extends Calc {
//
//    @Override
//    public int calculate() {
//        return a * b;
//    }
//}
//
//class Div extends Calc {
// 
//	@Override
//    public int calculate() {
//        return a / b;
//    }
//}
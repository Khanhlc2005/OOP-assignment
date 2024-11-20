import java.util.Scanner;

public class E1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap a: ");
        int a = sc.nextInt();
        System.out.println("Nhap b: ");
        int b = sc.nextInt();
        if (a == 0 || b == 0)
            try {
                System.out.println("a/b= " + (a / b));
                System.out.println("b/a= " + (b / a));
            } catch (ArithmeticException e) {
                throw new ArithmeticException("Cannot divided by 0");
            }
        else {
            System.out.println("a/b= " + (a / b));
            System.out.println("b/a= " + (b / a));
        }
    }
}
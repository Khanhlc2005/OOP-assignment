import java.util.Scanner;

public class E10 {
    public static int timUCLN(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhap so thu nhat: ");
        int a = scanner.nextInt();

        System.out.print("Nhap so thu hai: ");
        int b = scanner.nextInt();

        System.out.println("Uoc so chung lon nhat cua" + a + "va " + b + "la \n" + timUCLN(a, b));

        scanner.close();
    }
}
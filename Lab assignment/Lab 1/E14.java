import java.util.Scanner;

public class E14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhap N: ");
        int n = scanner.nextInt();

        // In tam giac
        for (int i = 1; i <= n; i++) {
            for (int k = 1; k <= (n - i); k++)
                System.out.print(" ");
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        scanner.close();
    }
}
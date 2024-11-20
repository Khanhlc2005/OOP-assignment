import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so hinh: ");
        int n = Integer.parseInt(sc.nextLine());
        Rectangle[] hinh = new Rectangle[n];
        for (int i = 0; i < n; i++) {
            hinh[i] = new Rectangle();
            hinh[i].input();
            System.out.println(hinh[i].toString());
        }
    }
}

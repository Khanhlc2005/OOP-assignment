
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] canh = new int[4];
        System.out.println("Nhap do dai canh: ");
        for (int i = 0; i < 3; i++)
            canh[i] = sc.nextInt();
        TamGiac tamgiac = new TamGiac(canh);
        tamgiac.chuVi();
        tamgiac.dienTich();
        tamgiac.inThongTin();
    }
}

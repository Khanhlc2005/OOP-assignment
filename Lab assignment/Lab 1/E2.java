import java.util.Scanner;

public class E2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhap diem Toan: ");
        double toan = scanner.nextDouble();

        System.out.print("Nhap diem Ly: ");
        double ly = scanner.nextDouble();

        System.out.print("Nhap diem Hoa: ");
        double hoa = scanner.nextDouble();

        double diemTrungBinh = (toan + ly + hoa) / 3;
        String xepHang;

        if (diemTrungBinh >= 8.0) {
            xepHang = "A";
        } else if (diemTrungBinh >= 6.5) {
            xepHang = "B";
        } else if (diemTrungBinh >= 5.0) {
            xepHang = "C";
        } else {
            xepHang = "D";
        }

        System.out.println("Diem trung binh: \n" + diemTrungBinh);
        System.out.println("Xep hang: " + xepHang);

        scanner.close();
    }
}
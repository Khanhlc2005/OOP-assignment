import java.util.Scanner;

public class E9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhap thang (1-12): ");
        int thang = scanner.nextInt();

        int soNgay;
        switch (thang) {
            case 2:
                soNgay = 28; // Gia su nam khong nhuan
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                soNgay = 30;
                break;
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                soNgay = 31;
                break;
            default:
                System.out.println("Thang khong hop le!");
                scanner.close();
                return;
        }

        System.out.println("Thang " + thang + " co" + soNgay + " ngay");
        scanner.close();
    }
}
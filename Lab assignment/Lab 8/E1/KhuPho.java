
import java.util.Scanner;

public class KhuPho {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhap so ho dan trong khu pho: ");
        int n = sc.nextInt();
        sc.nextLine();
        HoDan[] hoDans = new HoDan[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Nhap thong tin ho thu " + (i + 1) + ":");
            System.out.print("So thanh vien: ");
            int soThanhVien = sc.nextInt();
            System.out.print("So nha: ");
            int soNha = sc.nextInt();
            sc.nextLine();
            hoDans[i] = new HoDan(soThanhVien, soNha);
            hoDans[i].nhapThongTin(sc);
        }

        System.out.println("\nCac ho dan co nguoi tren 80 tuoi: ");
        for (HoDan hoDan : hoDans) {
            if (hoDan.coNguoi80Tuoi()) {
                hoDan.hienThiThongTin();
            }
        }

        sc.close();
    }
}
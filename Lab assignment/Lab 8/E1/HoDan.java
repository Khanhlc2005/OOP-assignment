
import java.util.Scanner;

public class HoDan {
    private int soThanhVien;
    private int soNha;
    private Nguoi[] thanhVien;

    public HoDan(int soThanhVien, int soNha) {
        this.soThanhVien = soThanhVien;
        this.soNha = soNha;
        this.thanhVien = new Nguoi[soThanhVien];
    }

    public void nhapThongTin(Scanner sc) {
        for (int i = 0; i < soThanhVien; i++) {
            System.out.println("Nhap thong tin thanh vien " + (i + 1) + ":");
            System.out.print("Ho va ten: ");
            String hoTen = sc.nextLine();
            System.out.print("Ngay sinh: ");
            String ngaySinh = sc.nextLine();
            System.out.print("Nghe nghiep: ");
            String ngheNghiep = sc.nextLine();
            thanhVien[i] = new Nguoi(hoTen, ngaySinh, ngheNghiep);
        }
    }

    public boolean coNguoi80Tuoi() {
        for (Nguoi n : thanhVien) {
            if (n.getTuoi() == 80) {
                return true;
            }
        }
        return false;
    }

    public void hienThiThongTin() {
        System.out.println("So nha: " + soNha);
        for (Nguoi n : thanhVien) {
            System.out.println(n);
        }
    }
}
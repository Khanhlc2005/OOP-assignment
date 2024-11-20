import java.util.Scanner;

class SinhVien {
    String maSinhVien;
    String hoTen;
    int tuoi;
    String gioiTinh;

    public SinhVien(String ma, String ten, int tuoi, String gioiTinh) {
        this.maSinhVien = ma;
        this.hoTen = ten;
        this.tuoi = tuoi;
        this.gioiTinh = gioiTinh;
    }

    public void hienThiThongTin() {
        System.out.println("\nThong tin sinh vien:");
        System.out.println("Ma so: " + maSinhVien);
        System.out.println("Ho ten: " + hoTen);
        System.out.println("Tuoi: " + tuoi);
        System.out.println("Gioi tinh: " + gioiTinh);
    }
}
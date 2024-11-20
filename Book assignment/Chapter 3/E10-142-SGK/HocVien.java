
import java.util.Scanner;

public abstract class HocVien {
    protected String hoTen;
    protected String diaChi;
    protected String loaiChuongTrinh;
    protected char loaiUuTien;

    public HocVien() {
        this.diaChi = "";
        this.hoTen = "";
        this.loaiChuongTrinh = "";
    }

    public HocVien(String diaChi, String hoTen, String loaiChuongTrinh) {
        this.diaChi = diaChi;
        this.hoTen = hoTen;
        this.loaiChuongTrinh = loaiChuongTrinh;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public String getLoaiChuongTrinh() {
        return loaiChuongTrinh;
    }

    public void setLoaiChuongTrinh(String loaiChuongTrinh) {
        this.loaiChuongTrinh = loaiChuongTrinh;
    }

    public char getLoaiUuTien() {
        return loaiUuTien;
    }

    public void setLoaiUuTien(char loaiUuTien) {
        this.loaiUuTien = loaiUuTien;
    }

    public void nhapThongTin() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap ho va ten: ");
        setHoTen(sc.nextLine());
        System.out.println("Nhap dia chi: ");
        setDiaChi(sc.nextLine());
        System.out.println("Nhap loai chuong trinh: ");
        setLoaiChuongTrinh(sc.nextLine());
        System.out.println("Nhap loai uu tien: ");
        setLoaiUuTien(sc.next().charAt(0));
    }

    public abstract double hocPhi();

    public String inThongTin() {
        return "Ho va ten: " + getHoTen()
                + "\nDia chi: " + getDiaChi()
                + "\nLoai chuong trinh: " + getLoaiChuongTrinh()
                + "\nLoai uu tien: " + getLoaiUuTien();
    }
}
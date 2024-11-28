
import java.util.Scanner;

public abstract class CongNhan {
    protected String hoTen;
    protected String diaChi;
    protected String loaiCongNhan;

    public CongNhan() {
        this.diaChi = "";
        this.hoTen = "";
        this.loaiCongNhan = "";
    }

    public CongNhan(String diaChi, String hoTen, String loaiCongNhan) {
        this.diaChi = diaChi;
        this.hoTen = hoTen;
        this.loaiCongNhan = loaiCongNhan;
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

    public String getLoaiCongNhan() {
        return loaiCongNhan;
    }

    public void setLoaiCongNhan(String loaiCongNhan) {
        this.loaiCongNhan = loaiCongNhan;
    }

    public void nhapThongTin() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap ho va ten: ");
        setHoTen(sc.nextLine());
        System.out.println("Nhap dia chi: ");
        setDiaChi(sc.nextLine());
        System.out.println("Nhap loai cong nhan: ");
        setLoaiCongNhan(sc.nextLine());
    }

    public abstract double tinhLuong();

    public String inThongTin() {
        return "Ho va ten: " + getHoTen()
                + "\nDia chi: " + getDiaChi()
                + "\nLoai lao dong: " + getLoaiCongNhan()
                + "\nLuong thang: " + tinhLuong();
    }
}
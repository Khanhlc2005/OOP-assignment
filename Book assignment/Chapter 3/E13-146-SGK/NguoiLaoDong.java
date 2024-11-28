
import java.util.Scanner;

public abstract class NguoiLaoDong {
    protected String hoTen;
    protected String diaChi;
    protected String loaiLaoDong;

    public NguoiLaoDong() {
        this.diaChi = "";
        this.hoTen = "";
        this.loaiLaoDong = "";
    }

    public NguoiLaoDong(String diaChi, String hoTen, String loaiLaoDong) {
        this.diaChi = diaChi;
        this.hoTen = hoTen;
        this.loaiLaoDong = loaiLaoDong;
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

    public String getLoaiLaoDong() {
        return loaiLaoDong;
    }

    public void setLoaiLaoDong(String loaiLaoDong) {
        this.loaiLaoDong = loaiLaoDong;
    }

    public void nhapThongTin() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap ho va ten: ");
        setHoTen(sc.nextLine());
        System.out.println("Nhap dia chi: ");
        setDiaChi(sc.nextLine());
        System.out.println("Nhap loai lao dong: ");
        setLoaiLaoDong(sc.nextLine());
    }

    public abstract double tinhLuong();

    public String inThongTin() {
        return "Ho va ten: " + getHoTen()
                + "\nDia chi: " + getDiaChi()
                + "\nLoai lao dong: " + getLoaiLaoDong();
    }
}
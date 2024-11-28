
import java.util.Scanner;

public abstract class GiangVien {
    // Attribute
    protected String hoTen;
    protected int ngaySinh;
    protected String diaChi;

    // Constructor
    public GiangVien() {
        this.hoTen = "";
        this.ngaySinh = 0;
        this.diaChi = "";
    }

    public GiangVien(String hoTen, int ngaySinh, String diaChi) {
        this.hoTen = hoTen;
        this.ngaySinh = ngaySinh;
        this.diaChi = diaChi;
    }

    // Setter
    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public void setNgaySinh(int ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    // Getter
    public String getHoTen() {
        return hoTen;
    }

    public int getNgaySinh() {
        return ngaySinh;
    }

    public String getDiaChi() {
        return diaChi;
    }

    // tinhLuong method
    public abstract double tinhLuong();

    // nhapThongTin method
    public void nhapThongTin() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap ho va ten: ");
        setHoTen(sc.nextLine());
        System.out.println("Nhap ngay sinh: ");
        setNgaySinh(Integer.parseInt(sc.nextLine()));
        System.out.println("Nhap dia chi: ");
        setDiaChi(sc.nextLine());
    }

    // inThongTin method
    public String inThongTin() {
        return "Ho va ten: " + hoTen
                + "\nNgay sinh: " + ngaySinh
                + "\nDia chi: " + diaChi;
    }
}
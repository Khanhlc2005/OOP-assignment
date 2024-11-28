import java.util.Scanner;

public class GiangVienThinhGiang extends GiangVien {
    // Attribute
    protected int soTiet;
    protected int donGia;

    // Constructor
    public GiangVienThinhGiang() {
        super();
    }

    public GiangVienThinhGiang(String hoTen, int ngaySinh, String diaChi, int soTiet, int donGia) {
        super(hoTen, ngaySinh, diaChi);
        this.soTiet = soTiet;
        this.donGia = donGia;
    }

    // Setter
    public void setSoTiet(int soTiet) {
        this.soTiet = soTiet;
    }

    public void setDonGia(int donGia) {
        this.donGia = donGia;
    }

    // Getter
    public int getSoTiet() {
        return soTiet;
    }

    public int getDonGia() {
        return donGia;
    }

    // tinhLuong method
    @Override
    public double tinhLuong() {
        double luongThang = (1 - (15 / 100)) * (soTiet * donGia);
        return luongThang;
    }

    // nhapThongTin method
    @Override
    public void nhapThongTin() {
        Scanner sc = new Scanner(System.in);
        super.nhapThongTin();
        System.out.println("Nhap so tiet day: ");
        setSoTiet(Integer.parseInt(sc.nextLine()));
        System.out.println("Nhap don gia: ");
        setDonGia(Integer.parseInt(sc.nextLine()));
    }

    // inThongTin method
    @Override
    public String inThongTin() {
        return super.inThongTin()
                + "\nSo tiet day: " + soTiet
                + "\nDon gia: " + donGia;
    }
}

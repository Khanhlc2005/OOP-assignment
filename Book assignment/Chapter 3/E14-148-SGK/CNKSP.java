import java.util.Scanner;

public class CNKSP extends CongNhan {
    protected int soSanPham;
    protected int donGia;

    public CNKSP() {
        super();
        this.donGia = 0;
        this.soSanPham = 0;
    }

    public CNKSP(int donGia, int soSanPham, String diaChi, String hoTen, String loaiLaoDong) {
        super(diaChi, hoTen, loaiLaoDong);
        this.donGia = donGia;
        this.soSanPham = soSanPham;
    }

    public int getSoSanPham() {
        return soSanPham;
    }

    public void setSoSanPham(int soSanPham) {
        this.soSanPham = soSanPham;
    }

    public int getDonGia() {
        return donGia;
    }

    public void setDonGia(int donGia) {
        this.donGia = donGia;
    }

    @Override
    public double tinhLuong() {
        if (soSanPham < 1000)
            return soSanPham * donGia;
        else if (soSanPham < 1150)
            return soSanPham * donGia + 1000000;
        else
            return soSanPham * donGia + 1500000;
    }

    @Override
    public void nhapThongTin() {
        Scanner sc = new Scanner(System.in);
        super.nhapThongTin();
        System.out.println("Nhap so san pham: ");
        setSoSanPham(Integer.parseInt(sc.nextLine()));
        System.out.println("Nhap don gia ngay cong: ");
        setDonGia(Integer.parseInt(sc.nextLine()));
    }

    @Override
    public String inThongTin() {
        return super.inThongTin()
                + "\nSo ngay cong: " + getSoSanPham()
                + "\nDon gia ngay cong: " + getDonGia()
                + "\nLuong thang: " + tinhLuong();
    }
}

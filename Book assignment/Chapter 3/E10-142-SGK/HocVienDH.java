
import java.util.Scanner;

public class HocVienDH extends HocVien {
    protected int maSV;
    protected double soBuoi;
    protected double donGia;

    public HocVienDH() {
        super();
        this.maSV = 0;
        this.soBuoi = 0;
        this.donGia = 0.0;
    }

    public HocVienDH(String diaChi, String hoTen, String loaiChuongTrinh, int maSV, int soBuoi, double donGia) {
        super(diaChi, hoTen, loaiChuongTrinh);
        this.maSV = maSV;
        this.soBuoi = soBuoi;
        this.donGia = donGia;
    }

    public int getMaSV() {
        return maSV;
    }

    public void setMaSV(int maSV) {
        this.maSV = maSV;
    }

    public double getSoBuoi() {
        return soBuoi;
    }

    public void setSoBuoi(double soBuoi) {
        this.soBuoi = soBuoi;
    }

    public double getDonGia() {
        return donGia;
    }

    public void setDonGia(double donGia) {
        this.donGia = donGia;
    }

    @Override
    public double hocPhi() {
        switch (loaiUuTien) {
            case '1':
                return soBuoi * donGia - 1000000;
            case '2':
                return soBuoi * donGia - 500000;
            default:
                System.out.println("Error");
                return 0;
        }
    }

    @Override
    public void nhapThongTin() {
        Scanner sc = new Scanner(System.in);
        super.nhapThongTin();
        System.out.println("Nhap ma sinh vien: ");
        setMaSV(Integer.parseInt(sc.nextLine()));
        System.out.println("Nhap so buoi: ");
        setSoBuoi(Integer.parseInt(sc.nextLine()));
        System.out.println("Nhap don gia: ");
        setDonGia(Integer.parseInt(sc.nextLine()));
    }

    @Override
    public String inThongTin() {
        return super.inThongTin()
                + "\nMa sinh vien: " + getMaSV()
                + "\nSo buoi: " + soBuoi
                + "\nDon gia: " + donGia
                + "\nHoc phi: " + hocPhi();
    }

}

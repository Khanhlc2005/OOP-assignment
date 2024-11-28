import java.util.Scanner;

public class GiangVienCoHuu extends GiangVien implements PhuCap {
    // Attribute
    protected int maGV;
    protected int luongCoBan;
    protected int hsLuong;
    protected int soNamCongTac;

    // Constructor
    public GiangVienCoHuu() {
        super();
    }

    public GiangVienCoHuu(String hoTen, int ngaySinh, String diaChi, int luongCoBan, int hsLuong, int soNamCongTac,
            int maGV) {
        super(hoTen, ngaySinh, diaChi);
        this.luongCoBan = luongCoBan;
        this.hsLuong = hsLuong;
        this.soNamCongTac = soNamCongTac;
        this.maGV = maGV;
    }

    // Setter
    public void setLuongCoBan(int luongCoBan) {
        this.luongCoBan = luongCoBan;
    }

    public void setHsLuong(int hsLuong) {
        this.hsLuong = hsLuong;
    }

    public void setSoNamCongTac(int soNamCongTac) {
        this.soNamCongTac = soNamCongTac;
    }

    public void setMaGV(int maGV) {
        this.maGV = maGV;
    }

    // Getter
    public int getLuongCoBan() {
        return luongCoBan;
    }

    public int getHsLuong() {
        return hsLuong;
    }

    public int getSoNamCongTac() {
        return soNamCongTac;
    }

    public int getMaGV() {
        return maGV;
    }

    // phuCap method
    @Override
    public double phuCap() {
        double phucap;
        if (soNamCongTac < 5)
            return phucap = 0;
        else
            return phucap = (soNamCongTac / 100) * luongCoBan;
    }

    // tinhLuong method
    @Override
    public double tinhLuong() {
        double luongThang = (luongCoBan * hsLuong) + phuCap();
        return luongThang;
    }

    // nhapThongTin method
    @Override
    public void nhapThongTin() {
        Scanner sc = new Scanner(System.in);
        super.nhapThongTin();
        System.out.println("Nhap luong co ban: ");
        setLuongCoBan(Integer.parseInt(sc.nextLine()));
        System.out.println("Nhap he so luong: ");
        setHsLuong(Integer.parseInt(sc.nextLine()));
        System.out.println("Nhap so nam cong tac: ");
        setSoNamCongTac(Integer.parseInt(sc.nextLine()));
        System.out.println("Nhap ma giang vien: ");
        setMaGV(Integer.parseInt(sc.nextLine()));
    }

    // inThongTin method
    @Override
    public String inThongTin() {
        return super.inThongTin()
                + "\nLuong co ban: " + luongCoBan
                + "\nHe so luong: " + hsLuong
                + "\nSo nam cong tac: " + soNamCongTac
                + "\nMa giang vien: " + maGV;
    }
}

import java.util.Scanner;

public class LaoDongPhoThong extends NguoiLaoDong {
    protected int soNgayCong;
    protected int donGia;

    public LaoDongPhoThong() {
        super();
        this.donGia = 0;
        this.soNgayCong = 0;
    }

    public LaoDongPhoThong(int donGia, int soNgayCong, String diaChi, String hoTen, String loaiLaoDong) {
        super(diaChi, hoTen, loaiLaoDong);
        this.donGia = donGia;
        this.soNgayCong = soNgayCong;
    }

    public int getSoNgayCong() {
        return soNgayCong;
    }

    public void setSoNgayCong(int soNgayCong) {
        this.soNgayCong = soNgayCong;
    }

    public int getDonGia() {
        return donGia;
    }

    public void setDonGia(int donGia) {
        this.donGia = donGia;
    }

    @Override
    public double tinhLuong() {
        if (soNgayCong <= 15)
            return soNgayCong * donGia;
        else if (soNgayCong < 25)
            return soNgayCong * donGia + 700000;
        else
            return soNgayCong * donGia + 1000000;
    }

    @Override
    public void nhapThongTin() {
        Scanner sc = new Scanner(System.in);
        super.nhapThongTin();
        System.out.println("Nhap so ngay cong: ");
        setSoNgayCong(Integer.parseInt(sc.nextLine()));
        System.out.println("Nhap don gia ngay cong: ");
        setDonGia(Integer.parseInt(sc.nextLine()));
    }

    @Override
    public String inThongTin() {
        return super.inThongTin()
                + "\nSo ngay cong: " + getSoNgayCong()
                + "\nDon gia ngay cong: " + getDonGia()
                + "\nLuong thang: " + tinhLuong();
    }
}

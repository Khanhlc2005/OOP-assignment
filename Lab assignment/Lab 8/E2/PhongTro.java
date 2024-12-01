class PhongTro {
    private Khach khach;
    private int soNgayTro;
    private String loaiPhong;
    private double giaPhong;

    public PhongTro(Khach khach, int soNgayTro, String loaiPhong, double giaPhong) {
        this.khach = khach;
        this.soNgayTro = soNgayTro;
        this.loaiPhong = loaiPhong;
        this.giaPhong = giaPhong;
    }

    public Khach getKhach() {
        return khach;
    }

    public double tinhTien() {
        return soNgayTro * giaPhong;
    }

    @Override
    public String toString() {
        return khach + ", So ngay tro: " + soNgayTro + ", Loai phong: " + loaiPhong + ", Gia phong: " + giaPhong;
    }
}

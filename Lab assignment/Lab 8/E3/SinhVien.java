class SinhVien {
    private String hoTen;
    private String maSV;
    private String ngaySinh;
    private String lop;

    public SinhVien(String hoTen, String maSV, String ngaySinh, String lop) {
        this.hoTen = hoTen;
        this.maSV = maSV;
        this.ngaySinh = ngaySinh;
        this.lop = lop;
    }

    @Override
    public String toString() {
        return "Ho va ten: " + hoTen + ", MSV: " + maSV + ", Ngay sinh: " + ngaySinh + ", Lop: " + lop;
    }
}
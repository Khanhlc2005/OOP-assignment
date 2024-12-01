class Khach {
    private String hoTen;
    private String ngaySinh;
    private String soCMND;

    public Khach(String hoTen, String ngaySinh, String soCMND) {
        this.hoTen = hoTen;
        this.ngaySinh = ngaySinh;
        this.soCMND = soCMND;
    }

    public String getSoCMND() {
        return soCMND;
    }

    @Override
    public String toString() {
        return "Ho va ten: " + hoTen + ", Ngay sinh: " + ngaySinh + ", So CMND: " + soCMND;
    }
}
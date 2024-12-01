class TheMuon {
    private String soPhieuMuon;
    private String ngayMuon;
    private String hanTra;
    private String soHieuSach;
    private SinhVien sinhVien;

    public TheMuon(String soPhieuMuon, String ngayMuon, String hanTra, String soHieuSach, SinhVien sinhVien) {
        this.soPhieuMuon = soPhieuMuon;
        this.ngayMuon = ngayMuon;
        this.hanTra = hanTra;
        this.soHieuSach = soHieuSach;
        this.sinhVien = sinhVien;
    }

    public boolean canTraCuoiThang() {
        return hanTra.endsWith("-12-2024");
    }

    @Override
    public String toString() {
        return sinhVien + ", So phieu muon: " + soPhieuMuon + ", Ngay muon: " + ngayMuon + ", Han tra: " + hanTra
                + ", So hieu khach: " + soHieuSach;
    }
}

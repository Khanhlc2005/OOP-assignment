public class BenhNhan extends  Nguoi{
    
    //Attribute
    private String tiensu;
    private String chanDoan;
    private BenhVien benhVien;

    //Constructors
    public BenhNhan(){
        super.setTen("");
        super.setTuoi(0);
        super.setgioiTinh('M');
        this.tiensu = "";
        this.chanDoan = "";
    }
    public BenhNhan(String ten, int tuoi, char gioiTinh, String tiensu, String chanDoan){
        super(ten, tuoi, gioiTinh);
        this.tiensu = tiensu;
        this.chanDoan = chanDoan;;
    }

    //Setter
    public void setTiensu(String tiensu){
        this.tiensu = tiensu;
    }
    public void setChanDoan(String chanDoan){
        this.chanDoan = chanDoan;
    }

    //Getter
    public String getTiensu(){
        return tiensu;
    }
    public String getChandoan(){
        return chanDoan;
    }

    //toString
    public String toString(){
        //Object
        benhVien = new BenhVien("Benh vien da khoa", "123 chua Lang", "Khanh");
        System.out.println(benhVien.toString());
        return "Ten: " + getTen() + "\nTuoi: " +  getTuoi() + "\nGioi tinh: " + getgioiTinh() + "\nTien su: " + tiensu + "\nChan doan: " + chanDoan;
    }
}

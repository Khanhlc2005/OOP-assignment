public class Truong {
    
    //Attribute
    private String ten;
    private String diaChi;
    private String hieuTruong;

    //Constructors
    public Truong(){
        this.ten = "";
        this.diaChi = "";
        this.hieuTruong = "";
    }
    public Truong(String ten, String diaChi, String hieuTruong){
        this.ten = ten;
        this.diaChi = diaChi;
        this.hieuTruong = hieuTruong;
    }

    //Setter
    public void setTen(String ten){
        this.ten = ten;
    }
    public void setdiaChi(String diaChi){
        this.diaChi = diaChi;
    }
    public void sethieuTruong(String hieuTruong){
        this.hieuTruong = hieuTruong;
    }

    //Getter
    public String getTen(){
        return ten;
    }
    public String getdiaChi(){
        return diaChi;
    }
    public String gethieuTruong(){
        return hieuTruong;
    }

    //toString
    public String toString(){
        return "Ten: " + ten + "\nDia chi: " + diaChi + "\nHieu truong: " + hieuTruong;
    }
}

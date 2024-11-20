public class BenhVien {
    
    //Attribute
    private String ten;
    private String diaChi;
    private String giamDoc;

    //Constructors
    public BenhVien(){
        this.ten = "";
        this.diaChi = "";
        this.giamDoc = "";
    }
    public BenhVien(String ten, String diaChi, String giamDoc){
        this.ten = ten;
        this.diaChi = diaChi;
        this.giamDoc = giamDoc;
    }

    //Setter
    public void setTen(String ten){
        this.ten = ten;
    }
    public void setdiaChi(String diaChi){
        this.diaChi = diaChi;
    }
    public void setgiamDoc(String giamDoc){
        this.giamDoc = giamDoc;
    }

    //Getter
    public String getTen(){
        return ten;
    }
    public String getdiaChi(){
        return diaChi;
    }
    public String getgiamDoc(){
        return giamDoc;
    }

    //toString
    public String toString(){
        return "Ten: " + ten + "\nDia chi: " + diaChi + "\nGiam doc: " + giamDoc;
    }
}

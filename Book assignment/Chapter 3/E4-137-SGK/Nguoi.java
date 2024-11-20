public class Nguoi{

    //Attribute
    private String ten;
    private int tuoi;
    private char gioiTinh;

    //Constructors
    public Nguoi(){
        this.ten = "";
        this.tuoi = 0;
        this.gioiTinh = 'M';
    }
    public Nguoi(String ten, int tuoi, char gioiTinh){
        this.ten = ten;
        this.tuoi = tuoi;
        this.gioiTinh = gioiTinh;
    }

    //Setter
    public void setTen(String ten){
        this.ten = ten;
    }
    public void setTuoi(int tuoi){
        this.tuoi = tuoi;
    }
    public void setgioiTinh(char gioiTinh){
        this.gioiTinh = gioiTinh;
    }

    //Getter
    public String getTen(){
        return ten;
    }
    public int getTuoi(){
        return tuoi;
    }
    public char getgioiTinh(){
        return gioiTinh;
    }

    //toString 
    public String toString(){
        return "Ten: " + ten + "\nTuoi: " + tuoi + "\nGioi tinh: " + gioiTinh;
    }
}
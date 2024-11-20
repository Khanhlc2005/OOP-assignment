import java.util.Scanner;
public class SinhVien extends Nguoi{

    //Attribute
    private String lop;
    private String nghanh;
    private Truong truong;

    //Constructors
    public SinhVien(){
        super.setTen("");
        super.setTuoi(0);
        super.setgioiTinh('M');
        this.lop = "";
        this.nghanh = "";
    }
    public SinhVien(String ten, int tuoi, char gioiTinh, String lop, String nghanh){
        super(ten, tuoi, gioiTinh);
        this.lop = lop;
        this.nghanh = nghanh;
    }

    //Setter
    public void setLop(String lop){
        this.lop = lop;
    }
    public void setNghanh(String nghanh){
        this.nghanh = nghanh;
    }

    //Getter
    public String getLop(){
        return lop;
    }
    public String getNghanh(){
        return nghanh;
    }

    //Nhap
    public void nhap(){
        //Scanner
        Scanner sc = new Scanner(System.in);
  
        //Nhap ten, tuoi, gioi tinh
        super.nhap("sinh vien", n);
        //Nhap lop, nghanh
        for (int i = 0; i < n; i++){
            //Lop
            System.out.print("Nhap lop: ");
            lop = sc.nextLine();
            //Nghanh
            System.out.print("Nhap nghanh: ");
            nghanh = sc.nextLine();
        }
        sc.close();
    }

    //toString
    public String toString(){
        truong = new Truong("THPT Minh Khai", "Phu Dien", "Khanh");
        System.out.println(truong.toString());
        return "Ten: " + getTen() + "\nTuoi: " + getTuoi() + "\nGioi tinh: " + getgioiTinh() + "\nLop: " + lop + "\nNghanh: " + nghanh;
    }
}


import java.util.Scanner;

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

    //Nhap
    public void nhap(String tenlop, int n){
        //Scanner
        Scanner sc = new Scanner(System.in);
        //Nhap thong tin
        for (int i = 0; i < n; i++) {
            System.out.println("\nNhập thông tin" + tenlop + "thứ " + (i + 1) + ":");
            //Ten
            System.out.print("Nhap ho va ten: ");
            ten = sc.nextLine();
            //Tuoi
            System.out.print("Nhap tuoi: ");
            tuoi = sc.nextInt();
            //Gioi tinh
            System.out.print("Nhap gioi tinh: ");
            gioiTinh = sc.next().charAt(0);
        }    
        sc.close();
    }
    //toString 
    public String toString(){
        return "Ten: " + ten + "\nTuoi: " + tuoi + "\nGioi tinh: " + gioiTinh;
    }
}
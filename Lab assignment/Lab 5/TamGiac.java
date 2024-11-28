import static java.lang.Math.sqrt;

public class TamGiac extends DaGiac {

    public TamGiac(int[] canh) {
        super(3, canh);
    }

    @Override
    public double chuVi() {
        if (canh[1] + canh[2] > canh[3] || canh[1] + canh[3] > canh[2] || canh[3] + canh[2] > canh[1])
            return canh[1] + canh[2] + canh[3];
        else {
            System.out.println("Error");
            return 0;
        }
    }

    public double dienTich() {
        double p = chuVi() / 2;
        if (canh[1] + canh[2] > canh[3] || canh[1] + canh[3] > canh[2] || canh[3] + canh[2] > canh[1])
            return sqrt(p) * (p - canh[1]) * (p - canh[2]) * (p - canh[3]);
        else {
            System.out.println("Error");
            return 0;
        }
    }

    @Override
    public void inThongTin() {
        System.out.println("Chu vi= " + chuVi());
        System.out.println("Dien tich= " + dienTich());
    }
}

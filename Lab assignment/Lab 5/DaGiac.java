public abstract class DaGiac {
    protected int soCanh;
    protected int[] canh;

    public DaGiac(int soCanh, int[] canh) {
        this.soCanh = soCanh;
        this.canh = canh;
    }

    public int getSoCanh() {
        return soCanh;
    }

    public void setSoCanh(int soCanh) {
        this.soCanh = soCanh;
    }

    public int[] getCanh() {
        return canh;
    }

    public void setCanh(int[] canh) {
        this.canh = canh;
    }

    public abstract double chuVi();

    public void inThongTin() {
        for (int i = 0; i < soCanh; i++)
            System.out.println("Canh " + i + "= " + canh[i]);
    }
}
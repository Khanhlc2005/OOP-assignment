public class E7 {
    public static void main(String[] args) {
        int n = 20;
        long[] fibonacci = new long[n];
        fibonacci[0] = 0;
        fibonacci[1] = 1;

        System.out.println("20 so Fibonacci dau tien:");
        System.out.print(fibonacci[0] + " " + fibonacci[1] + " ");

        // Tinh va in cac so Fibonacci
        for (int i = 2; i < n; i++) {
            fibonacci[i] = fibonacci[i - 1] + fibonacci[i - 2];
            System.out.print(fibonacci[i] + " ");
        }
    }
}
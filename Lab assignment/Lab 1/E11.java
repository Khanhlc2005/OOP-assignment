public class E11 {
    public static void main(String[] args) {
        System.out.println("Bang cuu chuong:");
        // In bang
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
            for (int j = 1; j <= 10; j++) {
                System.out.print(i * j + " ");
            }
            System.out.println();
        }
    }
}
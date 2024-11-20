public class E1 {
    public static void main(String[] args) {
        int a = 5;
        int b = 10;

        System.out.println("Truoc khi hoan doi:");
        System.out.println("a = " + a);
        System.out.println("b = " + b);

        int c = a;
        a = b;
        b = c;

        System.out.println("\nSau khi hoan doi:");
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
}
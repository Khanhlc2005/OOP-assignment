public class Test {
    public static void main(String[] args) {
        ResizableCircle hinhtron = new ResizableCircle(20);
        hinhtron.resize(50);
        System.out.println("Perimeter: " + hinhtron.getPerimeter());
        System.out.println("Area: " + hinhtron.getArea());
    }
}

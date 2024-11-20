public class ResizableCircle extends Circle implements Resizable {

    // Constructor
    public ResizableCircle(double radius) {
        super(radius);
    }

    // Resize method
    @Override
    public void resize(int percent) {
        radius *= (double) (percent) / 100;
    }
}

public class Vehicles implements IVehicle {
    protected String maker;
    protected String model;
    protected double price;

    public Vehicles() {
    }

    public Vehicles(String maker, String model, double price) {
        this.maker = maker;
        this.model = model;
        this.price = price;
    }

    public String getMaker() {
        return maker;
    }

    public void setMaker(String maker) {
        this.maker = maker;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public void input() {
        // Default implementation, to be overridden
    }

    @Override
    public void display() {
        // Default implementation, to be overridden
    }
}
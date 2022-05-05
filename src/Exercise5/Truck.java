package Exercise5;

public class Truck extends Vehicle{

    private double height;

    public Truck(int passengers, boolean crew, int wheels, String dateRegistration, String displacement, double height) {
        super(passengers, crew, wheels, dateRegistration, displacement);
        this.height = height;
    }

    @Override
    public String toString() {
        return "Truck{" +
                "height=" + height +
                '}';
    }
}

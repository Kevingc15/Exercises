package Exercise5;

public class Bicycle extends Vehicle{

    private String brand;

    public Bicycle(int passengers, boolean crew, int wheels, String dateRegistration, String displacement, String brand) {
        super(passengers, crew, wheels, dateRegistration, displacement);
        this.brand = brand;
    }

    @Override
    public String toString() {
        return "Bicycle{" +
                "brand='" + brand + '\'' +
                '}';
    }
}

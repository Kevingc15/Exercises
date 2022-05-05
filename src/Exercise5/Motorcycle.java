package Exercise5;

public class Motorcycle extends Vehicle{

    private double limitSpeed;

    public Motorcycle(int passengers, boolean crew, int wheels, String dateRegistration, String displacement, double limitSpeed) {
        super(passengers, crew, wheels, dateRegistration, displacement);
        this.limitSpeed = limitSpeed;
    }

    @Override
    public String toString() {
        return "Motorcycle{" +
                "limitSpeed=" + limitSpeed +
                '}';
    }
}

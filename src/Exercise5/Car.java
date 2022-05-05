package Exercise5;

public class Car extends Vehicle{

    private boolean doors;

    public Car(int passengers, boolean crew, int wheels, String dateRegistration, String displacement, boolean doors) {
        super(passengers, crew, wheels, dateRegistration, displacement);
        this.doors = doors;
    }

    @Override
    public String toString() {
        return "I am a Car{" +
                "and i have 3 or 5 doors" +
                '}';
    }
}

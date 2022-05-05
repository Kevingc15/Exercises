package Exercise5;

public class Boat extends Vehicle{

    private String nameBoat;

    public Boat(int passengers, boolean crew, int wheels, String dateRegistration, String displacement, String nameBoat) {
        super(passengers, crew, wheels, dateRegistration, displacement);
        this.nameBoat = nameBoat;
    }

    @Override
    public String toString() {
        return "Boat{" +
                "nameBoat='" + nameBoat + '\'' +
                '}';
    }
}

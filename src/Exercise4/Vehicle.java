package Exercise4;

public class Vehicle {

    private int passengers;
    private boolean crew;
    private int wheels;
    private String dateRegistration;
    private String displacement;

    public Vehicle(int passengers, boolean crew, int wheels, String dateRegistration, String displacement) {
        this.passengers = passengers;
        this.crew = crew;
        this.wheels = wheels;
        this.dateRegistration = dateRegistration;
        this.displacement = displacement;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "passengers=" + passengers +
                ", crew=" + crew +
                ", wheels=" + wheels +
                ", dateRegistration='" + dateRegistration + '\'' +
                ", displacement='" + displacement + '\'' +
                '}';
    }

    public void SpeedUp(){
        System.out.println("I am accelerating");
    }

    public void SlowDown(){
        System.out.print("I am slowing down");
    }

}

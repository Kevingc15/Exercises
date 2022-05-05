package Exercise4;


import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String args[]){
        System.out.println("Let's to create 10 vehicles");

        Scanner scan = new Scanner(System.in);
        ArrayList<Vehicle> vehicleList = new ArrayList<>();


        for(int i=0; i<10; i++ ){
            System.out.println("Tell me how many passengers the vehicle have");
            int passengers = scan.nextInt();
            scan.skip("\n");

            System.out.println("Does the vehicle have a crew? 1.Yes. 2.No");
            int resp = scan.nextInt();
            boolean crew = false;
            scan.skip("\n");
            if(resp == 1){
                crew = true;
            }

            System.out.println("How many wheels does the vehicle have?");
            int wheels = scan.nextInt();
            scan.skip("\n");

            System.out.println("Tell me the date of registration");
            String date = scan.nextLine();

            System.out.println("through which environment does it move?");
            String displacement = scan.nextLine();

            Vehicle vehicle = new Vehicle(passengers, crew, wheels, date, displacement);
            vehicleList.add(vehicle);
            System.out.println("Vehicle Registered Successfully");
        }

        vehicleList.forEach(System.out::println);
    }
}

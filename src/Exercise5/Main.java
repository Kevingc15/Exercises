package Exercise5;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args){
        String vehicles[] = new String[]{"1. Car", "2. Motorcycle",
                "3. Bicycle", "4. Truck", "5. Boat"};

        ArrayList<Vehicle> vehicleList = new ArrayList<>();
        Scanner scan = new Scanner(System.in);

        for(int i=0; i<10; i++ ){
            System.out.println("Tell me how many passengers the vehicle have?");
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

            System.out.println("Select the type vehicle you want to create");

            for(int j = 0; j < vehicles.length; j++){
                System.out.println(vehicles[j] + "");
            }
            int type = scan.nextInt();
            scan.skip("\n");

            switch (type){
                case 1:
                    System.out.println("How many doors have the car? \n" +
                            " 1. 3 doors \n" +
                            " 2. 5 doors");
                    int respt = scan.nextInt();
                    scan.skip("\n");
                    boolean doors = false;
                    if (respt == 1) doors = true;
                    Car car = new Car(passengers, crew, wheels, date, displacement, doors);
                    vehicleList.add(car);
                    break;
                case 2:
                    System.out.println("Tell me the limit speed");
                    double limit = scan.nextDouble();
                    scan.skip("\n");
                    Motorcycle moto = new Motorcycle(passengers, crew, wheels, date, displacement,limit);
                    vehicleList.add(moto);
                    break;
                case 3:
                    System.out.println("Tell me the brand");
                    String brand = scan.nextLine();
                    Bicycle bic = new Bicycle(passengers, crew, wheels, date, displacement, brand);
                    vehicleList.add(bic);
                    break;
                case 4:
                    System.out.println("What is the height of the truck?");
                    double height = scan.nextDouble();
                    scan.skip("\n");
                    Truck truck = new Truck(passengers, crew, wheels, date, displacement, height);
                    vehicleList.add(truck);
                    break;
                case 5:
                    System.out.println("What is the name of the boat?");
                    String name = scan.nextLine();
                    Boat boat = new Boat(passengers, crew, wheels, date, displacement, name);
                    vehicleList.add(boat);
                    break;
            }

            System.out.println("Vehicle Registered Successfully");
        }

        vehicleList.forEach(System.out::println);

    }
}

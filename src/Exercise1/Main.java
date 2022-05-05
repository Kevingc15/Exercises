package Exercise1;

import java.util.*;

public class Main {

    public static void main(String args[]){
        ArrayList<SpaceOjbect> spaceList = new ArrayList<>();

        Sun sun = new Sun(1, 21.545, 5432*10, "The Sun");
        Planet planet = new Planet(2, 2151, 123*5, 545524 * 10, "Earth");
        spaceList.add(sun);
        spaceList.add(planet);

        System.out.println(SpaceOjbect.AtractionGravity(sun,planet));


    }

}

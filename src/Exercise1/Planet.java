package Exercise1;

public class Planet extends SpaceOjbect{

    public Planet(int id, double mass, double density, double dinstanceToSun, String name) {
        super(id, mass, density, dinstanceToSun, name);
    }

    @Override
    public String toString() {
        return "Planet{" +
                "mass=" + mass +
                ", density=" + density +
                ", dinstanceToSun=" + dinstanceToSun +
                ", name='" + name + '\'' +
                '}';
    }

}

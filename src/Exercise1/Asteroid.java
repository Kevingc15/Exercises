package Exercise1;

public class Asteroid extends SpaceOjbect{

    public Asteroid(int id, double mass, double density, double dinstanceToSun, String name) {
        super(id, mass, density, dinstanceToSun, name);
    }

    @Override
    public String toString() {
        return "Asteroid{" +
                "mass=" + mass +
                ", density=" + density +
                ", dinstanceToSun=" + dinstanceToSun +
                ", name='" + name + '\'' +
                '}';
    }
}

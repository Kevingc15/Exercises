package Exercise1;

public class Satelite extends SpaceOjbect{
    public Satelite(int id, double mass, double density, double dinstanceToSun, String name) {
        super(id, mass, density, dinstanceToSun, name);
    }

    @Override
    public String toString() {
        return "Satelite{" +
                "mass=" + mass +
                ", density=" + density +
                ", dinstanceToSun=" + dinstanceToSun +
                ", name='" + name + '\'' +
                '}';
    }
}

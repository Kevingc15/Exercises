package Exercise1;

public class Sun extends SpaceOjbect{

    public Sun(int id, double mass, double density, String name) {
        super(id, mass, density, 0, name);
    }

    @Override
    public String toString() {
        return "Sun{" +
                ", mass=" + mass +
                ", density=" + density +
                ", dinstanceToSun=" + 0 +
                ", name='" + name + '\'' +
                '}';
    }
}

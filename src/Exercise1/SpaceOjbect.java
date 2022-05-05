package Exercise1;

public abstract class SpaceOjbect {
    protected int id;
    protected double mass;
    protected double density;
    protected double dinstanceToSun;
    protected String name;

    public SpaceOjbect(int id, double mass, double density, double dinstanceToSun, String name) {
        this.id = id;
        this.mass = mass;
        this.density = density;
        this.dinstanceToSun = dinstanceToSun;
        this.name = name;
    }

    public static double  AtractionGravity(SpaceOjbect o1, SpaceOjbect o2){
       double globalGravity = 6.67 * Math.pow(10, -11);
       double distanceBetween = Math.abs(o1.dinstanceToSun - o2.dinstanceToSun);
       return globalGravity * o1.mass * o2.mass / Math.pow(distanceBetween, 2);
    }
}

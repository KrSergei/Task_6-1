package My.Folder;

public class ball extends SolidOfRevolutionM {

    public ball(double radius) {
        super(radius);
    }

    public double getVolume() {
        return  4 / 3 * (Math.PI * (Math.pow(radius, 3)));
    }
}

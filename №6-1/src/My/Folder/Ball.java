package My.Folder;

public class Ball extends SolidOfRevolutionM {

    public Ball(double radius) {
        super(radius);
    }

    public double getVolume() {
        return  4 / 3 * (Math.PI * (Math.pow(radius, 3)));
    }
}

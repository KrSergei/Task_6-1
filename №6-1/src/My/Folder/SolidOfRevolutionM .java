package My.Folder;

abstract class SolidOfRevolutionM extends Shape {

    public SolidOfRevolutionM(double radius) {
        this.radius = radius;
    }

    protected double radius;

    public double getRadius() {
        return radius;
    }
}
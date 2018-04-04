package My.Folder;

public class cilinderVolume extends SolidOfRevolutionM {
    double heightCilinder;

    public cilinderVolume(double radius, double heightCilinder) {
        super(radius);
        this.heightCilinder = heightCilinder;
    }

    public double getVolume() {
        return Math.PI * (Math.pow(radius, 2) * heightCilinder);
    }
}
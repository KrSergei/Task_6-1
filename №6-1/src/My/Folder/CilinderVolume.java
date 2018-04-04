package My.Folder;

public class CilinderVolume extends SolidOfRevolutionM {
    double heightCilinder;

    public CilinderVolume(double radius, double heightCilinder) {
        super(radius);
        this.heightCilinder = heightCilinder;
    }

    public double getVolume() {
        return Math.PI * (Math.pow(radius, 2) * heightCilinder);
    }
}
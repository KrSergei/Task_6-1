package My.Folder;

class Pyramid extends Shape {
    double heightPyramid;
    double sideA;
    double sideB;

    public Pyramid(double heightPyramid, double sideA, double sideB) {
        this.heightPyramid = heightPyramid;
        this.sideA = sideA;
        this.sideB = sideB;
    }

    public double getVolume() {
        return  1 / 3 * ((sideA * sideB) * heightPyramid);
    }
}
package My.Folder;

class pyramid extends Shape {
    double heightPyramid;
    double sideA;
    double sideB;

    public pyramid(double heightPyramid, double sideA, double sideB) {
        this.heightPyramid = heightPyramid;
        this.sideA = sideA;
        this.sideB = sideB;
    }

    public double getVolume() {
        return (double) 1 / 3 * ((sideA * sideB) * heightPyramid);
    }
}
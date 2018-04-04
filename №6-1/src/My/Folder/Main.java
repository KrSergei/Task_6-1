package My.Folder;

public class Main {

    public static void main(String[] args) {

        Shape pyramid = new Pyramid(1.5, 2.7, 5);
        System.out.println(pyramid.getVolume());
        Shape  cilinderVolume = new CilinderVolume( 1.5, 2);
        System.out.println(cilinderVolume.getVolume());
        Shape  ball = new Ball(1.5);
        System.out.println(ball.getVolume());
    }
}
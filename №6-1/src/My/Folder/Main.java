package My.Folder;

public class Main {

    public static void main(String[] args) {

        Shape pyramid = new pyramid(1.5, 2.7, 5);
        System.out.println(pyramid.getVolume());
        Shape  cilinderVolume = new cilinderVolume(1.5, 2);
        System.out.println(cilinderVolume.getVolume());
        Shape  ball = new ball(1.5);
        System.out.println(ball.getVolume());
    }
}
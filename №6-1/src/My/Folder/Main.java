package My.Folder;

public class Main {

    public static void main(String[] args) {

        Shape Pyramid = new Pyramid(4.5, 2, 4);
        System.out.println(Pyramid.getVolume());
        Shape  CilinderVolume = new  CilinderVolume(1.5, 2);
        System.out.println(CilinderVolume.getVolume());
        Shape  Ball = new  Ball(1.5);
        System.out.println(Ball.getVolume());
    }
}
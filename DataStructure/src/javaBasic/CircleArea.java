package javaBasic;

public class CircleArea {

    public static void main(String[] args) {
        final double PI = 3.14;

        double radius = 10;
        double area = radius * radius * PI;

        double width = 10;
        double height = 15;

        double rectArea = width * height;

        System.out.println(area);
        System.out.println(rectArea);

    }

}

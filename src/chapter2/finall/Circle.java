package chapter2.finall;

public class Circle {
    final static double PI = 3.14159;
    final double radius; // 내부변경 막기 위해서

    Circle(double radius){
        this.radius = radius;

    }

    Circle changeRadius(double newRadius){
        return new Circle(newRadius);
    }
}

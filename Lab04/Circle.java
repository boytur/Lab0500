package Lab04;

public class Circle {
    protected double radius;
    public Circle(){
        radius = 0;
    }
    public Circle(double radius){
        this.radius = radius;
    }
    public double getRadius() {
        return this.radius;
    }
    public double getArea(double radius){
        return Math.PI*radius*radius;
    }
    public double getCircle(double radius) {
        return 2 * Math.PI * radius;
    }
}

package Lab04;

public class Cylinder extends Circle {
    private double height;
 
    public Cylinder(){
        super();
        height = 0;
    }
 
    public  Cylinder (double radius,double height){
        super(radius);
        this.height = height;
    }
 
    public double getAreaCylinder(double height){
        return (2*Math.PI*radius*height)+(2*Math.PI*radius*radius);
    }
 
    public double getVolumeCylinder(double height){
 
        return Math.PI*radius*radius*height;
    }
}

package Lab04;
import java.util.Scanner;;
public class TestCylinder  {
    public static void main(String[] args) {
        Scanner inputFromUser = new Scanner(System.in);
 
        int radius = inputFromUser.nextInt();
        int heigth = inputFromUser.nextInt();
 
        Circle cTest = new Circle(radius);
 
        double keep = cTest.getCircle(radius);
        double keep_2 = cTest.getArea(radius);
        System.out.printf("Area of circle : %.2f \n",keep_2);
        System.out.printf("Circumfrence : %.2f \n",keep);
 
        Cylinder cyTest = new Cylinder(radius,heigth);
 
        double keepCy = cyTest.getAreaCylinder(heigth);
        double keepCy2 = cyTest.getVolumeCylinder(heigth);
        System.out.println();
        System.out.printf("Area cylinder : %.2f \n",keepCy);
        System.out.printf("Cylinder volume : %.2f \n ",keepCy2);
    }

}

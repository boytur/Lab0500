package Lab05R;

import java.util.Scanner;

public class TestBox {
    public static void main(String[] args) {

        Scanner kb =new Scanner(System.in);
        
        System.out.print("Enter lenght of R1 : ");
        double lenghtofR1 = kb.nextDouble();
        System.out.print("Enter width of R1 : ");
        double widthofR1 = kb.nextDouble();

        Rectangle R1 = new Rectangle(lenghtofR1,widthofR1);

        System.out.print("Enter lenght of R2 : ");
        double lenghtofR2 = kb.nextDouble();
        System.out.print("Enter width of R2 : ");
        double widthofR2 = kb.nextDouble();

        Rectangle R2 = new Rectangle(lenghtofR2,widthofR2);
        System.out.println(R1.toString());
        System.out.println(R2.toString());

        double r1Area = R1.area();
        double r2Area = R2.area();
        System.out.println("Area of R1 = "+r1Area+" "+"Area of R2 "+r2Area);
        if (r1Area==r2Area){
            System.out.println("R1 is equal to R2");
        }
        else if (r1Area>r2Area){
            System.out.println("R1 is biger than R2");
        }
        else{
            System.out.println("R1 is smaller than R2");
        }
        //Next test 
        System.out.print("Enter [ width, legth, depth ] of B1 : ");
        double widthB1 = kb.nextInt();
        double legthB1 = kb.nextInt();
        double depthB1 = kb.nextInt();

        System.out.print("Enter [ width, legth, depth ] of B2 : ");
        double widthB2 = kb.nextInt();
        double legthB2 = kb.nextInt();
        double depthB2 = kb.nextInt();

        Rectangle b1 = new Rectangle(legthB1,widthB1);
        Box B1 = new Box(b1,depthB1);
        Rectangle b2 = new Rectangle(legthB2,widthB2);
        Box B2 = new Box(b2,depthB2);

        System.out.println(B1.toString());
        System.out.println(B2.toString());

        double b1Volume = B1.volume();
        double b2Volume = B2.volume();

        System.out.println("Volume of B1 = "+b1Volume + " Volume of B2 = "+b2Volume);

        if (b1Volume==b2Volume){
            System.out.println("B1 is equal to B2");
        }
        else if (b1Volume>b2Volume){
            System.out.println("B1 is more space than B2");
        }
        else{
            System.out.println("B1 is little space than B2");
        }
    }
}

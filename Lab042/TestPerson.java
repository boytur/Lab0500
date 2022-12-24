package Lab042;
 
public class TestPerson {
    public static void main(String[] args) {
 
        ParttimeEmployee p1 = new ParttimeEmployee("Som","Sai",50,23);
        p1.information();
        System.out.println();
        Employee p2 = new Employee("chompu","Coj",15000.00);
        p2.information();
    }
}

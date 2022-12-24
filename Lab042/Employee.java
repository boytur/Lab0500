package Lab042;

public class Employee extends Person {
    private double salary ;
    public Employee(){
        super();
        salary = 0;
    }
    public Employee(String firstname, String lastName ,double salary) {
        super(firstname, lastName);
        this.salary = salary;
    }
    public void setSalary(double salary) {
        this.salary = salary;
    }
    public double getSalary() {
        return salary;
    }
    public void information() {
        System.out.println("Name : "+getName());
        System.out.println("salary "+getSalary());
    }
 
}

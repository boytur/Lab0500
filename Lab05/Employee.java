package Lab05;
public class Employee{
    private String empName ;
    private String empNumber ;
    private String hireDate;
    public Employee (){
        empName = "";
        empNumber = "";
        hireDate = "";
    }
    public Employee(String empName, String empNumber, String hireDate) {
        this.empName = empName;
        this.empNumber = empNumber;
        this.hireDate = hireDate;
    }
    public String getEmpName() {
        return empName;
    }
    public String getEmpNumber() {
        return empNumber;
    }
    public String getHireDate() {
        return hireDate;
    }
    public void showInfo(){
        System.out.println("Name : " + getEmpName());
        System.out.println("Number : " + getEmpNumber());
        System.out.println("Date : " + getHireDate());
    }
}
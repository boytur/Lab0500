package Lab042;

public class ParttimeEmployee extends Person {
    private int hourWork ;
    private int rate ;
 
    public ParttimeEmployee(){}
    public ParttimeEmployee(int hourWork, int rate) {
        this.hourWork = hourWork;
        this.rate = rate;
    }
    public ParttimeEmployee(String firstname, String lastName, int hourWork, int rate) {
        super(firstname, lastName);
        this.hourWork = hourWork;
        this.rate = rate;
    }
    public double getMoney (){
        return hourWork*rate;
    }
    public void information() {
        System.out.println("Name : "+getName());
        System.out.println("salary "+getMoney());
    }
}

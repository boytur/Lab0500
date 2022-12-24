package Lab05;

public class ProductionWorker extends Employee {
    private String shiff;
    private  Double hourPerate;

    public ProductionWorker(){
        super();
        shiff = "";
        hourPerate = 0.0;
    }
    public ProductionWorker(String shiff, Double hourPerate) {
        this.shiff = shiff;
        this.hourPerate = hourPerate;
    }
    public ProductionWorker(Employee e, String shiff, Double hourPerate) {
        super(e.getEmpName(),e.getEmpNumber(),e.getHireDate());
        this.shiff = shiff;
        this.hourPerate = hourPerate;
    }
    
    public String getShiff() {
        return shiff;
    }
    public void setShiff(String shiff) {

        this.shiff = shiff;
    }
    public Double getHourPerate() {
        return hourPerate;
    }
    public void setHourPerate(Double hourPerate) {
        this.hourPerate = hourPerate;
    }
    public void showInfo(){
        super.showInfo();
        System.out.println("Shift : " + getShiff());
        System.out.println("Rate : "+ getHourPerate());
        
    }
}

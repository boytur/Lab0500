package Lab040;
 
/*65160340
 * Piyawat Wongyat
*/
public class Pet {
    protected String name ;
    protected double weight ;
    public Pet (){
    }
    public Pet(String name, double weight) {
        this.name = name;
        this.weight = weight;
    }
    public void eat (){
        System.out.println("I can eat ");
    }
    public double getWeight (){
        return this.weight;
    }
    public void setWeight(double weight){
        this.weight = weight;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
}

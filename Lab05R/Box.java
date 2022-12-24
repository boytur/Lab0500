package Lab05R;

public class Box extends Rectangle {
    double depth ;
    public Box(){}
    public Box(Rectangle r ,double depth){
        super(r.getLenght(),r.getWidth());
        this.depth = depth;
    }
    
    public void setDimension(Rectangle r ,double depth){
        this.lenght = r.getLenght();
        this.width = r.getWidth();
        this.depth = depth;
    }
    public double getDepth() {
        return depth;
    }
    public double volume (){
        return width*lenght*depth;
    }
    public double surface (){
        return 2*width*lenght+2*lenght*depth+2*width*depth;
    }
    public String toString (){
        return "Box : "+getWidth()+" length = "+getLenght()+" depth = "+getDepth();
    }
}

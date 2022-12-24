package Lab05R;


public class Rectangle {
    Double lenght ;
    Double width ;
    public Rectangle(){}
    public Rectangle(Double lenght, Double width) {
        this.lenght = lenght;
        this.width = width;
    }
    public void  setDimession(double lenght , double width){
        this.lenght = lenght;
        this.width = width;
    }
    public Double getLenght() {
        return lenght;
    }
    public Double getWidth() {
        return width;
    }
    public double area(){
        return lenght*width;
    }
    public double surface(){
        return 2*width + 2*lenght;
    }
    public String  toString (){
        return "Ractangle width = "+getWidth()+" "+ "length = "+getLenght();
    }
}

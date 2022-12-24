package Lab040;

public class TestPet {
    public static void main (String [] args){
        dog d1 = new dog("Buck",50.6);
        System.out.println(d1.getName());
        System.out.println(d1.getWeight());
        d1.rong();
        System.out.println();
        Cat c1 = new Cat ("Chompu",56.3);
        System.out.println(c1.getName());
        System.out.println(c1.getWeight());
        c1.rong();

    }
}
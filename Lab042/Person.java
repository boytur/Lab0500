package Lab042;

public class Person {
    protected String firstname ;
    protected String lastName ;
    public Person(){
 
    }
    public Person(String firstname, String lastName) {
        this.firstname = firstname;
        this.lastName = lastName;
    }
    public String getName (){
        return firstname + " " + lastName;
    }

}

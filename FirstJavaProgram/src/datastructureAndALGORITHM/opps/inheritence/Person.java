package opps.inheritence;

public class Person {
    protected  String name;

    public Person() {

    }

    public void walk(){
        System.out.println(name+" is walking");
    }

    public void eat(){
        System.out.println(name+" is eating");
    }
//  ------------------------------- related with class, not with object
    public static void laughing(){
        System.out.println("person is laughing");
    }
//  -------------------------------
    public Person(String name){
        this.name = name;
        System.out.println("inside person constructoe");
    }
}
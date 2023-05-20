package opps.inheritence;

public class Singer extends Person{

    public Singer(String name) {
        super(name);
    }

    public Singer() {
        super();
    }

    public void sing(){
        super.eat();
        System.out.println(name+" is singing");
    }
//  ------------------------------
    public static void laughing(){
        System.out.println("Singer is laughing");
    }
}

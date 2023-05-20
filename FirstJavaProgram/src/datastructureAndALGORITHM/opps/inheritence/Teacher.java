package opps.inheritence;

public class Teacher extends Person{

    public void teach(){
        System.out.println(name+" is teaching");
    }
//  -----------------------------------------
    public static void laughing(){
        System.out.println("Teacher is laughing");
    }
//  ----------------------------------------
    public Teacher(String name){
        super(name);
        System.out.println("inside teacher constructoe");
    }
}

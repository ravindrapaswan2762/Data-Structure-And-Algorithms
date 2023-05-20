package opps.encapsulation;

public class Student {

    private int age;
    private String name;

//  use getter and setters method
    public int getAge(){
        return age;
    }
    public void setAge(int age){
        if (age>20){
            System.out.print("You are to old to be an student in our nursery schhol ");
        }
        else {
            this.age = age;
        }

    }
}

package opps.packages.models;

// this class is connected with AnotherClass.java named,

public class Student {

    public String name;

    public Student(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    private String getPassword(){
        return  "Student_pass@12345";
    }


}

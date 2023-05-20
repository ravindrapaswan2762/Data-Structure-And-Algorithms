package opps;

public class MyConstructor {
    public static void main(String[] args) {
        MyConstructor obj = new MyConstructor();
        Vehicle car = new Vehicle();
        System.out.println(car .wheels+" wheels");
    }

//  NO ARGUMENT constructer------------------------
    MyConstructor(){
        System.out.println("Object is now created");
    }
    static class Vehicle{
        int wheels;
        Vehicle(){
            wheels = 4;
        }
    }

}


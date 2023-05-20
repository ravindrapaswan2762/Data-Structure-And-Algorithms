package opps.polymorphism;

public class MainClass {
    public static void main(String[] args) {
//        Animal-->Pet-->Dog

//        POLYMORPHISM - MORE THAN ONE FORM
//                       polymorphism allow us to perform a single action in different way.
//                       in other words, polymorphism allow you to define one interface and have
//                       multiple implementation

//      RUN TIME POLYMORPHISM
        Dog d = new Dog();
        Pet p = d;
        Animal a = d;
//
//        d.walk();
//        p.walk();

//        greeting();
//        greeting("good mornig");
//        greeting("good mornig", 5);

//        Variables is not overwritted but methods is overwritted
        System.out.println(p.name);
        System.out.println(d.name);

    }
//     COMPILE TIME POLYMORPHISM
    public static void greeting(){
        System.out.println("Hi, there");
    }
    public static void greeting(String s){
        System.out.println("Hello, there");
    }
    public static void greeting(String s, int count){
        for (int i =0; i<count;  i++){
            System.out.println("s");
        }
    }
}

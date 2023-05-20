package datastructureAndALGORITHM.CNCP.OppsCNCP;

class Cat{

//    (1) CLASSES AND OBJECTS:
//    (2) ACCESS MODIFIERS : PRIVATE --> ACCESEBLE UDER ONLY CLASS,
//                       DEFAULT--> ACCESEBLE UDER ONLY PACKAGE,
//                       PROTECTED --> ACCESEBLE UDER ONLY CHILD CLASSES,
//                       PUBLIC --> ACCESEBLE EVERYWHERE,
//    (3) GETTER AND SETTER: for reset and getting value
//    (4) THIS KEYWORD: for current object.
//    (5) CONSTRUCTORS: for putting value in properties.
//    (6) FINAL KEYWORD: SET ONLY ONCE WITH CAPITAL LETTER VARIABLE_NAMES.
//    (7) PROTECTED: can accessible Outsite the packege but through with extended/child class.
//    (8) STATIC KEYWORD: belongs to class instead of object. static func contains only static properties/variables.


//    (9)THERE FOUR OOPS concept/components :
//                 ABSTRACTION-> Abstraction means showing only necessary details to the user(ex: i/o).
//                               and abstract method uncomplete itself for further implementation.
//                 INCAPSULATION-> Encapsulation is hiding of data from outside world
//                 POLYMORPHISM-> One thing can capable of taking multiple form.
//                 INHERITANCE-> Inheritance is acquiring properties of other class.
//    (10)FUNCTION OVERLOADING:
//    (11) Super Key: when parent and child class have same prop/func then it used for calling parent prop/func.
//    (12) Inheritance and Constructor:
//    (13) Class cast and Object Class: ??
//    (14) Exception Handling: (1)Error: some hardware failed  (2) Unchecked: throw Uneccepted error  (3) checked: throw eccepted error

//    (15) Abstract Keyword and Objects: Abstract class cant create any objects b/c it's showing uncompleteness.
//    (16) Abstract and Inheritance Chain:
//    (17) Interface: it is pure abstract Means it has abstract-methods only instead of non-abstract method.
//    (18) Interface and Inheritance: declared variables in interface will be public final static bydefault.
//                -> Interfaces cant create obj. but its create refrence and contain those obj. of class
//                   that are implementing of refrence.
//                -> class is extended by other class and Interface is implemented by other class.
//                -> A class can't extend more than one class but its implement more than one interfaces.
//    (19) Generics: A class of Pair<T>. and its save us time to creat diff-diff class.
//    (20) Chained generic pairs:
//    (21) Generics methods:
//    (22) Bounded Generics:


    //  Here is some type of states(properties)--------------------------------------------------
    boolean hasFur;
    String color, breed;
    int legs, eyes;

    public void description(){
        System.out.println("My cat has "+legs+ " legs and "+eyes+" eyes");
    }

//  Here is some Behaviours, Using Methods(Functions)----------------------------------------
    public void walk(){
        System.out.println("Cat is walking");
    }
    public void eat(){
        System.out.println("Cat is eating");
    }
}
class Dog{
    String breed, name;
    public void jump(){
        System.out.println("My dog "+name+" jumped");
    }
    public void description(){
        System.out.println("My dog name is "+name+"and it's breed is "+breed);
    }
}

public class MainClass {
    public static void main(String[] args) {
//   CLASS - each class have properties(states), Behaviours, objects

//      Here is some type of Objects like(Cat,Dog), all objects stored in heep memory, class not stored anywhre
//        Cat cat1 = new Cat();
//        Cat cat2 = new Cat();
//        Cat cat3 = new Cat();

        Dog dog1 = new Dog();     dog1.name=" Poddle "; dog1.breed = "husky";
        Dog dog2 = new Dog();     dog2.name=" Browny "; dog2.breed = "German leoperd";
        Dog dog3 = new Dog();     dog3.name=" Max "; dog3.breed = "bull Dod";



//        cat3.legs = 3; cat3.eyes = 2;

//      and playing with behaviours----------------------------------------
//        cat1.walk();
//        cat2.eat();

//      Playing with properties(states)------------------------------------
//        cat3.description();
        dog1.description();
        dog2.jump();




    }
}

package opps.abstraction;

public class MainClass {


    public static void repairCar(Car car){
        System.out.println("car is repaired");
    }

    public static void main(String[] args) {
//        ABSTRACTION :- reduce of complexity,
//                       (1) data abstraction is the process of hiding certain details and showing only
//                           essential information to the user.
//                       (2) abstraction can be achieved with either abstract classes or interfaces.


        WagnoR wagnor;
        wagnor = new WagnoR() {

            @Override
            public void accelerate() {

            }
        };
        Audi audi = new Audi();

        repairCar(wagnor);
        repairCar(audi);

    }
}
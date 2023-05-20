package opps;

import opps.NestingClass.B;
import opps.NestingClass.C;

public class StaticKeyword {

    static{
        System.out.println("in block 1");
    }
    static{
        System.out.println("in block 2");
    }

    public static void main(String[] args) {

        System.out.println("main method is running..");

//  STATIC BELONGS TO CLASS NOT TO OBJECT
        System.out.println(Math.PI);
        System.out.println(Math.max(12, 45));
        System.out.println(Math.asin(90));
        System.out.println(Math.log(10));
        System.out.println(Math.floor(3.1452));
        System.out.println(Math.ceil(3.15));


//      Accessing static and non-static classes from NestingClasses.java
        NestingClass obj_1 = new NestingClass();
        B obj_B = obj_1.new B();
        C obj_C = new C();



    }
    static{
        System.out.println("in block 3");
    }
}

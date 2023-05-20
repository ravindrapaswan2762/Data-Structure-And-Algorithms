package com.company;

public class ExceptionHandling {


    public static void main(String[] args) {
        fun4();
//        try {
//            Thread.sleep(1000);
//         ----------------------------
//            int a = 5;
//            int b = 0;
//
//            int c = a/b;
//            System.out.println(c);
//          ---------------------------
//            int[] arr = new int[5];
//            System.out.println(arr[6]);
//          ----------------------------

//        }catch (ArithmeticException e){
//            System.out.println(e.getMessage()+" occurred, please check your code.");
//        }catch (ArrayIndexOutOfBoundsException e){
//            System.out.println("index should be in the range of 0 to size of array.");
//        }catch (IllegalArgumentException e){
//            System.out.println("check your casting carefully");
//        }finally {
//            System.out.println("Sorry for the inconvenience");
//        }

//        System.out.println("very important code");
//        System.out.println("need to run");
//    --------------------------------------------------------------------
//        fun1();
        fun2();
    }

    static void fun1(){
        int a = 5;
        int b = 0;

        int c = a/b;
        System.out.println(c);

    }
//    ------------------------------------ THROW KEYWORD
    static void fun2(){
        int x = 5;
        int y = 3;

        int z = x/y;
        System.out.println(z);

//        boolean isDanger = true;
//        if (isDanger){
//            throw new ArrayIndexOutOfBoundsException("Danger was comming");
//        }
//        --------------------------------
        try {
            fun3();
        }catch (Exception e){
            System.out.println(e.getMessage()+" occurred");
        }
    }
//  ----------------------------------------------------------
    static void fun3() throws ArrayIndexOutOfBoundsException{
        boolean isDanger = true;
        if (isDanger){
            throw new ArrayIndexOutOfBoundsException("Danger was comming");
        }
    }


// ###############################################################################

    static void fun4(){
        int a = 10;
        int b = 2;

        int c = a/b;
        System.out.println(c);
        try {
            Thread.sleep(5000);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }

}

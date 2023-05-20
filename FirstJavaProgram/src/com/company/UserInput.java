package com.company;

import java.util.Scanner;

public class UserInput {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

//        int x = sc.nextInt();
//        double y = sc.nextDouble();
//        float z = sc.nextFloat();

//        System.out.println(x);
//        System.out.println(y);
//        System.out.println(z);

//        String hello = sc.nextLine();
//        System.out.println(hello);
        System.out.println("Enter Principal : ");
        int principal = sc.nextInt();
        System.out.println("Enter Rate : ");
        float rate = sc.nextFloat();
        System.out.println("Enter Time(month) : ");
        int time = sc.nextInt();

        float Simple_Interest = (principal * rate * time)/100;

        System.out.println("Simple Interest Is : " + Simple_Interest);

    }
}

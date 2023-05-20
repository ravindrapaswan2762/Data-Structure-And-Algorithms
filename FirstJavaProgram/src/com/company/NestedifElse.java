package com.company;

import java.util.Scanner;

public class NestedifElse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any three no., one by one : ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int result = 0;

        if (a>b){
            if (a>c){
                result = a;
                System.out.println(" "+a+", "+b+", "+c+" ");
                System.out.println("The greater no. is " + result);
            }else {
                result = c;
                System.out.println(" "+a+", "+b+", "+c+" ");
                System.out.println("The greater no. is " + result);
            }
        }else {
            if(b>c){
                result = b;
                System.out.println(" "+a+", "+b+", "+c+" ");
                System.out.println("The greater no. is " + result);

            }else{
                result = c;
                System.out.println(" "+a+", "+b+", "+c+" ");
                System.out.println("The greater no. is " + result);
            }
        }
//   OR using ternary operator for short line(a:c that means, return a else return c)
//        result = a>b? a>c? a:c : b>c? b : c;
//        System.out.println("The greater no. is " + result);




    }
}

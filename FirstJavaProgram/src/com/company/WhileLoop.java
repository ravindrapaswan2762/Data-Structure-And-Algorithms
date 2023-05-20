package com.company;

import java.util.Scanner;

public class WhileLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int temp = n;
//        int sum = 0;
//        while (temp>0){
//            int LastDigit = temp%10;
//            temp = temp/10;
//            sum += LastDigit;
//
//
//        }
//     # to find Number0fDigits in given number
//     # int Number0fDigits = (int)Math.log10(n) + 1;

//        System.out.println("The sum of digits of "+ n + " is "+ sum);

//  ############################ PALINDROME OR NOT ##########################################
//  # EX:- 121, 1235321, 141, 12921 etc.
//  # to find reverse no., ex:- 235,---> find last and second last no.,one by one,
//  # then 5*10+3=53, then 53*10+2 = 532 = reversed
        int n = sc.nextInt();
        int temp = n;
        int reversed = 0;
        while (temp > 0){

            int LastDigits = temp %10;
            temp /= 10;
            System.out.println(LastDigits+" ");

            reversed = reversed * 10 + LastDigits;

        }
        if (reversed == n){
            System.out.println(n +" is a palindrome");
        }
        else {
            System.out.println(n +" is not palindrome");
        }





    }
}

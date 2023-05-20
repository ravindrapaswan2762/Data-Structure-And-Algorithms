package com.company;

import java.util.Scanner;

public class SwichCase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter first no. : ");
        int a = sc.nextInt();

        System.out.println("Enter second no. : ");
        int b = sc.nextInt();

        System.out.println("Enter Operation : ");
        sc.nextLine();
        int operation = sc.nextLine().charAt(0);

        int result = 0;

        switch (operation){
            case '+':
                result = a + b;
                break;
            case '-':
                result = a - b;
                break;
            case '/':
                result = a / b;
                break;
            case '*':
                result = a * b;
                break;
            default:
                System.out.println("Operation Symbol Error !");
        }
        System.out.println("The result is : " + result);
//############################################################################################
        System.out.println("Enter your rating : ");
        int rating = sc.nextInt();
        switch (rating){
            case 1:
            case 2:
                System.out.println("Bad review !");
                break;
            case 3:
                System.out.println("Average review !");
                break;
            case 4:
            case 5:
                System.out.println("Good review !");
                break;
        }

    }
}

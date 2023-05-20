package com.company;

import java.util.Scanner;

public class IfCondition {
    public static void main(String[] args) {
        int criteria  = 18;
        int old = 50;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your age : ");
        int age = sc.nextInt();

        if (age >= criteria & age <= old ){
            System.out.println("You can drive the car");
        }


        else if (age > 110){
            System.out.println("Rest In Peace !");
        }

        else{

            System.out.println("You can not drive the car");
        }
//  ###########################################################################################System.out.println("You can not drive the car");
        System.out.println("Enter your grade : ");
        int grade = sc.nextInt();
        if (grade == 10 || grade == 12){
            System.out.println("You can give board exame");
        }
        else if (!(grade == 10 || grade == 12)){
            System.out.println("You can not give board exame");
        }

    }
}

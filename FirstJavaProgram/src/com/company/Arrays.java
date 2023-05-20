package com.company;

import java.util.Scanner;

public class Arrays {
    public static void main(String[] args) {
//        int[] marks = new int[size];
//        -----------OR-------------------
//        int[] marks;
//        marks = new int[10];
//        --------------------------------
//        int[] marks = new int[5];
//        System.out.println(marks[4]);

//        int age[] = {5, 10, 15, 20, 30};
//        double rate[] = {10.25, 25.145, 3.1456};
//        rate[2] = 12.23;
//        System.out.println(rate[2]);
//        --------------------------------
//        for (int i=0; i<age.length; i++){
//            System.out.println(age[i]);
//        }
//------------------------------- question. Averge marks of student --------------------------------
        Scanner sc = new Scanner(System.in);
        System.out.println("Entee student range : ");
        int n = sc.nextInt();

        int[] marks = new int[n];

        System.out.println("Enter the marks now : ");
        for (int i = 0; i < n; i++) {
            marks[i] = sc.nextInt();
        }
        int sum0fMarks = 1;
        for (int i = 0; i < n; i++) {
            sum0fMarks = sum0fMarks * marks[i];
        }
        System.out.println(sum0fMarks);
//        int AverageMarks = sum0fMarks / n;
//        System.out.println("Average marks : " + AverageMarks);



    }


}

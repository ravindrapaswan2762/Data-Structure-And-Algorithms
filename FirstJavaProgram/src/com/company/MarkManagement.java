package com.company;

import java.util.Scanner;

public class MarkManagement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int TotalMarks = 0;

        System.out.println("Enter the no. of student : ");
        int size = sc.nextInt();
        int[] a = new int[size];

        System.out.println("Enter the student marks : ");
        for (int i=0; i<size; i++){
            a[i] = sc.nextInt();
        }
//  -------------------- now starting Sorting algorithm ------------------------
        boolean sorted = true;
        for (int i=0; i<size-1; i++){
            for (int j=0; j<size-1; j++){

//  ------------- compare right_index element with left_index and swap
                if(a[j+1] < a[j]){
                    int temp = a[j+1];
                    a[j+1] = a[j];
                    a[j] = temp;
                    sorted = false;
                }
//  -----------------------------------------------------------------
            }
            if (sorted){
                break;
            }
        }
        System.out.print("The maximum Mark is : "+ a[size-1]);
//  ___________________________________________________________________ Now finding average
        System.out.println();
        for (int i=0; i<size; i++){
            TotalMarks = TotalMarks + a[i];
        }
        int average = 0;
        average = (TotalMarks)/size;

        System.out.println("Everage Marks Is : "+average);




    }
}

package com.company;

public class ContinueStatment {
    public static void main(String[] args) {
        for(int i=1; i<=100; i++){

//          it skipped these criteria and continue
            if(i>30 && i<70){
                continue;
            }
            System.out.print(i+", ");
        }
    }
}

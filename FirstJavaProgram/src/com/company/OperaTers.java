package com.company;

public class OperaTers {
    public static void main(String[] args) {
        //        Arithmatic Operaters
        int a = 5;
        int b = 6;
        int c = a*a + b*b + 2*a*b;
        System.out.println(c);

        int x = a++;
        int y = b--;
        System.out.println(x+" " +a);
        System.out.println(y+" " +b);

//        BITWISE OPERATERS(ex:-0100101)
        int z = a & b;
        System.out.println("Bitwise Operater Is : " + z);

//        Shifting Right(value decrease by half each step) 0110 -> 0011 -> 0001 -> 0000 -> 0000
        int m = a >> 1;

        System.out.println("Shifting Right BY One Is : " + m);
// CONDITIONAL OPERATERS
//        ==, !=, >, <, =<, >=, &&(logical AND - check one condition),
//        &(bitwise AND - check both condition), ||(logical OR), |(bitwise OR)

//       ASIGNMENT OPERATERS
//       a += 2;
//       a -= 2;
//       a /= 2;
//       a *= 2;
//       a &= 2; for AND asign
//       a |= 2; for OR asign
//        System.out.println(a);

//        COMPERISION OPERATERS
        int n = 10;
        int k = 12;
        System.out.println(n > k);
    }
}

package datastructureAndALGORITHM.recursion;

public class FindReverseWithRecursion {

    public static void main(String[] args) {

        int num = 9658;

        System.out.print("Reversed Number: ");

        Reverse(num);
    }


     static void Reverse(int num){
        // base condition to end recursive calls
        if (num < 10) {
            System.out.println(num);
            return;
        }

        else {

            // print the unit digit of the given number
            System.out.print(num % 10);

            // calling function again for remaining number others.
            // than unit digit
            num = num/10;
            Reverse(num);
        }
    }
}

package com.company;
import java.time.OffsetDateTime;
import java.util.Scanner;
public class ForLoop {
    public static void main(String[] args) {
// ###########################################################################################
//        for(int i=0; i<=10; i++){
//            System.out.println("Hello World" + i);
//        }
// #################################### 1 to 100 ############################################
//        for(int i=1; i<=100; i++){
//            System.out.println(i);
//        }
// #################################### reverse 100 to 1 ###################################
//        for(int i=100; i>0; i--){
//            System.out.println(i);
//        }
// #################################### table printing ######################################
        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter the no. for table : ");
//        int table = sc.nextInt();
//        for(int i=1; i<=10; i++){
//            System.out.println("--> "+table*i);
//        }
// ################################# sum of n number #########################################
//        System.out.println("Enter no. for printing sum : ");
//        int n = sc.nextInt();
//        int sum = 0;
//        for (int i=1; i<=n; i++){
//            sum = sum + i;
//        }
//        System.out.println("Sum of n Number is : "+sum);
// #################################### factorial printing #####################################
        System.out.println("Enter the no. for factorial : ");
        int n = sc.nextInt();
        int factorial = 1;

        for(int i=n; i>0; i--){
            factorial = factorial * i;
        }
        System.out.println("Factorial no. is : "+ factorial);
//############################### FIBONACCI NUMBER ##########################################
//        System.out.println("Enter the no. for Fibonacii Nunber: ");
//        int n = sc.nextInt();
//        int a = 0;
//        int b = 1;
//        System.out.println(a+" ");
//        System.out.println(b+" ");
//        for (int i=0; i<n-2; i++){
//            int c = a + b;
//            System.out.println(c+" ");
//            a = b;
//            b = c;
//        }
//################################# X to the power y ########################################
//        System.out.println("Enter the x number : ");
//        int x = sc.nextInt();
//
//        System.out.println("Enter the y number : ");
//        int y = sc.nextInt();
//
//        int c = 1;
//
//        for(int i=1; i<=y; i++){
//            c = x * c;
//        }
//        System.out.println(c);
//############################################## PRIME NO. checking  #######################################
//        System.out.println("Enter the number : ");
//        int n = sc.nextInt();
//
//        boolean IsPrime  = true;

//  OR    for(int i = 2; i*i<=n; i++)

//        for(int i = 2; i < n; i++){
//            if (n % i == 0){
//                IsPrime = false;
//                break;
//            }
//        }
//        if (n<2){
//            IsPrime = false;
//        }
//        System.out.println("IsPrime : " + IsPrime);

//####################################  SERIES SUM  #########################################
//      n = 5, ex:- 1/1 + 1/2 + 1/3 + 1/4 + 1/5......1/n
//        System.out.println("Enter the n value of seires : ");
//        int series = sc.nextInt();
//
//        float result = 0;
//        for (float i=1; i<=series; i++){
//            result = result + 1/i;
//        }
//        System.out.println("Sum of the series is " + result);
//##############################################################################################
//      n = 5, ex:-  1/1 - 1/2 + 1/3 - 1/4 + 1/5 -......1/n
//        System.out.println("Enter the n value of seires : ");
//        int series = sc.nextInt();
//        float a = 0;
//        float b = 0;
//        float result = 0;
//        for (float i=1; i<=series; i=i+2){
//            a = a + 1/i;
//        }
//        for (float i=2; i<=series; i=i+2){
//            b = b + 1/i;
//        }
//        result = a - b;
//        System.out.println("Sum of the series is " + result);
// ########### OR ####### OR ######## OR ########## OR ####### OR ########## OR ##########
//        n = 5, ex:- 1/1 - 1/2 + 1/3 - 1/4 + 1/5 -......1/n
        System.out.println("Enter the n value of seires : ");
        int series = sc.nextInt();

        float result = 0;
        for (float i=1; i<=series; i++){
            if(i%2==0){
                result -= 1/i;
            }else {
                result += 1/i;
            }
        }
        System.out.println("Sum of the series is " + result);
    }
}

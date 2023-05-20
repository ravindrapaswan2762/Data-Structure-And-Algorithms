package opps;

public class Methods {
    public static void main(String[] args) {
        int FirstNumber = 34;
        int SecondNumber = 450;

        int Result = max0f(FirstNumber, SecondNumber);
        System.out.println(Result);
        SayHi();
    }


//  making method(function), in public class-------------
    static int max0f(int a, int b) {
        if (a > b){
            return a;
        }else {
            return b;
        }
    }
    static void SayHi(){
        System.out.println("Hi");
        System.out.println("Good Morning");
    }
}

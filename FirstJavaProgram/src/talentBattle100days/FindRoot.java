package talentBattle100days;

import java.util.Scanner;

public class FindRoot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value of a, b and c: ");
        double a = sc.nextInt();
        double b = sc.nextInt();
        double c = sc.nextInt();

        double d = (b*b)-4*a*c;

        double root1;
        double root2;

        if (d>0){
            System.out.println("There are two Real Roots");
            root1 = (-b + Math.sqrt(d)) / (2 * a);
            root2 = (-b - Math.sqrt(d)) / (2 * a);
            System.out.println(root1);
            System.out.println(root2);
        }else if (d==0){
            System.out.println("Roots are equal");
            root1 = root2 = -b / (2 * a);
            System.out.println("root1 = root2 = "+root1);
        }else {
            double r = -b / (2 * a);
            double i = Math.sqrt(-d) / (2 * a);
            System.out.print("No Real Roots "+r);
            System.out.print(", "+i);
        }
    }
}

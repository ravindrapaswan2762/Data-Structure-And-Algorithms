package talentBattle100days;

import java.util.Scanner;

public class areaOfCircle_24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();

        float pi = 3.14f;
        float area = (float) pi*r*r;

        System.out.println(area);
    }
}

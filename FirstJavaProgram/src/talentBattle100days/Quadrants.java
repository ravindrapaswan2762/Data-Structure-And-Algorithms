package talentBattle100days;

import java.util.Scanner;

public class Quadrants {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();
        int y = sc.nextInt();

        if (x>0 && y>0){
            System.out.println("This point lies in first quadrant.");
        }else if (x<0 && y>0){
            System.out.println("This point lies in Second quadrant.");
        }else if (x<0 && y<0){
            System.out.println("This point lies in Third quadrant.");
        }else if (x>0 && y<0){
            System.out.println("This point lies in fourth quadrant.");
        }
    }
}

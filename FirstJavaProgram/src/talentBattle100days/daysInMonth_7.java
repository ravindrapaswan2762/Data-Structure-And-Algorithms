package talentBattle100days;


import java.time.YearMonth;
import java.util.Scanner;

public class daysInMonth_7 {

    public static int getNumberOfDaysInMonth(int year,int month){
        YearMonth yearMonthObject = YearMonth.of(year, month);
        int daysInMonth = yearMonthObject.lengthOfMonth();
        return daysInMonth;
    }

    public static void main(String[] args) {
        // Get number of days in given month of the year
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter month :");
        int month = sc.nextInt();

        System.out.print("Enter year :");
        int year = sc.nextInt();

        int numberOfDaysInMonth1 = getNumberOfDaysInMonth(year, month);
        System.out.println(numberOfDaysInMonth1);

    }

}

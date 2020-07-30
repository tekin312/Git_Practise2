package day12_Switch_Scanner;
import java.util.Scanner;

public class HourRateCalculator {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        /*
         print the hourly rate of the employee
            assume that one year has 52 weeks
            hourRate = salary/ (weeklyHour * 52)

         */

        System.out.println("Enter your salary:");
        double salary=scan.nextDouble();
        System.out.println("How many hours work per week:");
        int weeklyHours=scan.nextInt();
        int totalHours= weeklyHours*52;

        double hourlyRate=salary/totalHours;

        System.out.println("Your hourly rate is: $"+ hourlyRate);


    }
}


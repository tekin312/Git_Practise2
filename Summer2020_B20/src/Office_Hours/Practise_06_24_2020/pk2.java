package Office_Hours.Practise_06_24_2020;

import java.util.*;

public class pk2 {


    public static void main(String[] args) {
        //ENTER CODE HERE
        Scanner input = new Scanner(System.in);

        int itemPrice, change;


        System.out.println("Enter price in cents:");
        itemPrice = input.nextInt();


        if (itemPrice < 25 || itemPrice > 100 || itemPrice % 5 != 0) {
            System.out.println("Invalid price!");
        } else {
            change = 100 - itemPrice;

            int quarters = change / 25;
            int changeAfterQuarters = change % 25;

            int dimes = changeAfterQuarters / 10;
            int changeAfterDimes = changeAfterQuarters % 10;

            int nickels = changeAfterDimes / 5;

            System.out.println("Your change is " + quarters + "quarters, " + dimes + " dimes, and " + nickels + " nickels.");


        }


    }
}
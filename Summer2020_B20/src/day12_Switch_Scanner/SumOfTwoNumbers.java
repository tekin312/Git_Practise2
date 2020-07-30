package day12_Switch_Scanner;

import java.util.Scanner;

public class SumOfTwoNumbers {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
    /*

    2. write a program that can ask user to enter two number,
    and the prints the sum of those two number
            Enter your first number
            10
            Enter your second number
            20

     */
        System.out.println("Enter num1:");
        int num1=scan.nextInt();
        System.out.println("Enter num2:");
        int num2=scan.nextInt();

        int result=num1+num2;
        System.out.println("Sum of those two numbers are: "+ result);


    }


}
package day21_Loops;

public class DoWhile_Practise {

    public static void main(String[] args) {
        int num=1;

        do{
            System.out.print(num+" ");
            num++;

        }while(num<=20);
        System.out.println();
        System.out.print(num);
        System.out.println();/*
    4. write a program that can divide two numbers without using / & % operators and retuns the devision and remainder
            ex:
                input:  10
                        3
                0utput: 3 with a remainder of 1
               10/3 = 3
               10 - 3 = 7
               7 - 3 = 4;
               4 - 3 = 1;
               3/3
               3-3 = 0
 */

        System.out.println("==================");

        char ch='Z';
        do{
            System.out.print(ch+" ");
            ch--;
        }while(ch>='A');

    }
}

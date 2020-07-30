package day19_ForLoop;

import org.w3c.dom.ls.LSOutput;

/*
    3. write a program that can calculate the sum of all the even numbers between 0 ~ 100
    4. write a program that can calculate the sum of all the odd numbers between 0 ~ 100
 */
public class Odd_Even {
    public static void main(String[] args) {


        /*
        sum+= 2;
        sum += 4;
        ...
         */

/*
        for(int i = 0; i <= 100; i += 2 ){
           sumOfEven += i; // sum of all even numbers
        }
  */

        int sumOfEven=0;
        for(int i=0; i<=100; i++){
            if(i % 2==0){
                sumOfEven+=i;
            }
        }
        System.out.println(sumOfEven);

        System.out.println("==============");
          /*
        for(int i = 1; i <= 99; i += 2 ){
            sumOfOdd +=i ; // sumOfOdd = sumOfOdd +i ;
        }
        */
        int sumOfOdd=0;

        for(int i=0;i<=100;i++){
            if(i%2!=0){
                // sumOfOdd=sumOfOdd+i;
                sumOfOdd+=i;

            }
        }
        System.out.println(sumOfOdd);
        System.out.println("=========================");
    }

}

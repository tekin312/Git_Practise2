package Office_Hours;
import java.util.Scanner;
public class pk {



        public static void main(String[] args) {
            //WRITE YOUR CODE HERE:

            Scanner scan=new Scanner(System.in);
            System.out.println("Enter Item1, count and its price:");
            String item1=scan.next();
            int count1=scan.nextInt();
            double price1=scan.nextDouble();

            System.out.println("Enter Item2, count and its price:");
            String item2=scan.next();
            int count2=scan.nextInt();
            double price2=scan.nextDouble();

            System.out.println("Enter Item3, count and its price:");
            String item3=scan.next();
            int count3=scan.nextInt();
            double price3=scan.nextDouble();

            double total1=count1*price1;
            double total2=count2*price2;
            double total3=count3*price3;

            if(count2>0){
                total2=count2*price2;

            }if(count3>0){
                total3 = count3 * price3;

            }

            double total=total1+total2+total3;

            String report=("Item1: "+item1+" Price: "+total1+", Item2: "+item2+" Price: "+total2+",+Item3: "+item3+" Price: "+total3);

            System.out.println(report);
            System.out.println("your total is: $"+total);









        }



    }

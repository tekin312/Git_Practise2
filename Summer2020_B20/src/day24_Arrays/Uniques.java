package day24_Arrays;
import java.util.Scanner;
public class Uniques {
    public static void main(String[] args) {


                Scanner scan = new Scanner(System.in);
                String word = scan.next();
                char ch1=word.charAt(0);
                int lastIn=word.length()-1;
                char ch2=word.charAt(lastIn);
                if (ch1=='x'&& ch2=='X'){
                    System.out.println(word.substring(1,lastIn));
                }else if(ch1=='x'&& ch2!='X'){
                    System.out.println(word.substring(1,lastIn+1));
                }else if(ch1!='x'&& ch2=='X'){
                    System.out.println(word.substring(0,lastIn));
                }else if(ch1=='x'&& ch2=='x'){
                    System.out.println(word.substring(1,(lastIn-1)));
                }else if(ch1=='X'&& ch2=='X'){
                    System.out.println(word.substring(1,(lastIn-1)));
                }else{
                    System.out.println(word);
                }
            }

        }




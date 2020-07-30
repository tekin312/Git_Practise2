package day09_IfStatement;

public class Minimum {
    public static void main(String[] args) {
        /* write a java program that accepts three numbers
        and return the minimum number
            (assume that none of them are equal)
         */
    double a=100;
    double b=200;
    double c=300;

    double min=0;

    boolean aIsMin=a<b && a<c;

    boolean bIsMin=aIsMin==false && b<c;

    //boolean bIsMin=a>b && b<c;

        boolean cIsmin=aIsMin==false && bIsMin==false;

    //boolean cIsmin=c<a && c<b;




    if (aIsMin){
        min=a;


    }
    if(bIsMin){
        min=b;

    }
    if(cIsmin){
        min=c;
    }
        System.out.println(min+" is the minimum number");
    }
}

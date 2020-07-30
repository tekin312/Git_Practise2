package day11_NestedIf_Ternary;

public class Ternary_Practise1 {
    public static void main(String[] args) {

        // second task: "can vote" or "Cannot vote"
        // third task: write a program that can check if two numbers
        // are

        int age=36;
        String citizenship="USA";
        String result="";
        if(age>=18 && citizenship=="USA" ){
            result="Can vote";
        }else{
            result="Cannot vote";
        }
        System.out.println(result);
        String result2=(age>=18 && citizenship=="USA")? "Can vote": "Cannot vote";
        System.out.println(result2);

        System.out.println("===================================================");
        int n1 = 100;
        int n2 = 200;

        String r = (n1 == n2) ? "Equal" : "Not Equal";
        // "equal" or "not equal"

        System.out.println(r);

    }
}

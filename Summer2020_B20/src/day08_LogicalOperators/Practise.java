package day08_LogicalOperators;

public class Practise {
    public static void main(String[] args) {
        int age=19;
        String citizenShip="USA";

        boolean eligibleToVote= age>=18 && citizenShip=="USA";
        System.out.println(eligibleToVote);

        System.out.println("================");

        String firstName="Aaron";
        String lastName="Daniel";
        int age1=19;
        String citizenShip1="USA";

        boolean eligibleToVote1=age1>=18 && citizenShip1=="USA";
        String fullName=firstName+" "+lastName;
        System.out.println(fullName+" is eligible to vote: "+ eligibleToVote1);

    }
}

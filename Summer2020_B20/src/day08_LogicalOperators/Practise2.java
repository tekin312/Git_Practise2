package day08_LogicalOperators;

public class Practise2 {
    public static void main(String[] args) {
        int age=12;
        String citizen1="USA";
        String citizen2="France";
        boolean eligibleAge=age>=18;
                         //12 >=18 ==>false
        boolean usCitizen=citizen1=="USA" || citizen2=="USA";
                       // "USA"=="USA     || "France"=="USA"
                      //      true        ||     false
                    //  true

        boolean eligibleToVote= eligibleAge && usCitizen;


        System.out.println(eligibleToVote);




    }
}

package day06_ComparisonOperators;

public class SalaryCalculator {
    public static void main(String[] args) {
        double rate=50;
        double stateTaxRate=0.04;
        double federalTaxRate=0.2;
        int weeklyHours=45;

        double salary=rate*weeklyHours*52;

        System.out.println(salary);
        double totalTax=salary*(stateTaxRate+federalTaxRate);
        double salaryAfterTax=salary-totalTax;

        System.out.println(salaryAfterTax);
        System.out.println("Salary before tax is: "+"$"+ salary);
        System.out.println("Take home salary is: $"+salaryAfterTax);

    }
}

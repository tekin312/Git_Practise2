package day04_Variables;

import java.security.cert.X509Certificate;

public class CarInfo {
    public static void main(String[] args) {

        /*Year
        Brand
        Model
        Mileage
        Price
        print the info of the car
        output 2020 BMW X5, red, 30000 mileage,45000$
         */
        int year=2020;
        String brand="BMW";
        String model= "X5";
        int mileage=30_000;
        double price=45_000;
        String color="Red";

        System.out.println(year+" "+brand+" " + model+", "+color+", "+mileage+" miles, $"+price);


    }
}
